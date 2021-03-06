package com.example.capstone_ui_1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;


public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_information);

        ImageButton art = (ImageButton) findViewById(R.id.art);
        ImageButton backhak = (ImageButton) findViewById(R.id.backhak);
        ImageButton professor_research = (ImageButton) findViewById(R.id.professor);
        ImageButton main = (ImageButton) findViewById(R.id.main);
        ImageButton physical = (ImageButton) findViewById(R.id.physical);
        ImageButton international = (ImageButton) findViewById(R.id.international);
        ImageButton s_hall = (ImageButton) findViewById(R.id.s_hall);
        ImageButton student = (ImageButton) findViewById(R.id.student);
        ImageButton it = (ImageButton) findViewById(R.id.it);
        ImageButton business = (ImageButton) findViewById(R.id.business);
        ImageButton engineering_one = (ImageButton) findViewById(R.id.engineering_one);
        ImageButton engineering_two = (ImageButton) findViewById(R.id.engineering_two);
        ImageButton dental = findViewById(R.id.dental);
        ImageButton medical_one = findViewById(R.id.medical_one);
        ImageButton medical_two;
        ImageButton medical_three = findViewById(R.id.medical_three);
        ImageButton hospital = findViewById(R.id.hospital);
        ImageButton bio = findViewById(R.id.bio);
        ImageButton law = findViewById(R.id.law);
        ImageButton nurse = findViewById(R.id.nurse);
        ImageButton space = findViewById(R.id.space);
        ImageButton ship_marine = findViewById(R.id.ship_marine);
        ImageButton rotc = findViewById(R.id.rotc);

        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("????????????");
                z_art.setMessage(getString(R.string.art));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        backhak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_bk = new AlertDialog.Builder(InformationActivity.this);
                z_bk.setTitle("???????????????");
                z_bk.setMessage(R.string.backhak);
                z_bk.setNegativeButton("??????", null);
                z_bk.show();
            }
        });
        professor_research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_professor = new AlertDialog.Builder(InformationActivity.this);
                z_professor.setTitle("???????????????");
                z_professor.setMessage(getString(R.string.professor_research));
                z_professor.setNegativeButton("??????", null);
                z_professor.show();
            }
        });
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_bon = new AlertDialog.Builder(InformationActivity.this);
                z_bon.setTitle("??????");
                z_bon.setMessage(getString(R.string.main));
                z_bon.setNegativeButton("??????", null);
                z_bon.show();
            }
        });
        physical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_phy = new AlertDialog.Builder(InformationActivity.this);
                z_phy.setTitle("????????????");
                z_phy.setMessage(getString(R.string.physical));
                z_phy.setNegativeButton("??????", null);
                z_phy.show();
            }
        });
        international.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_guk = new AlertDialog.Builder(InformationActivity.this);
                z_guk.setTitle("?????????");
                z_guk.setMessage(getString(R.string.international));
                z_guk.setNegativeButton("??????", null);
                z_guk.show();
            }
        });
        s_hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_seo = new AlertDialog.Builder(InformationActivity.this);
                z_seo.setTitle("?????????");
                z_seo.setMessage(getString(R.string.s_hall));
                z_seo.setNegativeButton("??????", null);
                z_seo.show();
            }
        });
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder z_student = new AlertDialog.Builder(InformationActivity.this);
                z_student.setTitle("????????????");
                z_student.setMessage(getString(R.string.student));
                z_student.setNegativeButton("??????", null);
                z_student.show();
            }
        });
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_it = new AlertDialog.Builder(InformationActivity.this);
                z_it.setTitle("IT????????????");
                z_it.setMessage(getString(R.string.it));
                z_it.setNegativeButton("??????", null);
                z_it.show();
            }
        });
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_gus = new AlertDialog.Builder(InformationActivity.this);
                z_gus.setTitle("????????????");
                z_gus.setMessage(getString(R.string.business));
                z_gus.setNegativeButton("??????", null);
                z_gus.show();
            }
        });
        engineering_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_gong1 = new AlertDialog.Builder(InformationActivity.this);
                z_gong1.setTitle("?????? 1??????");
                z_gong1.setMessage(getString(R.string.engineering_one));
                z_gong1.setNegativeButton("??????", null);
                z_gong1.show();
            }
        });
        engineering_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_gong2 = new AlertDialog.Builder(InformationActivity.this);
                z_gong2.setTitle("?????? 2??????");
                z_gong2.setMessage(getString(R.string.engineering_two));
                z_gong2.setNegativeButton("??????", null);
                z_gong2.show();
            }
        });
        dental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("????????????");
                z_art.setMessage(getString(R.string.dental));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        medical_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("???????????? 1??????");
                z_art.setMessage(getString(R.string.medical_one));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        medical_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("???????????? 3??????");
                z_art.setMessage(getString(R.string.medical_three));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("??????????????? ??????");
                z_art.setMessage(getString(R.string.hospital));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("???????????????");
                z_art.setMessage(getString(R.string.bio));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("????????????");
                z_art.setMessage(getString(R.string.law));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        nurse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("????????????");
                z_art.setMessage(getString(R.string.nurse));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("??????????????????");
                z_art.setMessage(getString(R.string.space));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        ship_marine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("??????????????????");
                z_art.setMessage(getString(R.string.ship_marine));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });
        rotc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder z_art = new AlertDialog.Builder(InformationActivity.this);
                z_art.setTitle("?????????");
                z_art.setMessage(getString(R.string.rotc));
                z_art.setNegativeButton("??????", null);
                z_art.show();
            }
        });

    }

}
