package com.example.splashh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Interview extends AppCompatActivity {

    TextView first,second,quest,answ;
    Button prv,ans,nxt;
    String[] str_ques,str_ans;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        first=findViewById(R.id.textView_2);
        second=findViewById(R.id.textView_3);
        quest=findViewById(R.id.textView_4);
        answ=findViewById(R.id.textView_5);
        prv=findViewById(R.id.button_1);
        ans=findViewById(R.id.button_2);
        nxt=findViewById(R.id.button_3);

        str_ques=getResources().getStringArray(R.array.questions);
        str_ans=getResources().getStringArray(R.array.answers);

        quest.setText(str_ques[index]);
        answ.setText("Press Answer button to show answer");
        first.setText(String.valueOf(index+1));
        second.setText("/"+ String.valueOf(5));

    }

    public void onClick(View view) {

        switch (view.getId()){
            case  R.id.button_1: {
                if (index == 0) {
                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                    break;
                }
                answ.setText("Press Answer button to show answer");
                index--;
                quest.setText(str_ques[index]);
                first.setText(String.valueOf(index + 1));
                break;
            }
            case R.id.button_2:
                answ.setText(str_ans[index]);

                break;
            case R.id.button_3:

                answ.setText("Press Answer button to show answer");
                index++;
                if(index==5) {

                    Toast.makeText(this, "INTERVIEW FINISHED", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);
                    break;
                }
                quest.setText(str_ques[index]);
                first.setText(String.valueOf(index+1));
                break;
        }
    }
}
