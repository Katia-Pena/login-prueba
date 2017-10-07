package com.katy.practica1;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        binButterKnife();
        onPrepareToolBar();
        initView();
    }
    @LayoutRes
    protected abstract int getLayoutResID();
    //Aui la vista ya fue creada
    private void binButterKnife(){
        ButterKnife.bind(this);
    }
    protected void initView(){


    }
  //Aqui se configura el toolbar si es que exite el layaut
    private void onPrepareToolBar(){
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");
        if(toolbar!=null){
            setSupportActionBar(toolbar);
        }
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

}
