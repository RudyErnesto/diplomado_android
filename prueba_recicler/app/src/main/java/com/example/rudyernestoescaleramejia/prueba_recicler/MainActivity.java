package com.example.rudyernestoescaleramejia.prueba_recicler;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Cemento Coboce", "coboce@correo.com", "512312"));
        lista.add(new Usuario("Monopol", "monopol@correo.com", "4123123"));
        lista.add(new Usuario("JalaSoft", "jalasoft@correo.com", "4124124"));
        lista.add(new Usuario("Viva", "viva@correo.com", "4123123"));

        UserListAdapter userListAdapter = new UserListAdapter(lista);
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.recyclerView.setAdapter(userListAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        this.recyclerView.setLayoutManager(linearLayoutManager);


    }
}

