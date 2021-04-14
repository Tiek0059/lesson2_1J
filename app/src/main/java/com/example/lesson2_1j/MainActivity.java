package com.example.lesson2_1j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lesson2_1j.R;

public class MainActivity extends AppCompatActivity {
    private Button btnAddFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddFragment = findViewById(R.id.btn_add_fragment);
        btnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, com.example.lesson2_1j.FirstFragment.newInstance("SLOVO 1","SLOVO 2"));
                transaction.commit();
            }
        });
    }
}