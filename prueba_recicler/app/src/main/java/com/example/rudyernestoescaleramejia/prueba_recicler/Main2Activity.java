package com.example.rudyernestoescaleramejia.prueba_recicler;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private SessionManager session;
    private TextView nameuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameuser = (TextView)findViewById(R.id.lavel_name);
        session = new SessionManager(getApplicationContext());
        nameuser.setText(session.getUserName());

    }

    public void listaEmpresas(View view) {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void Call(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 412323123123"));
        startActivity(intent);
    }
}
