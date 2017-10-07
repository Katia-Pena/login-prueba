package com.katy.practica1;

import android.os.Bundle;
import android.support.annotation.StyleRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {
    private Toolbar toolbar;
    @BindView(R.id.edt_email)
    EditText email;

    @BindView(R.id.edt_password)
    EditText password;

    @BindView(R.id.text_email)
    TextInputLayout textEmail;
    @BindView(R.id.text_password)
    TextInputLayout textPassword;

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

    @OnClick(R.id.btn_entrar)
        public void onClickLogin(){
            if(isValidLogin()){

            }

    }
    private boolean isValidLogin(){
        boolean valid=true;
        textEmail.setError(null);
        textEmail.setErrorEnabled(false);
        textPassword.setError(null);
        textPassword.setErrorEnabled(false);
            if(email.getText().toString().isEmpty()){
                valid=false;
                textEmail.setError(getString(R.string.login_text_error_is_empty_email));
            }if(password.getText().toString().isEmpty()){
                valid=false;
                textPassword.setError(getString(R.string.login_text_error_is_empty_password));
            }
            if (!isEmailValid(email.getText().toString())){
                valid = false;
                textEmail.setError(getString(R.string.login_text_error_is_valid_email));

            }
        return valid;

    }

    private boolean isEmailValid(CharSequence charSequence){
        boolean valid=true;
            if(TextUtils.isEmpty(charSequence)){
                return false;
            }else{
                return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
            }

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
