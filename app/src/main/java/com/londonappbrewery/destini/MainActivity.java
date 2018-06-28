package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ques;
    Button o1,o2;
    int Index = 1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ques = findViewById(R.id.storyTextView);
        o1=findViewById(R.id.buttonTop);
        o2=findViewById(R.id.buttonBottom);
        ques.setText(R.string.T1_Story);
        o1.setText(R.string.T1_Ans1);
        o2.setText(R.string.T1_Ans2);
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Index==1)
                {
                    ques.setText(R.string.T3_Story);
                    o1.setText(R.string.T3_Ans1);;
                    o2.setText(R.string.T3_Ans2);
                    Index=3;
                }
               else if(Index==3)
                {
                    ques.setText(R.string.T6_End);
                    o1.setText("");
                    o2.setText("");
                    Index=0;
                }
                else
                {
                    ques.setText(R.string.T3_Story);
                    o1.setText(R.string.T3_Ans1);
                    o2.setText(R.string.T3_Ans2);
                    Index=3;
                }

            }
        });
        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Index==1)
                {
                    ques.setText(R.string.T2_Story);
                    o1.setText(R.string.T2_Ans1);
                    o2.setText(R.string.T2_Ans2);
                    Index=2;
                }
                else if(Index==2)
                {
                    ques.setText(R.string.T4_End);
                    o1.setText("");
                    o2.setText("");
                    Index=0;
                }
                else
                {
                    ques.setText(R.string.T5_End);
                    o1.setText("");
                    o2.setText("");
                    Index=0;
                }

            }
        });


    }
}
