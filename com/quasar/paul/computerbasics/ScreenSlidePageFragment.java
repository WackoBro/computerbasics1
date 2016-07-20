package com.quasar.paul.computerbasics;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ScreenSlidePageFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.welcome_text);
        YoYo.with(Techniques.FadeIn).playOn(textView);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.welcome_icon);
        YoYo.with(Techniques.FadeIn).playOn(imageView);

        TextView welcomeMessage = (TextView) rootView.findViewById(R.id.welcome_intro);
        YoYo.with(Techniques.FadeIn).playOn(welcomeMessage);

        TextView swipeLeftText = (TextView) rootView.findViewById(R.id.welcome_swipe_left);
        YoYo.with(Techniques.FadeIn).delay(700).playOn(swipeLeftText);

        ImageView arrowImage = (ImageView) rootView.findViewById(R.id.welcome_right_arrow);
        YoYo.with(Techniques.FadeIn).delay(700).playOn(arrowImage);

        return rootView;
    }


}