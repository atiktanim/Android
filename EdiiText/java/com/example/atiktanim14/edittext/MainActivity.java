package com.example.atiktanim14.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editText1,editText2;
    private Button AddButton,SubButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=(EditText) findViewById(R.id.editText1Id);
        editText2=(EditText) findViewById(R.id.editText2Id);

        AddButton=(Button) findViewById(R.id.addButtonId);
        SubButton=(Button) findViewById(R.id.subButtonId);

        resultTextView=(TextView) findViewById(R.id.resultTextViewId);

        AddButton.setOnClickListener(this);
        SubButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        try{
            String number1=editText1.getText().toString();
            String number2=editText2.getText().toString();

            //converting into double
            double num1=Double.parseDouble(number1);
            double num2=Double.parseDouble(number2);

            if(v.getId()==R.id.addButtonId){
                double sum=num1+num2;

                resultTextView.setText("Result :"+sum);

            }
            if(v.getId()==R.id.subButtonId){
                double sum=num1-num2;

                resultTextView.setText("Result :"+sum);
            }

        }
        catch(Exception e){

        Toast.makeText(MainActivity.this,"Please enter numbers",Toast.LENGTH_SHORT).show();

        }
    }
}
