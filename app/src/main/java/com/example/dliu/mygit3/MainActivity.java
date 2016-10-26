package com.example.dliu.mygit3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate: 新增了一行");
        Log.i("MainActivity", "onCreate: 23");
        Log.i("MainActivity", "onCreate: 432");

    }
}
