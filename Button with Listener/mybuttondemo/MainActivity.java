package com.example.atiktanim14.mybuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton,logoutbutton;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton=(Button) findViewById(R.id.loginbuttonid);
        logoutbutton=(Button)findViewById(R.id.logoutbuttonid);
        textView=(TextView) findViewById(R.id.textviewID);

        loginButton.setOnClickListener(this);
        logoutbutton.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginbuttonid){
            textView.setText("Login button is clicked");
        }
        if(v.getId()==R.id.logoutbuttonid){
            textView.setText("Logout button is clicked");
        }

    }
}






