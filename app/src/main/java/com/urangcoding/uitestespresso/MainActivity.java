package com.urangcoding.uitestespresso;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.urangcoding.uitestespresso.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());


        mainBinding.btnSubmit.setOnClickListener(view -> {
            if (mainBinding.inputAlas.getText().toString().isEmpty()) {
                mainBinding.inputAlas.setError(getResources().getString(R.string.txt_alert_input_alas));
                mainBinding.inputAlas.requestFocus();
                return;
            }

            if (mainBinding.inputTinggi.getText().toString().isEmpty()) {
                mainBinding.inputTinggi.setError(getResources().getString(R.string.txt_alert_input_tinggi));
                mainBinding.inputTinggi.requestFocus();
                return;
            }


            double hasil = 0.5 * (Integer.parseInt(mainBinding.inputAlas.getText().toString()) * Integer.parseInt(mainBinding.inputTinggi.getText().toString()));


            mainBinding.hasil.setText(String.valueOf(hasil));
        });
    }
}