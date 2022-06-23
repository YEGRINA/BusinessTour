package org.techtown.businesstour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KoccaActivity extends AppCompatActivity implements View.OnClickListener {
    Button firstBtn;
    TextView q1, q2, q3, q4, q5, q6, q7, q8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kocca);

        // 상태바 색상 및 글자색 변경
        getWindow().setStatusBarColor(Color.parseColor("#FFF4A2"));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        firstBtn = findViewById(R.id.firstBtn);
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        q5 = findViewById(R.id.q5);
        q6 = findViewById(R.id.q6);
        q7 = findViewById(R.id.q7);
        q8 = findViewById(R.id.q8);

        q1.setText(QnA.getQcon("kocca", 1));
        q2.setText(QnA.getQcon("kocca", 2));
        q3.setText(QnA.getQcon("kocca", 3));
        q4.setText(QnA.getQcon("kocca", 4));
        q5.setText(QnA.getQcon("kocca", 5));
        q6.setText(QnA.getQcon("kocca", 6));
        q7.setText(QnA.getQcon("kocca", 7));
        q8.setText(QnA.getQcon("kocca", 8));

        firstBtn.setOnClickListener(this);
        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);
        q8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == firstBtn || v == q1) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 1);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q2) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 2);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q3) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 3);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q4) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 4);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q5) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 5);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q6) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 6);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q7) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 7);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q8) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 8);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        }
    }
}