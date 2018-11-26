package com.example.pupil.human2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pupil.human2.human.Human;
import com.example.pupil.human2.human.Pupil;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
        TextView name;
    TextView surname;
        Button btnClose;
        Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= findViewById(R.id.name);
        surname= findViewById(R.id.surname);
        button=findViewById(R.id.button);
        btnClose= findViewById(R.id.btnClose);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        button.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Pupil pupil = new Pupil();
                pupil.setName("Nastya");
                pupil.setLastName("Shabanova");
                name.setText(pupil.getName());
                surname.setText(pupil.getLastName());
            }
        });


    }
    public Pupil createPupil(String name,String surname){
        Pupil p=new Pupil(name,surname);
        return p;
    }
}
