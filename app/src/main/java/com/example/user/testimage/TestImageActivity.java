package com.example.user.testimage;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

import static android.R.attr.start;

public class TestImageActivity extends AppCompatActivity {
    Activity act = this;

    public static int newnote1 = -1, newnote2 = -1; //두 칸노트생성함수의 새 노트위치 변수
    private static int save1 =-1, save2=-1;
    public static int oldsave1 = -1, oldsave2 = -1; //새 노트위치생성과 동시에 다음 노트생성을 위한
    public static int orCheck = -1;
    //                     old노트위치

    public static int newnote = -1; //한 칸 노트생성함수의 새 노트위치 변수
    private static int save =-1;
    public static int oldsave = -1; //새 노트위치생성과 동시에 다음 노트생성을 위한 old노트위치

    public static void sort1(int a) {                    //한개의 노트가 생성될 위치를 정하는 함수
//        System.out.println(a+" old note");	//마지막으로 생성된 old노트위치
        while (true) {                        //랜덤으로 노트위치를 정할 while문
            Random r = new Random();
            int mr = r.nextInt(9);                                // 0~8까지 총9개의 숫자중 하나를 랜덤으로 생성
            if (mr != a && mr != oldsave1 && mr != oldsave2) {    //랜덤숫자(mr)가 이전노트위치(a)와 다를경우
                save = mr;                                    // 새롭게 생성될 노트위치로
            } else {
                continue;                                        //숫자가 겹칠경우 다시
            }
            oldsave = save;                                    //또 다음 새 노트위치를 설정하기 위해 old노트위치로 save
            break;                                                //위치생성완료 후 while문 빠져나옴
        } // while문 종료
    } //sort1 함수 종료

    public static void sort2(int b, int c) {                //2개의 노트가 동시에 생성될 위치를 정하는 함수(b와c는 이전 노트위치를 받을
        //         parameter)
        System.out.println(b+" old note1");                 // 마지막으로 생성된 노트위치1
        System.out.println(c+" old note2");                 // 마지막으로 생성된 노트위치2
        while (true) {                                        //랜덤으로 노트위치를 정할 while문
            Random r = new Random();
            int mr1 = r.nextInt(9);                            // 0~8까지 총9개의 숫자중 하나를 랜덤으로 생성

//            if(oldsave!=-1){

            if (mr1 != b && mr1 != c && mr1 != oldsave) {    // 이전에 생성된 노트위치(b,c)와 다른 숫자일경우
                save1 = mr1;                                // 새롭게 생성될 노트위치1로
                int mr2 = r.nextInt(9);
                if (mr2 != mr1 && mr2 != b && mr2 != c && mr2 != oldsave) {// 이전에 생성된 노트위치(b,c)와 노트위치1과 다른
                    //                    숫자일경우
                    save2 = mr2;                            // 새롭게 생성될 노트위치2로
                    oldsave = -1;
                } else {
                    continue;
                }                            //숫자가 겹칠경우 다시
            } else {
                continue;
            }                                //숫자가 겹칠경우 다
//            else{
//                if (mr1 != b && mr1 != c) {	// 이전에 생성된 노트위치(b,c)와 다른 숫자일경우
//                    newnote1 = mr1;	                            // 새롭게 생성될 노트위치1로
//                    int mr2 = r.nextInt(9);
//                    if(mr2!=mr1 && mr2 != b && mr2 != c){// 이전에 생성된 노트위치(b,c)와 노트위치1과 다른
//                        //                    숫자일경우
//                        newnote2=mr2;	                        // 새롭게 생성될 노트위치2로
//                    }else{continue;}	                        //숫자가 겹칠경우 다시
//                }else{continue;}
//            }
            oldsave1 = save1;                                // 또 다음 새 노트위치를 설정하기 위해 oldnote1로 save
            oldsave2 = save2;                                // 또 다음 새 노트위치를 설정하기 위해 oldnote2로 save
            break;                                            //두 개의 위치가 모두 설정되면 while문 빠져나옴
        } // while문 종료
    }
    //sort2 함수 종료

    public static void random() {
        // TODO Auto-generated method stub

        Random r = new Random();
        int make = r.nextInt(2);
        switch(make){
            case 0:
                if(oldsave==-1){
                    oldsave=0;
                    sort1(oldsave);
                }else{
                    sort1(oldsave);}
                System.out.println(newnote+" new note");
                orCheck=0;
                newnote = save;
                break;
            case 1:
                if(oldsave1==-1){
                    oldsave1=0;
                    oldsave2=0;
                    sort2(oldsave1, oldsave2);
                }else{
                    sort2(oldsave1, oldsave2);}
                System.out.println(newnote1+" new note1");
                System.out.println(newnote2+" new note2");
//                    System.out.println("i=" + i);
                orCheck=1;
                newnote1 = save1;
                newnote2 = save2;
                break;


        }//switch 종료

    } //main함수 종료

    class NoteAc extends AsyncTask{

        @Override
        protected Object doInBackground(Object[] params) {
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
        }

        @Override
        protected void onProgressUpdate(Object[] values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onCancelled(Object o) {
            super.onCancelled(o);
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_image);

                random();
                if (orCheck == 0) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            printnote(newnote);
                            Log.i("체크", "1번");
                            Log.d("노트1개", String.valueOf(newnote));
                        }
                    }, 3000);
                } else if (orCheck == 1) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            printnote(newnote1);
                            printnote(newnote2);
                            Log.i("체크", "2번");
                            Log.d("노트2개", String.valueOf(newnote1));
                            Log.d("노트2개", String.valueOf(newnote2));
                        }
                    }, 3000);
                }
                Log.i("ass", String.valueOf(orCheck));
    }
    public void printnote(int a){

         final ImageButton ib;

        switch(a){
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