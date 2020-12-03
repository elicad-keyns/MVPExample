package com.ek.mvpexample;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mainPresenter;

    private Button bStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        init();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.onDestroy();
    }

    private void init() {
        mainPresenter = new MainPresenter(this);
        bStart = findViewById(R.id.bStart);
        bStart.setOnClickListener(v -> mainPresenter.onButtonWasClicked());
    }

    @Override
    public void createToast() {
        Toast.makeText(getApplicationContext(), "MVP Example", Toast.LENGTH_SHORT).show();
    }

}