package com.example.rutine2019;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        spinner=findViewById(R.id.spennereId);
        textView1=findViewById(R.id.textViewId1);
        textView2=findViewById(R.id.textViewId2);
        textView3=findViewById(R.id.textViewId3);
        textView4=findViewById(R.id.textViewId4);
        textView5=findViewById(R.id.allId);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.allId){
                    Intent intent=new Intent(getApplicationContext(),dialoge.class);
                    startActivity(intent);
                }
            }
        });


        String[]names=getResources().getStringArray(R.array.sub_name);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(MainActivity.this,R.layout.sample_text_view,R.id.textViewId,names);
        spinner.setAdapter(arrayAdapter);
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             switch (position){
                 case 0:
                   textView1.setText("\n\nDate:\n10 Dec 2019");
                   textView2.setText("\n\nDay:\nTuesday");
                   textView3.setText("\n\nTime:\n10.00+(am)");
                   textView4.setText("Innovation and Entrepreneurship");
                     break;
                 case 1:
                     textView1.setText("\n\nDate:\n15 Dec 2019");
                     textView2.setText("\n\nDay:\nSunday");
                     textView3.setText("\n\nTime:\n10.00+(am)");
                     textView4.setText("System Desigh and Analysis");
                     break;
                 case 2:
                     textView1.setText("\n\nDate:\n22 Dec 2019");
                     textView2.setText("\n\nDay:\nSunday");
                     textView3.setText("\n\nTime:\n10.00+(am)");
                     textView4.setText("Network Administration and Services");
                     break;
                 case 3:
                     textView1.setText("\n\nDate:\n26 Dec 2019");
                     textView2.setText("\n\nDay:\nThusday");
                     textView3.setText("\n\nTime:\n10.00+(am)");
                     textView4.setText("E-Commerce and CMS");
                     break;
                 case 4:
                     textView1.setText("\n\nDate:\n31 Dec 2019");
                     textView2.setText("\n\nDay:\nTuesday");
                     textView3.setText("\n\nTime:\n10.00+(am)");
                     textView4.setText("Cyber Security System");
                     break;
                 case 5:
                     textView1.setText("\n\nDate:\n05 Jan 2020");
                     textView2.setText("\n\nDay:\nSunday");
                     textView3.setText("\n\nTime:\n10.00+(am)");
                     textView4.setText("Advanced Database Management System");
                     break;
                 case 6:
                     textView1.setText("\n\nDate:\n05 Jan 2020");
                     textView2.setText("\n\nDay:\nSunday");
                     textView3.setText("\n\nTime:\n10.00+(am)");
                     textView4.setText("Network and Data Center Operation");
                     break;
             }
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==android.R.id.home){
           this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
