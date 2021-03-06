package com.example.reto2.ui.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.reto2.R;

public class ServicesFragment extends Fragment {
    private ServicesViewModel servicesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        servicesViewModel =
                new ViewModelProvider(this).get(ServicesViewModel.class);

        View root = inflater.inflate(R.layout.fragment_services, container, false);

        final TextView textView = root.findViewById(R.id.text_services);
        servicesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
