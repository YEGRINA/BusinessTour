package org.techtown.businesstour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentActivity extends AppCompatActivity implements View.OnClickListener {
    Button koccaBtn, dvBtn, soundBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        // 상태바 색상 및 글자색 변경
        getWindow().setStatusBarColor(Color.parseColor("#FFF4A2"));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        koccaBtn = findViewById(R.id.koccaBtn);
        dvBtn = findViewById(R.id.dvBtn);
        soundBtn = findViewById(R.id.soundBtn);

        koccaBtn.setOnClickListener(this);
        dvBtn.setOnClickListener(this);
        soundBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == koccaBtn) {
            PreferenceManager.setString(getApplicationContext(), PreferenceManager.WHERE, "kocca");
            Intent intent = new Intent(this, KoccaActivity.class);
            startActivity(intent);
        } else if (v == dvBtn) {
            PreferenceManager.setString(getApplicationContext(), PreferenceManager.WHERE, "dv");
            Intent intent = new Intent(this, DvActivity.class);
            startActivity(intent);
        } else if (v == soundBtn) {
            PreferenceManager.setString(getApplicationContext(), PreferenceManager.WHERE, "sound");
            Intent intent = new Intent(this, SoundActivity.class);
            startActivity(intent);
        }
    }
}