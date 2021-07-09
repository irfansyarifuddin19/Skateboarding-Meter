package com.mirfansyarifuddin.uts.spidometer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mirfansyarifuddin.uts.spidometer.R;

public class Home extends Activity implements View.OnClickListener {

    Button btnSpeed, btnHelp, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnSpeed = (Button) findViewById(R.id.ButtonSpeed);
        btnHelp = (Button) findViewById(R.id.ButtonHelp);
        btnAbout = (Button) findViewById(R.id.ButtonAbout);

        btnSpeed.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnHelp.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ButtonSpeed:
                Intent speedometer = new Intent(getApplicationContext(), MainActivity.class);
                this.startActivity(speedometer);
                break;
            case R.id.ButtonAbout:
                Intent about = new Intent (getApplicationContext(), About.class);
                this.startActivity(about);
                break;
            case R.id.ButtonHelp:
                Intent help = new Intent(getApplicationContext(), Help.class);
                this.startActivity(help);


        }

    }
}
