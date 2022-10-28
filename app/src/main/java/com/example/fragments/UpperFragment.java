package com.example.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class UpperFragment extends Fragment {
    FragmentUpperListener listener;
    Button button;
    EditText editText;

    public interface  FragmentUpperListener{
        void onInputUpperSent (CharSequence input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upper, container, false);

        button = view.findViewById(R.id.button5);
        editText = view.findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence input = editText.getText();
                listener.onInputUpperSent(input);
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (FragmentUpperListener) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

}