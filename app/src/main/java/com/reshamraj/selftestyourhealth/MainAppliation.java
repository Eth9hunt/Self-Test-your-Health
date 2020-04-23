package com.reshamraj.selftestyourhealth;

import android.app.Application;
import android.content.Context;

import com.reshamraj.selftestyourhealth.Helper.LocaleHelper;

public class MainAppliation extends Application {


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base,"en"));

    }
}
