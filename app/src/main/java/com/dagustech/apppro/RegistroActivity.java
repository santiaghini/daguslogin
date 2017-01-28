package com.dagustech.apppro;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        TextView registro = (TextView) findViewById(R.id.registro_registro);
        Typeface indieflower = Typeface.createFromAsset(getAssets() , "fonts/IndieFlower.ttf");
        registro.setTypeface(indieflower);
        boolean tablet = getResources().getBoolean(R.bool.tablet);
        if (tablet == true) {
            registro.setTextSize(40);
        } else {
            registro.setTextSize(24);
        }

        registro.setGravity(Gravity.CENTER);
    }
}
