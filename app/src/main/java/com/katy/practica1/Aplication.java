package com.katy.practica1;

import android.app.Application;
import android.util.Log;

/**
 * Created by Chido on 30/09/2017.
 */

public class Aplication extends Application{
    private static final String TAG = Aplication.class.getName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"Entro a la clase");
    }
}
