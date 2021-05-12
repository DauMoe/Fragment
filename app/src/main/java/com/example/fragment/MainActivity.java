package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FragmentManager manager;
    private dynamic_fragment dy_frag;
    private Button btnA, btnB;
    private Fragment f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA = findViewById(R.id.btnaddA);
        btnB = findViewById(R.id.btnaddB);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);

        //For dynamic fragment
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        //single fragment
//        dy_frag = new dynamic_fragment();
//        transaction.add(R.id.dynamic_fragment, dy_frag);
//        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        if (v == btnA) {
            FragmentTransaction transactionA = manager.beginTransaction();
            f = new dynamic_fragment();
            transactionA.replace(R.id.dynamic_fragment, f);
            transactionA.commit();
        }
        if (v == btnB) {
            FragmentTransaction transactionA = manager.beginTransaction();
            f = new dynamic_fragmentB();
            transactionA.replace(R.id.dynamic_fragment, f);
            transactionA.commit();
        }
    }
}