package com.yan.myanimation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by dell on 2017/2/16.
 */

public class MyValueAnimation extends Activity {

    private TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.value_animation);
        Button button_ = (Button) findViewById(R.id.button_);
        text_view = (TextView) findViewById(R.id.text_View);
        button_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                //进行启动动画
              /*  ObjectAnimator animator = ObjectAnimator.ofFloat(text_view, "alpha", 0.0f, 1.0f,0.0f,1.0f);
                animator.setDuration(2000);
                //执行模式
                animator.setRepeatMode(animator.REVERSE);
                animator.setRepeatCount(3);
                animator.start();*/

                /*ObjectAnimator animator = ObjectAnimator.ofFloat(text_view, "rotation", 0, 360);
                animator.setDuration(2000);
                animator.setRepeatMode(animator.REVERSE);
                animator.start();*/

             /*   ObjectAnimator animator = ObjectAnimator.ofInt(text_view, "backgroundColor", Color.BLUE, Color.RED);
                animator.setDuration(2000);
                animator.start();*/

                ObjectAnimator animator = ObjectAnimator.ofFloat(text_view, "TextSize",1 ,10);
                animator.setDuration(2000);
                animator.start();
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        Float value = (Float) animation.getAnimatedValue();
                        Log.i("TAG", "onAnimationUpdate: ++++++++++"+value);
                    }
                });
                animator.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Log.i("TAG", "onAnimationUpdate: ++++++结束了++++");
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
            }
        });
    }
}