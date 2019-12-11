package com.pxl.android_zxinglibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * Created by pxl on 2019.12
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

}
