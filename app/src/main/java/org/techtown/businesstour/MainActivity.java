package org.techtown.businesstour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button goBtn, exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 상태바 색상 및 글자색 변경
        getWindow().setStatusBarColor(Color.parseColor("#FFF4A2"));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        goBtn = findViewById(R.id.goBtn);
        exitBtn = findViewById(R.id.exitBtn);

        goBtn.setOnClickListener(this);
        exitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == goBtn) {
            Intent intent = new Intent(this, ContentActivity.class);
            startActivity(intent);
        } else if (v == exitBtn) {
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }
}