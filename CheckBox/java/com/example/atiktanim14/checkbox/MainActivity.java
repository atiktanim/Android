package com.example.atiktanim14.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheckBox,sugarCheckBox,waterCheckBox;
    private Button showButton;
    private TextView resultTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox=(CheckBox) findViewById(R.id.milkCheckboxId);
        sugarCheckBox=(CheckBox) findViewById(R.id.sugarCheckboxId);
        waterCheckBox=(CheckBox) findViewById(R.id.waterCheckboxId);
        showButton=(Button)findViewById(R.id.buttonId);
        resultTextview=(TextView)findViewById(R.id.textViewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();

                if(milkCheckBox.isChecked()){
                    String value=milkCheckBox.getText().toString();
                    stringBuilder.append(value+" is ordered"+"\n");
                }
                if(sugarCheckBox.isChecked()){
                    String value=sugarCheckBox.getText().toString();
                    stringBuilder.append(value+" is ordered"+"\n");
                }
                if(waterCheckBox.isChecked()){
                    String value=waterCheckBox.getText().toString();
                    stringBuilder.append(value+" is ordered"+"\n");
                }
                resultTextview.setText(stringBuilder);


            }
        });
    }
}
