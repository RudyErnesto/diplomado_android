package com.example.rudyernestoescaleramejia.prueba_recicler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private SessionManager session;
    private TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (TextView)findViewById(R.id.session_user);
        session = new SessionManager(getApplicationContext());

    }

    public void sessionlogin(View view) {
        session.saveUser(username.getText().toString());
        System.out.println(session.getUserName());
        Intent intent = new Intent(this, Main2Activity.class );
        startActivity(intent);
    }
}
