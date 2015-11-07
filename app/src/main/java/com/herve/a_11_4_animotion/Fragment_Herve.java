package com.herve.a_11_4_animotion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Herve on 2015/11/4.
 */
public class Fragment_Herve extends Fragment {


    LinearLayout view;
    TextView textView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = (LinearLayout) inflater.inflate(R.layout.fragment_herve, null);
        textView = (TextView) view.findViewById(R.id.textView);


        ScaleAnimation sca = new ScaleAnimation(0, 1, 0, 1);
        sca.setDuration(500);
        LayoutAnimationController controller = new LayoutAnimationController(sca, 0.5f);
        view.setLayoutAnimation(controller);
        return view;
    }
}
