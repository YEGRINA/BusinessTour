package org.techtown.businesstour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        int num = PreferenceManager.getInt(getApplicationContext(), PreferenceManager.QNUM);
        String where = PreferenceManager.getString(getApplicationContext(), PreferenceManager.WHERE);
        if (num == 1) {
            fragmentTransaction.add(R.id.layout, FirstFragment.newInstance()).commit();
        } else if (where.equals("kocca") && num == 8) {
            fragmentTransaction.add(R.id.layout, EndFragment.newInstance()).commit();
        }  else if (where.equals("dv") && num == 12) {
            fragmentTransaction.add(R.id.layout, EndFragment.newInstance()).commit();
        }  else if (where.equals("sound") && num == 15) {
            fragmentTransaction.add(R.id.layout, EndFragment.newInstance()).commit();
        } else {
            fragmentTransaction.add(R.id.layout, MiddleFragment.newInstance()).commit();
        }
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layout, fragment).commit();
    }
}