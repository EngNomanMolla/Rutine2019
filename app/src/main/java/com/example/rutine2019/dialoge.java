package com.example.rutine2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dialoge extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialoge);

        textView1=findViewById(R.id.textViewId1);
        textView2=findViewById(R.id.textViewId2);
        textView3=findViewById(R.id.textViewId3);
        textView4=findViewById(R.id.textViewId4);
        textView5=findViewById(R.id.textViewId5);
        textView1.setText("Subject Name:\n\n1.Network Administation & Services\n\n2.System Analysis & Design\n\n3.E-Commerce & CMS\n\n4.Apps Development Project\n\n5.Cyber Security and Ethics\n\n6.Innovation and Entrepreneurship\n\n7.Advanced Database System(Optional)\n\n8.Network & Data Center Operation(Optional)");
        textView2.setText("Code:\n\n66672\n\n\n66671\n\n66674\n\n66673\n\n66675\n\n65853\n\n\n66678\n\n\n66665");
        textView3.setText("Credit:\n\n4\n\n\n3\n\n3\n\n2\n\n2\n\n2\n\n\n3\n\n\n3");
        textView4.setText("Thoery:\n\n2\n\n\n2\n\n2\n\n0\n\n1\n\n2\n\n\n2\n\n\n2");
        textView5.setText("Pratical:\n\n6\n\n\n3\n\n6\n\n6\n\n3\n\n0\n\n\n2\n\n\n3");


    }
}
