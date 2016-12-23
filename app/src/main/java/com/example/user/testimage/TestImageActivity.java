package com.example.user.testimage;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.Toast;
import android.os.Handler;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class TestImageActivity extends AppCompatActivity {

    Activity act = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_image);

        /*
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                printnote();
            }
        }, 2000);
        */


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                        printnote();
                }
            }, 3000);


    }

    public void printnote(){

         final ImageButton ib;

        Random k = new Random();
        int j = k.nextInt(9);
        switch(j){
            case 0:
                ib = (ImageButton) findViewById(R.id.imageButton1);
                ib.setImageResource(R.drawable.test1);
                final long startTime1 = System.currentTimeMillis();

                final Animation buttonin1 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout1 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout1);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton1).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime1 > 800 && endTime-startTime1 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime1 < 400 || (1800 < endTime-startTime1 && endTime-startTime1 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;
            case 1:
                ib = (ImageButton) findViewById(R.id.imageButton2);
                ib.setImageResource(R.drawable.test1);
                final long startTime2 = System.currentTimeMillis();

                final Animation buttonin2 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout2 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin2);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout2);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton2).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime2 > 800 && endTime-startTime2 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime2 < 400 || (1800 < endTime-startTime2 && endTime-startTime2 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;
            case 2:
                ib = (ImageButton) findViewById(R.id.imageButton3);
                ib.setImageResource(R.drawable.test1);
                final long startTime3 = System.currentTimeMillis();

                final Animation buttonin3 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout3 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin3);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout3);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton3).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime3 > 800 && endTime-startTime3 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime3 < 400 || (1800 < endTime-startTime3 && endTime-startTime3 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;
            case 3:
                ib = (ImageButton) findViewById(R.id.imageButton4);
                ib.setImageResource(R.drawable.test1);
                final long startTime4 = System.currentTimeMillis();

                final Animation buttonin4 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout4 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin4);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout4);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton4).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime4 > 800 && endTime-startTime4 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime4 < 400 || (1800 < endTime-startTime4 && endTime-startTime4 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;
            case 4:
                ib = (ImageButton) findViewById(R.id.imageButton5);
                ib.setImageResource(R.drawable.test1);
                final long startTime5 = System.currentTimeMillis();

                final Animation buttonin5 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout5 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin5);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout5);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton5).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime5 > 800 && endTime-startTime5 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime5 < 400 || (1800 < endTime-startTime5 && endTime-startTime5 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;
            case 5:
                ib = (ImageButton) findViewById(R.id.imageButton6);
                ib.setImageResource(R.drawable.test1);
                final long startTime6 = System.currentTimeMillis();

                final Animation buttonin6 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout6 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin6);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout6);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton6).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime6 > 800 && endTime-startTime6 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime6 < 400 || (1800 < endTime-startTime6 && endTime-startTime6 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;
            case 6:
                ib = (ImageButton) findViewById(R.id.imageButton7);
                ib.setImageResource(R.drawable.test1);
                final long startTime7 = System.currentTimeMillis();

                final Animation buttonin7 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout7 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin7);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout7);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton7).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime7 > 800 && endTime-startTime7 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime7 < 400 || (1800 < endTime-startTime7 && endTime-startTime7 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;
            case 7:
                ib = (ImageButton) findViewById(R.id.imageButton8);
                ib.setImageResource(R.drawable.test1);
                final long startTime8 = System.currentTimeMillis();

                final Animation buttonin8 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout8 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin8);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout8);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton8).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime8 > 800 && endTime-startTime8 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime8 < 400 || (1800 < endTime-startTime8 && endTime-startTime8 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;
            case 8:
                ib = (ImageButton) findViewById(R.id.imageButton9);
                ib.setImageResource(R.drawable.test1);
                final long startTime9 = System.currentTimeMillis();

                final Animation buttonin9 = AnimationUtils.loadAnimation(this, R.anim.fadein);
                final Animation buttonout9 = AnimationUtils.loadAnimation(this, R.anim.fadeout);

                ib.startAnimation(buttonin9);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.startAnimation(buttonout9);
                    }
                }, 1400);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ib.setVisibility(View.GONE);
                    }
                }, 2200);

                findViewById(R.id.imageButton9).setOnClickListener(
                        new ImageButton.OnClickListener(){
                            public void onClick(View v){
                                //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                                ib.setImageResource(R.drawable.test2);
                                long endTime = System.currentTimeMillis();
                                ib.setEnabled(false);
                                int judge;
                                if(endTime-startTime9 > 800 && endTime-startTime9 < 1400){
                                    judge = 0;
                                }else if(endTime-startTime9 < 400 || (1800 < endTime-startTime9 && endTime-startTime9 < 2200)){
                                    judge = 2;
                                }else {
                                    judge = 1;
                                }
                                Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                            }
                        }
                );
                break;

        }

        /*
        ib = (ImageButton) findViewById(R.id.imageButton1);
        ib.setImageResource(R.drawable.test1);
        final long startTime = System.currentTimeMillis();

        final Animation buttonin = AnimationUtils.loadAnimation(this, R.anim.fadein);
        final Animation buttonout = AnimationUtils.loadAnimation(this, R.anim.fadeout);

        ib.startAnimation(buttonin);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ib.startAnimation(buttonout);
            }
        }, 1400);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ib.setVisibility(View.GONE);
            }
        }, 2200);

        findViewById(R.id.imageButton1).setOnClickListener(
                new ImageButton.OnClickListener(){
                    public void onClick(View v){
                        //Toast.makeText(act.getBaseContext(),"버튼 클릭", Toast.LENGTH_LONG).show();
                        ib.setImageResource(R.drawable.test2);
                        long endTime = System.currentTimeMillis();
                        ib.setEnabled(false);
                        int judge;
                        if(endTime-startTime > 800 && endTime-startTime < 1400){
                            judge = 0;
                        }else if(endTime-startTime < 400 || (1800 < endTime-startTime && endTime-startTime < 2200)){
                            judge = 2;
                        }else {
                            judge = 1;
                        }
                        Toast.makeText(act.getBaseContext(),"판정값 : " + judge, Toast.LENGTH_LONG).show();
                    }
                }
        );
        */

    }//printnote()메소드 종료
}
