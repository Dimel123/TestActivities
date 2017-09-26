package com.example.admin.testactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by admin on 26.09.2017.
 */

public class ThirdActivity extends AppCompatActivity {

    Button btnNext;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnNext = findViewById(R.id.btnNext);
        etName = findViewById(R.id.etName);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserData.getInstance().setName(etName.getText().toString());

            }
        });

    }

}
