package com.example.atiktanim14.mybuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButton,logoutbutton;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton=(Button) findViewById(R.id.loginbuttonid);
        logoutbutton=(Button)findViewById(R.id.logoutbuttonid);
        textView=(TextView) findViewById(R.id.textviewID);


    }
    public  void showMessage(View v){
        if(v.getId()==R.id.loginbuttonid) {
            /*
            Toast.makeText(MainActivity.this,"Login button is clicked",Toast.LENGTH_SHORT).show();
            */
            Toast toast=Toast.makeText(MainActivity.this,"Login Button is clicked",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }
        else
           /*
            Toast.makeText(MainActivity.this,"Logout button is clicked",Toast.LENGTH_SHORT).show();
            */ {
            Toast toast = Toast.makeText(MainActivity.this, "Logout Button is clicked", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

    }


}






