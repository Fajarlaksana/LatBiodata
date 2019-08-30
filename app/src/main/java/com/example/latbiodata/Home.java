package com.example.latbiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate (Bundle saveInstanceState){
        Button fajar;
        Button raihan;
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_home);
        fajar = (Button) findViewById(R.id.fajar);
        fajar.setOnClickListener(this);
        raihan = (Button) findViewById(R.id.raihan);
        raihan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fajar:
                Intent laksana = new Intent(Home.this, MainActivity.class);
                startActivity(laksana);
                break;
            case R.id.raihan:
                Intent akbar = new Intent(Home.this, Main2Activity.class);
                startActivity(akbar);
                break;
            default:
                break;
        }
    }
}
