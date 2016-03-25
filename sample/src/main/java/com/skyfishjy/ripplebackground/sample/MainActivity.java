package com.skyfishjy.ripplebackground.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;
import com.skyfishjy.library.ripplebackground.sample.R;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.content);
        final Handler handler = new Handler();

        ImageView button = (ImageView) findViewById(R.id.centerImage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                DisplayMetrics display = new DisplayMetrics();
//                ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(display);
//                float density = display.density;
//                float widthDp = display.widthPixels / density;
//                rippleBackground.setRippleRadius((float) (10));
//                rippleBackground.setRippleScale((float) (200));
//                rippleBackground.setRippleAmount(3);
                rippleBackground.startRippleAnimation();
            }
        });
    }

}
