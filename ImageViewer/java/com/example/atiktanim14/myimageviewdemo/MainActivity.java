package com.example.atiktanim14.myimageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView1,imageView2;
    private Button Button_for_details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1=(ImageView) findViewById(R.id.imageView1Id);
        imageView2=(ImageView) findViewById(R.id.imageView2Id);
        Button_for_details=(Button)findViewById(R.id.button_image_id);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        Button_for_details.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView1Id){

            Toast.makeText(MainActivity.this,"Baby",Toast.LENGTH_LONG).show();

        }
        if(v.getId()==R.id.button_image_id){
        Toast.makeText(MainActivity.this,"It's a cute baby imported from china",Toast.LENGTH_LONG).show();
        }
        else if (v.getId()==R.id.imageView2Id){
            Toast.makeText(MainActivity.this,"It's me",Toast.LENGTH_SHORT).show();
        }

    }
}
