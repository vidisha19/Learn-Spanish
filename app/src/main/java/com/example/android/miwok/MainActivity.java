package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the view that shows the numbers category
        TextView numbers=(TextView)findViewById(R.id.numbers);

        //set a onclickListener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent=new Intent (MainActivity.this,NumbersActivity.class);

                //start the new activity
                startActivity(numbersIntent);
            }
        });

        //family intent
        TextView family=(TextView)findViewById(R.id.family);

        //set a onclickListener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent=new Intent (MainActivity.this,FamilyActivity.class);

                //start the new activity
                startActivity(familyIntent);
            }
        });


        //colors
        TextView colors=(TextView)findViewById(R.id.colors);
        //set a onclickListener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent=new Intent (MainActivity.this,ColorsActivity.class);

                //start the new activity
                startActivity(colorsIntent);
            }
        });

        //phrases
        TextView phrases=(TextView)findViewById(R.id.phrases);
        //set a onclickListener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent=new Intent (MainActivity.this,PhrasesActivity.class);

                //start the new activity
                startActivity(phrasesIntent);
            }
        });




    }

   
}