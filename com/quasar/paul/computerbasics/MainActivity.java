package com.quasar.paul.computerbasics;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView hardwareImageView = (ImageView) findViewById(R.id.hardware_home_icon);
        hardwareImageView.setVisibility(View.VISIBLE);
        YoYo.with(Techniques.FadeIn).duration(700).playOn(hardwareImageView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView operatingSystemImageView = (ImageView) findViewById(R.id.operating_system_icon);
                operatingSystemImageView.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.FadeIn).playOn(operatingSystemImageView);
            }
        }, 300);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView officeImageView = (ImageView) findViewById(R.id.office_home_icon);
                officeImageView.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.FadeIn).playOn(officeImageView);
            }
        }, 300);


                ImageView programmingLanguagesImageView = (ImageView) findViewById(R.id.programming_languages_home_icon);
                programmingLanguagesImageView.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.FadeIn).playOn(programmingLanguagesImageView);






    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        ImageView hardwareImageView = (ImageView) findViewById(R.id.hardware_home_icon);
//        hardwareImageView.setVisibility(View.VISIBLE);
//        ImageView operatingSystemImageView = (ImageView) findViewById(R.id.operating_system_icon);
//        operatingSystemImageView.setVisibility(View.VISIBLE);
//        ImageView officeImageView = (ImageView) findViewById(R.id.office_home_icon);
//        officeImageView.setVisibility(View.VISIBLE);
//        operatingSystemImageView.setVisibility(View.VISIBLE);
//
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            AboutDialogFragment aboutDialogFragment = new AboutDialogFragment();
            aboutDialogFragment.show(fragmentManager, "about");
            return true;
        }
        else if(id == R.id.action_disclaimer) {
            DisclaimerDialogFragment disclaimerDialogFragment = new DisclaimerDialogFragment();
            disclaimerDialogFragment.show(fragmentManager, "disclaimer");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public  void onHardwareIconClicked(View view) {
        Intent intent = new Intent(view.getContext(), HardwareActivity.class);
        startActivity(intent);
    }

    public void onOSIconClicked(View view) {
        Intent intent = new Intent(view.getContext(), OperatingSystemActivity.class);
        startActivity(intent);
    }

    public void onOfficeIconClicked(View view) {
        Intent intent = new Intent(view.getContext(), OfficeActivity.class);
        startActivity(intent);
    }
    public void onProgrammingLanguagesIconClicked(View view) {
        Intent intent = new Intent(view.getContext(), ProgrammingLanguages.class);
        startActivity(intent);
    }

    public static class AboutDialogFragment extends DialogFragment {
        static AboutDialogFragment newInstance() {
            return new AboutDialogFragment();
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.about_fragment_layout, container, false);

            return v;
        }
    }

    public static class DisclaimerDialogFragment extends DialogFragment {
        static DisclaimerDialogFragment newInstance() {
            return new DisclaimerDialogFragment();
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.disclaimer_fragment_layout, container, false);

            return v;
        }
    }
}
