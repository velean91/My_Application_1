package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonTSL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTSL = findViewById(R.id.buttonTSL);

        buttonTSL.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (buttonTSL.equals(view)) {
            int dec = -1;
            EditText editTextDec = findViewById(R.id.editTextDec);
            String decStr = editTextDec.getText().toString();
            if (decStr.length()>0 && decStr.length()<9 )
                dec = Integer.parseInt(decStr);
            if (dec >=0) {
                String bin="";
                while (dec != 0) {
                    if (dec % 2==0)
                        bin = "0" + bin;
                    else
                        bin = "1" + bin;
                    dec = dec / 2;
                }EditText editTextBin = findViewById(R.id.editTextBin);
                editTextBin.setText(bin);
            }
        }
    }}


