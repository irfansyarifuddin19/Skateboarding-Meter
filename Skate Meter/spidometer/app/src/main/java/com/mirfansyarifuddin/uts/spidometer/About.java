package com.mirfansyarifuddin.uts.spidometer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.mirfansyarifuddin.uts.spidometer.R;

public class About extends AppCompatActivity {
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        btnBack = (Button) findViewById(R.id.ButtonBack);
        btnBack.setOnClickListener(new backButton());
        findViewById(R.id.stiki_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_btn("http://stiki.ac.id/");
            }
        });
    }

    class backButton implements Button.OnClickListener{
        @Override
        public void onClick(View v) {
            finish();
        }

    }
    public void clicked_btn (String url) {
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW);
        launchBrowser.setData(Uri.parse(url));
        startActivity(launchBrowser);
    }
}
