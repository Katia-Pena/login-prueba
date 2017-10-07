package com.katy.practica1;

import android.os.Bundle;
import android.support.annotation.StyleRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import butterknife.BindViews;

public class LoginActivity extends BaseActivity {
    Toolbar toolbar;
    private static final String TAG = LoginActivity.class.getName();

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
        initCofigToolbar();
    }
    private void initCofigToolbar(){
        toolbar=getToolbar();
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));

    }
    /**
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"Entro al onCreate");
    }

        Ciclo de vida de una Actividad
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"Entro al onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"Entro al onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"Entro al onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"Entro al onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"Entro al onRestar");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"Entro al onPause");
    }
    **/

}
