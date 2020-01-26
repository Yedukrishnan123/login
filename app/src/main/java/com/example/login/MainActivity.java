package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText password;
    private Button login;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.eTusername);
        password = (EditText)findViewById(R.id.eTpassword);
        info = (TextView)findViewById(R.id.tvinfo);
        login = (Button)findViewById(R.id.btnlogin);

    }
}
