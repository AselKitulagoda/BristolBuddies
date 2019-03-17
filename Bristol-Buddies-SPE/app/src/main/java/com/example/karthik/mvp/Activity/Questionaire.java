package com.example.karthik.mvp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.example.karthik.mvp.R;

public class Questionaire extends AppCompatActivity {
    EditText faculty,Gradyear,Nationality;
    CheckBox ArtandMus,Tele,Vidgames,Gigs,clubs,none,creat,sport;
    String fac,gY,nat;
    Button question1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionaire);
        faculty = findViewById(R.id.faculty);
        Gradyear = findViewById(R.id.gradyear);
        Nationality = findViewById(R.id.nat);


        ArtandMus = findViewById(R.id.artmus);
        Tele = findViewById(R.id.tele);
        Vidgames = findViewById(R.id.games);
        Gigs = findViewById(R.id.gigs);
        clubs = findViewById(R.id.clubs);
        none = findViewById(R.id.none1);
        creat = findViewById(R.id.creative);
        sport = findViewById(R.id.Sport);
        question1 = findViewById(R.id.question1);

        final Student student = (Student)getIntent().getSerializableExtra("serialize_data1");

        none.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    ArtandMus.setChecked(false);
                    Tele.setChecked(false);
                    Vidgames.setChecked(false);
                    Gigs.setChecked(false);
                    clubs.setChecked(false);
                    creat.setChecked(false);
                    sport.setChecked(false);
                }
            }
        });
        ArtandMus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    none.setChecked(false);
                }
            }
        });
        Tele.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    none.setChecked(false);
                }
            }
        });

        Gigs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    none.setChecked(false);
                }
            }
        });

        clubs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    none.setChecked(false);
                }
            }
        });
        creat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    none.setChecked(false);
                }
            }
        });

        sport.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    none.setChecked(false);
                }
            }
        });

        Vidgames.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    none.setChecked(false);
                }
            }
        });


        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fac = faculty.getText().toString();
                gY = Gradyear.getText().toString();
                nat = Gradyear.getText().toString();
                String interests = "";
                if (ArtandMus.isChecked()){
                    interests += "1";
                }
                else interests +="0";
                if (Tele.isChecked()){
                    interests += "1";
                }
                else interests +="0";
                if (Vidgames.isChecked()){
                    interests += "1";
                }
                else interests +="0";
                if (Gigs.isChecked()){
                    interests += "1";
                }
                else interests +="0";
                if (creat.isChecked()){
                    interests += "1";
                }
                else interests +="0";

                if (sport.isChecked()){
                    interests += "1";
                }
                else interests +="0";
                if (none.isChecked()){
                    interests = "000000";
                }



                final Student student1 = new Student(student.getFirstName(),student.getLastName(),student.getGender(),student.getUserName(),student.getPassword(),fac,student.getYearofStudy(),nat,interests,"","");
                Intent k = new Intent(getApplicationContext(),questionaire2.class);
                k.putExtra("serialize_data2",student1);
                startActivity(k);
                finish();
               }



        });





    }
}