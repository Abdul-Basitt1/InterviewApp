package com.example.splashh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Mcqquiz extends AppCompatActivity {
    TextView t1,t2;
    TextView ques;
    RadioButton r1,r2,r3,r4;
    String[] question,op1,op2,op3,op4,solution;
    ImageView left,right;
    Button submit;
    int index=0;
    int correct=0,incorrect=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcqquiz);
        t1=findViewById(R.id.text_View6);
        t2=findViewById(R.id.text_View7);
        ques=findViewById(R.id.text_View8);
        r1=findViewById(R.id.radio_Button);
        r2=findViewById(R.id.radio_Button2);
        r3=findViewById(R.id.radio_Button3);
        r4=findViewById(R.id.radio_Button4);
        left=findViewById(R.id.image_View);
        right=findViewById(R.id.imageView2);
        submit=findViewById(R.id.button_5);
        solution=getResources().getStringArray(R.array.mcq_option);
        question=getResources().getStringArray(R.array.mcq_question);
        op1=getResources().getStringArray(R.array.opt1);
        op2=getResources().getStringArray(R.array.opt2);
        op3=getResources().getStringArray(R.array.opt3);
        op4=getResources().getStringArray(R.array.opt4);
        ques.setText(question[index]);
        t1.setText(String.valueOf(index+1)+"/");
        t2.setText(String.valueOf(question.length));
        r1.setText(op1[index]);
        r2.setText(op2[index]);
        r3.setText(op3[index]);
        r4.setText(op4[index]);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0) {
                    Toast.makeText(Mcqquiz.this,"NO MCQS:",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index--;
                    ques.setText(question[index]);
                    t1.setText(String.valueOf(index+1)+"/");
                    r1.setText(op1[index]);
                    r2.setText(op2[index]);
                    r3.setText(op3[index]);
                    r4.setText(op4[index]);
                }
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==question.length-1)
                {
                    Intent in=new Intent(Mcqquiz.this,MainActivity2.class);
                    in.putExtra("Correct",correct);
                    in.putExtra("Incorrect",incorrect);
                    startActivity(in);
                }
                else
                {
                    index++;
                    ques.setText(question[index]);
                    t1.setText(String.valueOf(index+1)+"/");
                    r1.setText(op1[index]);
                    r2.setText(op2[index]);
                    r3.setText(op3[index]);
                    r4.setText(op4[index]);
                    if(r1.isChecked())
                    {
                        if(r1.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r2.isChecked())
                    {
                        if(r2.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r3.isChecked())
                    {
                        if(r3.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r4.isChecked())
                    {
                        if(r4.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else
                    {
                        Toast.makeText(Mcqquiz.this,"Kindly Select An Option:",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}