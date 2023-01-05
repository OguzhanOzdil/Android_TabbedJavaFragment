package com.ozzyozdil.tabbedjavafragment.ui.main;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ozzyozdil.tabbedjavafragment.R;

public class FirstFragment extends Fragment {

    PageViewModel pageViewModel;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    // Uygulama başlarken
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Fragmentlarda Activity contextini almak için getActivity().getApplicationContext() kullanıyoruz
        Toast.makeText(getActivity().getApplicationContext(), "Hello User", Toast.LENGTH_SHORT).show();
        pageViewModel = new ViewModelProvider(requireActivity()).get(PageViewModel.class);
    }

    // Görünüm oluşturulurken
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    // Görünüm oluşturulduğunda
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText editText = view.findViewById(R.id.edittxt_Name);

        editText.addTextChangedListener(new TextWatcher() {     // editText içerisindeki metin deiğiştiğinde ne olsun
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                pageViewModel.setName(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}