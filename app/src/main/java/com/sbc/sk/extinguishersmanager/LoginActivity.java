package com.sbc.sk.extinguishersmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class LoginActivity extends AppCompatActivity {

    EditText idEdittext;
    EditText passwordEdittext;

    Button loginButton;
    Button joinButton;
    Button findButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FirebaseMessaging.getInstance().subscribeToTopic("news");
        FirebaseInstanceId.getInstance().getToken();

        idEdittext = (EditText) findViewById(R.id.edit_id);
        passwordEdittext = (EditText) findViewById(R.id.edit_password);

        loginButton = (Button) findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = idEdittext.getText().toString();
                String password = passwordEdittext.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("id", id);
                intent.putExtra("password", password);

                startActivityForResult(intent, Const.REQUEST_CODE_ALERT);
            }
        });

        joinButton = (Button) findViewById(R.id.btn_join);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "회원가입은 관리자에게 문의하세요.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        findButton = (Button) findViewById(R.id.btn_find);
        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "아이디/비밀번호 찾기는 관리자에게 문의하세요.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
