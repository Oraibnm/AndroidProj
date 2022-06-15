package com.example.androidproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_reg);


    }

    public void LogIn(View view) {
    }

    public void reg_BT(View view) {
        Intent intent = new Intent(login_activity.this,register_activity.class);
        startActivity(intent);
    }


}