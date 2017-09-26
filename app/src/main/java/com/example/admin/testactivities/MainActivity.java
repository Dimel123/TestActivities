package com.example.admin.testactivities;

import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Observer<String>{

    TextView tvName;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvName);
        btnNext = findViewById(R.id.btnNext);

        UserData.getInstance().observeForever(this);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });


    }

    @Override
    public void onChanged(@Nullable String s) {
        tvName.setText(s);
    }
}
