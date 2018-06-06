package com.example.atiktanim14.mydatepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button selectButton;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewId);
        selectButton=findViewById(R.id.selectButtonId);
        datePicker=findViewById(R.id.datePickerId);
        textView.setText(current_Date());

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(current_Date());
            }
        });




    }
    String current_Date(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Current date : ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();
    }
}
