package org.techtown.businesstour;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MiddleFragment extends Fragment implements View.OnClickListener {
    TextView Qnum, Qcon, answer;
    ImageView nextBtn, preBtn;

    int num;
    String where;

    public MiddleFragment() {
    }

    public static MiddleFragment newInstance() {
        MiddleFragment fragment = new MiddleFragment();
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
        View view = inflater.inflate(R.layout.fragment_middle, container, false);

        Qnum = view.findViewById(R.id.Qnum);
        Qcon = view.findViewById(R.id.Qcon);
        answer = view.findViewById(R.id.answer);
        nextBtn = view.findViewById(R.id.nextBtn);
        preBtn = view.findViewById(R.id.preBtn);

        where = PreferenceManager.getString(getContext(), PreferenceManager.WHERE);
        num = PreferenceManager.getInt(getContext(), PreferenceManager.QNUM);

        Qnum.setText("Q"+num);
        Qcon.setText(QnA.getQcon(where, num));
        answer.setText(QnA.getAnswer(where, num));

        // 글자 부분 색상 설정
        if (where.equals("kocca") && num == 7) {
            String text = answer.getText().toString();
            SpannableString spannableString = new SpannableString(text);
            int start = text.indexOf("[한 사람의 의견으로, 절대적이지 않을 수 있고, 채용 트렌드가 변화할 수 있습니다. 참고만 해주시기 바랍니다.]");
            int end = start + "[한 사람의 의견으로, 절대적이지 않을 수 있고, 채용 트렌드가 변화할 수 있습니다. 참고만 해주시기 바랍니다.]".length();
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFF44336")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            answer.setText(spannableString);
        }

        nextBtn.setOnClickListener(this);
        preBtn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == nextBtn) {
            PreferenceManager.setInt(getContext(), PreferenceManager.QNUM, num+1);
            if (where.equals("kocca") && num == 7) {
                ((QuestionActivity) getActivity()).replaceFragment(EndFragment.newInstance());
            } else if (where.equals("dv") && num == 11) {
                ((QuestionActivity) getActivity()).replaceFragment(EndFragment.newInstance());
            } else if (where.equals("sound") && num == 14) {
                ((QuestionActivity) getActivity()).replaceFragment(EndFragment.newInstance());
            } else {
                ((QuestionActivity) getActivity()).replaceFragment(MiddleFragment.newInstance());
            }
        } else if (v == preBtn) {
            PreferenceManager.setInt(getContext(), PreferenceManager.QNUM, num-1);
            if (num == 2) {
                ((QuestionActivity) getActivity()).replaceFragment(FirstFragment.newInstance());
            } else {
                ((QuestionActivity) getActivity()).replaceFragment(MiddleFragment.newInstance());
            }
        }
    }
}