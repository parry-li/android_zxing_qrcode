package com.pxl.android_zxinglibrary;

import android.app.Application;

import com.parry.zxing.activity.ZXingLibrary;

/**
 * Created by pxl on 2019.12
 */

public class MApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }
}
