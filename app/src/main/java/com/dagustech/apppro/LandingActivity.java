package com.dagustech.apppro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void registro(View view) {
        Intent intent = new Intent(LandingActivity.this,RegistroActivity.class);
        startActivity(intent);

    }

    public void toMainActivity(View view) {
        EditText email = (EditText) findViewById(R.id.landing_email);
        EditText contrasena = (EditText) findViewById(R.id.landing_contrasena);
        Intent intent = new Intent(LandingActivity.this, MainActivity.class);
        //putExtra es "llevalo a otra activity. get text obtiene un editable, pero necesitamos un string, por eso .toString
        intent.putExtra("email", email.getText().toString());
        intent.putExtra("contraseña", email.getText().toString());
        startActivity(intent);
    }

}
