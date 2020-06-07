package com.example.projectapi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.projectapi.R;


public class actRandom extends AppCompatActivity {
    private TextView textRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_random);
    }

    public void OnShowRandom(View view) {

    }
}
