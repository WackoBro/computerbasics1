package com.quasar.paul.computerbasics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by sharon on 7/14/2016.
 */
public class ProgrammingLanguages extends AppCompatActivity {

    String[] HardwareList = {
            "ActionScript",
            "BASIC",
            "Bourne Shell",
            "C",
            "C++",
            "CUDA",
            "D",
            "E",
            "Fortran",
            "Go",
            "Hack",
            "Haskell",
            "Java",
            "Javascript",
            "LaTeX",
            "Logo",
            "MATLAB",
            "Objective-C",
            "Pascal",
            "Perl",
            "PHP",
            "Python",
            "Swift (Apple programming language)",
            "Swift (parallel scripting language)",
            "Unix shell",

    };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        TextView header = (TextView) findViewById(R.id.list_head);
        header.setText("Programming Languages");

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, HardwareList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ProgrammingLanguageScrollingActivity.class);
                intent.putExtra("Position", position);
                startActivity(intent);
            }
        });


    }
}
