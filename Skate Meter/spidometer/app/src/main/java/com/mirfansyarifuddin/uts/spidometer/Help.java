package com.mirfansyarifuddin.uts.spidometer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.mirfansyarifuddin.uts.spidometer.R;

public class Help extends AppCompatActivity {
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        btnBack = (Button) findViewById(R.id.btn_back_help);
        btnBack.setOnClickListener(new Help.backButton());
    }

    private class backButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            finish();
        }
    }
}

