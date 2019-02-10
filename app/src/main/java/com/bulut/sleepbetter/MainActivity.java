package com.bulut.sleepbetter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ques_1, ques_2, ques_3, ques_4, ques_5, ques_6;
    EditText answerOneEditText;
    RadioGroup answerTwoRadioGroup;

    EditText answerFourEditText;
    RadioGroup answerFiveRadioGroup;


    String[] question = {"How many hours do you usually sleep during a weekday night prior to work?",
            "When do you confront sleep problems; before sleeping, while sleeping, while waking up, or all of them? ?",
            "Do you take any sedatives, sleeping medications or alcohol to help you sleep?",
            "On a scale of 1-10, how would you describe your sleep quality? (1: very bad, 10:very good)",
            "If x= 20 , y = 10 , then Value of x + 20y is"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerOneEditText = findViewById(R.id.text_answer_1);
        answerTwoRadioGroup = findViewById(R.id.radio_group_answer_2);
        answerFourEditText = findViewById(R.id.text_answer_4);
        answerFiveRadioGroup = findViewById(R.id.radio_group_answer_5);

        ques_1 = findViewById(R.id.text_question_1);
        ques_2 = findViewById(R.id.radio_question_2);
        ques_3 = findViewById(R.id.checkbox_question_3);
        ques_4 = findViewById(R.id.text_question_4);
        ques_5 = findViewById(R.id.radio_question_5);
        ques_6 = findViewById(R.id.text_question_6);




    }

}





