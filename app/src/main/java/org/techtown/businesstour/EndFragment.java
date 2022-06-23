package org.techtown.businesstour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class EndFragment extends Fragment implements View.OnClickListener {
    TextView Qnum, Qcon, answer;
    ImageView preBtn;

    int num;
    String where;

    public EndFragment() {
    }

    public static EndFragment newInstance() {
        EndFragment fragment = new EndFragment();
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
        View view = inflater.inflate(R.layout.fragment_end, container, false);

        Qnum = view.findViewById(R.id.Qnum);
        Qcon = view.findViewById(R.id.Qcon);
        answer = view.findViewById(R.id.answer);
        preBtn = view.findViewById(R.id.preBtn);

        where = PreferenceManager.getString(getContext(), PreferenceManager.WHERE);
        num = PreferenceManager.getInt(getContext(), PreferenceManager.QNUM);

        Qnum.setText("Q"+num);
        Qcon.setText(QnA.getQcon(where, num));
        answer.setText(QnA.getAnswer(where, num));

        preBtn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == preBtn) {
            PreferenceManager.setInt(getContext(), PreferenceManager.QNUM, num-1);
            ((QuestionActivity) getActivity()).replaceFragment(MiddleFragment.newInstance());
        }
    }
}