package com.quasar.paul.computerbasics;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

/**
 * Created by paul on 19/7/16.
 */
public class RelaunchButtonPageFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
                ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page_2, container, false);
                TextView featureHeader = (TextView) rootView.findViewById(R.id.welcome_features_header);
                YoYo.with(Techniques.FadeIn).playOn(featureHeader);

                TextView featureOne = (TextView) rootView.findViewById(R.id.welcome_feature_one);
                YoYo.with(Techniques.FadeIn).playOn(featureOne);

                TextView featureTwo = (TextView) rootView.findViewById(R.id.welcome_feature_second);
                YoYo.with(Techniques.FadeIn).playOn(featureTwo);


                TextView featureThree = (TextView) rootView.findViewById(R.id.welcome_feature_third);
                YoYo.with(Techniques.FadeIn).playOn(featureThree);



                Button button = (Button) rootView.findViewById(R.id.buttonClick);
                YoYo.with(Techniques.FadeInUp).duration(1000).playOn(button);
                button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(getActivity(), check.class);
                                startActivity(intent);
                                getActivity().finish();
                        }
                });

                return rootView;
        }



}