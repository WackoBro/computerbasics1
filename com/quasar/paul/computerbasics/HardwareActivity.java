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
public class HardwareActivity extends AppCompatActivity {

    String[] HardwareList = {
            "AGP: Accelerated Graphics Port",
            "APM: Advanced Power Management",
            "BIOS: Basic Input Output System",
            "Bus",
            "CD-R",
            "CD-ROM",
            "CD-RW",
            "COM port",
            "CPU",
            "DVD",
            "Floppy Drive",
            "Hard Drive",
            "Heat Sink",
            "Joystick",
            "Keyboard",
            "LCD",
            "Memory",
            "Microphone",
            "Modem",
            "Monitor",
            "Mother Board",
            "Mouse",
            "Network Card",
            "Parallel Port",
            "PSU: Power Supply Unit",
            "Printer",
            "Processor",
            "PS/2",
            "RAID: Redundant Array of Inexpensive Disks",
            "RAM: Read Only Memory",
            "Riser Board",
            "SCSI: Small Computer System Interface",
            "Serial Port",
            "Sound Card",
            "Speakers",
            "SPS: Standby Power Supply",
            "Surge Suppressor",
            "UPS: Uninterruptible Power Supply",
            "Video Card",
            "Zip Drive"
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        TextView textView = (TextView) findViewById(R.id.list_head);
        textView.setText("Hardware");


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, HardwareList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), HardwareScrollingActivity.class);
                intent.putExtra("Position", position);
                startActivity(intent);
            }
        });

    }



}
