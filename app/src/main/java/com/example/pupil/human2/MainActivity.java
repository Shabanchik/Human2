package com.example.pupil.human2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pupil.human2.human.Human;
import com.example.pupil.human2.human.MyAdapter;
import com.example.pupil.human2.human.Pupil;

import java.util.ArrayList;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pupil> arr;
        TextView name;
    TextView surname;
        Button btnClose;
        Button button;
        RecyclerView list;
        EditText edName;
        EditText edLastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arr=new ArrayList();

        name= findViewById(R.id.name);
        surname= findViewById(R.id.surname);
        button=findViewById(R.id.button);
        btnClose= findViewById(R.id.btnClose);
        list=findViewById(R.id.list);
        edName=findViewById(R.id.edName);
        edLastname=findViewById(R.id.edLastname);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        button.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Pupil pupil = createPupil(edName.getText().toString(),edLastname.getText().toString());
                arr.add(pupil);
                name.setText(pupil.getName());
                surname.setText(pupil.getLastName());
                list.setLayoutManager(new LinearLayoutManager(getBaseContext()));
                list.setAdapter(new MyAdapter(arr));
                list.getAdapter().notifyDataSetChanged();
            }
        });


    }
    public Pupil createPupil(String name,String surname){
        Pupil p=new Pupil(name,surname);
        return p;
    }
}
