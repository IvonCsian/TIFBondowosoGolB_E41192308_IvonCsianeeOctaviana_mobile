package com.example.tugaslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLinearLayout, btnRelativeLayout, btnConstraintLayout, btnFrameLayout, btnTableLayout, btnMaterialDesign, btnScrollView, btnScrollViewHorizontal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
        btnConstraintLayout = findViewById(R.id.btn_constraintlayout);
        btnFrameLayout = findViewById(R.id.btn_framelayout);
        btnTableLayout = findViewById(R.id.btn_tablelayout);
        btnMaterialDesign = findViewById(R.id.btn_materialdesign);
        btnScrollView = findViewById(R.id.btn_scrollview);
        btnScrollViewHorizontal = findViewById(R.id.btn_scrollviewhorizontal);
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class));
            }
        });
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
            }
        });
        btnConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ConstraintLayoutActivity.class));
            }
        });
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FrameLayoutActivity.class));
            }
        });
        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TableLayoutActivity.class));
            }
        });
        btnMaterialDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MaterialDesignActivity.class));
            }
        });
        btnScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollViewActivity.class));
            }
        });
        btnScrollViewHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollViewHorizontalActivity.class));
            }
        });
    }
}