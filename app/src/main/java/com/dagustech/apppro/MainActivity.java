package com.dagustech.apppro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String email = getIntent().getStringExtra("email");
        String contrasena = getIntent().getStringExtra("contraseña");
        Toast toast = Toast.makeText(getApplicationContext(),email,6);
        toast.show();
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(MainActivity.this,RegistroActivity.class);
        startActivity(intent);
    }

    public void toLanding(View view) {
        Intent intent = new Intent(MainActivity.this,LandingActivity.class);
        startActivity(intent);
    }
}
