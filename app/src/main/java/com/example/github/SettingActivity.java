package com.example.github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void method(){
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
    public void newCommit(){
        
    }
}