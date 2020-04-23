package com.reshamraj.selftestyourhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.reshamraj.selftestyourhealth.Adapter.ChatMessageAdapter;
import com.reshamraj.selftestyourhealth.Model.ChatMessage;

import org.alicebot.ab.AIMLProcessor;
import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.PCAIMLProcessorExtension;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {
    ListView listView;
    FloatingActionButton btnSend;
    EditText editTextMsg;

    ImageView imageView;

    private Bot bot;
    public static Chat chat;

    private ChatMessageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int Permission_All =1;
        ///to tak permissions run time//
        String[] Permissions ={Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE};
        if (!hasPermissions(this, Permissions)){
            ActivityCompat.requestPermissions(this, Permissions, Permission_All);
        }
        setContentView(R.layout.activity_main7);
        listView = findViewById(R.id.listView);
        btnSend = findViewById(R.id.buttonSend);
        editTextMsg = findViewById(R.id.edtTextMessage);
        imageView = findViewById(R.id.imageView);
        adapter = new ChatMessageAdapter(this, new ArrayList<ChatMessage>());
        listView.setAdapter(adapter);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = editTextMsg.getText().toString();

                String response = chat.multisentenceRespond(editTextMsg.getText().toString());

                if (TextUtils.isEmpty(message)) {
                    Toast.makeText(Main7Activity.this, "please enter a querry", Toast.LENGTH_SHORT).show();
                    return;
                }
                senMessage(message);
                botsReply(response);

                editTextMsg.setText("");
                listView.setSelection(adapter.getCount() - 1);
            }
        });
        boolean available = isSDCartAvailable();
        AssetManager assets = getResources().getAssets(); //Environment.getExternalStorageDirectory().getAbsolutePath();
        File filName = new File(Environment.getExternalStorageDirectory().toString() + "/TBC/bots/TBC");
        boolean makeFile = filName.mkdirs();
        if (filName.exists()) {
            //read the line
            try {
                for (String dir : assets.list("TBC")) {
                    File subDir = new File(filName.getPath() + "/" + dir);
                    boolean subDir_Check = subDir.mkdirs();
                    for (String file : assets.list("TBC/" + dir)) {
                        File newFile = new File(filName.getPath() + "/" + dir + "/" + file);
                        if (newFile.exists()) {
                            continue;
                        }
                        InputStream in;
                        OutputStream out;
                        String str;
                        in = assets.open("TBC/" + dir + "/" + file);
                        out = new FileOutputStream(filName.getPath() + "/" + dir + "/" + file);
                        //copy files from assets to the mobile's SD card or any secondary  memory available
                        copyFile(in, out);
                        in.close();
                        out.flush();
                        out.close();
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        MagicStrings.root_path = Environment.getExternalStorageDirectory().toString() + "/TBC";
        AIMLProcessor.extension = new PCAIMLProcessorExtension();

        bot = new Bot("TBC", MagicStrings.root_path, "Chat");
        chat = new Chat(bot);
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;

        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);

        }
    }

    private static boolean isSDCartAvailable() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED) ? true : false;
        //
    }

    private void botsReply(String response) {
        ChatMessage chatMessage = new ChatMessage(false, false, response);
        adapter.add(chatMessage);
        //code late
    }

    private void senMessage(String message) {
        ChatMessage chatMessage = new ChatMessage(false, true, message);
        adapter.add(chatMessage);
        //code later
    }
    /////next is this...to take persmissions run tim
    public static boolean hasPermissions(Context context, String... permissions) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

}
