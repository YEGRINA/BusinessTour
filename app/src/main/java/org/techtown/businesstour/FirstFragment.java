package org.techtown.businesstour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstFragment extends Fragment implements View.OnClickListener {
    TextView Qnum, Qcon, answer;
    ImageView nextBtn;

    String where;

    public FirstFragment() {
    }

    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Qnum = view.findViewById(R.id.Qnum);
        Qcon = view.findViewById(R.id.Qcon);
        answer = view.findViewById(R.id.answer);
        nextBtn = view.findViewById(R.id.nextBtn);

        PreferenceManager.setInt(getContext(), PreferenceManager.QNUM, 1);
        where = PreferenceManager.getString(getContext(), PreferenceManager.WHERE);
        Qcon.setText(QnA.getQcon(where, 1));
        answer.setText(QnA.getAnswer(where, 1));

        nextBtn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == nextBtn) {
            PreferenceManager.setInt(getContext(), PreferenceManager.QNUM, 2);
            ((QuestionActivity) getActivity()).replaceFragment(MiddleFragment.newInstance());
        }
    }
}