package com.example.administrator.lechengone.adapter;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/2/20.
 */

public class MyApplication extends Application{

//    public static RequestQueue requestQueue;
    private static Context context;

    @Override
    public void onCreate() {
        MyApplication.context=getApplicationContext();
    }
}
