package org.techtown.businesstour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DvActivity extends AppCompatActivity implements View.OnClickListener {
    Button firstBtn;
    TextView q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dv);

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
        q9 = findViewById(R.id.q9);
        q10 = findViewById(R.id.q10);
        q11 = findViewById(R.id.q11);
        q12 = findViewById(R.id.q12);

        q1.setText(QnA.getQcon("dv", 1));
        q2.setText(QnA.getQcon("dv", 2));
        q3.setText(QnA.getQcon("dv", 3));
        q4.setText(QnA.getQcon("dv", 4));
        q5.setText(QnA.getQcon("dv", 5));
        q6.setText(QnA.getQcon("dv", 6));
        q7.setText(QnA.getQcon("dv", 7));
        q8.setText(QnA.getQcon("dv", 8));
        q9.setText(QnA.getQcon("dv", 9));
        q10.setText(QnA.getQcon("dv", 10));
        q11.setText(QnA.getQcon("dv", 11));
        q12.setText(QnA.getQcon("dv", 12));

        firstBtn.setOnClickListener(this);
        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);
        q8.setOnClickListener(this);
        q9.setOnClickListener(this);
        q10.setOnClickListener(this);
        q11.setOnClickListener(this);
        q12.setOnClickListener(this);
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
        } else if (v == q9) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 9);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q10) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 10);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q11) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 11);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        } else if (v == q12) {
            PreferenceManager.setInt(getApplicationContext(), PreferenceManager.QNUM, 12);
            Intent intent = new Intent(this, QuestionActivity.class);
            startActivity(intent);
        }
    }
}