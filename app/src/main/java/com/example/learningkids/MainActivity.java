package com.example.learningkids;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button phone;
    Button name;
        Button address;
            TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone = (Button)findViewById(R.id.Phone);
        name = (Button)findViewById(R.id.Name);
        address = (Button)findViewById(R.id.Address);
        phone.setOnClickListener(this);
        name.setOnClickListener(this);
        address.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.Phone) {

        }
        if(view.getId()==R.id.Name) {

        }
        if(view.getId()==R.id.Address) {

        }
    }
}