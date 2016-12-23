package com.example.user.testimage;

import java.util.Random;

/**
 * Created by user on 2016-12-22.
 */

public class NoteLocation { //노트위치를 생성할 class
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

        NoteLocation s1 = new NoteLocation();
        NoteLocation s2 = new NoteLocation();

        Random r = new Random();
            int make = r.nextInt(2);
            switch(make){
                case 0:
                    if(oldsave==-1){
                        oldsave=0;
                        s1.sort1(oldsave);
                    }else{
                        s1.sort1(oldsave);}
                    System.out.println(newnote+" new note");
                    orCheck=0;
                    newnote = save;
                    break;
                case 1:
                    if(oldsave1==-1){
                        oldsave1=0;
                        oldsave2=0;
                        s2.sort2(oldsave1, oldsave2);
                    }else{
                        s2.sort2(oldsave1, oldsave2);}
                    System.out.println(newnote1+" new note1");
                    System.out.println(newnote2+" new note2");
//                    System.out.println("i=" + i);
                    orCheck=1;
                    newnote1 = save1;
                    newnote2 = save2;
                    break;


            }//switch 종료

    } //main함수 종료

} //NoteLocation class종료
