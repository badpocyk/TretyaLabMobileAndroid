package com.example.mireaproject;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mireaproject.ui.Calc;

public class CalculateFragment extends Fragment implements View.OnClickListener {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    EditText a, b;
    TextView result;

    Calc calc;

    public CalculateFragment() {
        // Required empty public constructor
    }

    public static CalculateFragment newInstance(String param1, String param2) {
        CalculateFragment fragment = new CalculateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);

        a = view.findViewById(R.id.firstEdit);
        b = view.findViewById(R.id.secondEdit);
        result = view.findViewById(R.id.Result);

        calc = new Calc();

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Sum: result.setText(calc.Sum(5, 2)); break;
            case  R.id.Sub: result.setText(calc.Sub(5,1)); break;
            case  R.id.Divide: result.setText(calc.Divide(5,1)); break;
            case  R.id.Multi: result.setText(calc.Multiplication(5,1)); break;
        }
    }
}
