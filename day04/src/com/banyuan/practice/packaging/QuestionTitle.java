package com.banyuan.practice.packaging;

import java.util.Random;

/**
 * @Auther: 张伟
 * @Date: 2019/10/27
 * @Description: com.banyuan.practice.packaging
 * @version: 1.0
 */
public class QuestionTitle {

    public static Question[] inputQuestions(){
        Question[] questions=new Question[30];
        questions[0]=new Question(1,"1+1","1","2","3","4","A");
        questions[1]=new Question(2,"1+2","1","2","3","4","A");
        questions[2]=new Question(3,"1+3","1","2","3","4","A");
        questions[3]=new Question(4,"1+4","1","2","3","4","A");
        questions[4]=new Question(5,"1+5","1","2","3","4","A");
        questions[5]=new Question(6,"1+6","1","2","3","4","A");
        questions[6]=new Question(7,"1+7","1","2","3","4","A");
        questions[7]=new Question(8,"1+8","1","2","3","4","A");
        questions[8]=new Question(9,"1+9","1","2","3","4","B");
        questions[9]=new Question(10,"1+10","1","2","3","4","B");
        questions[10]=new Question(11,"1+11","1","2","3","4","B");
        questions[11]=new Question(12,"1+12","1","2","3","4","B");
        questions[12]=new Question(13,"1+13","1","2","3","4","B");
        questions[13]=new Question(14,"1+14","1","2","3","4","B");
        questions[14]=new Question(15,"1+15","1","2","3","4","B");
        questions[15]=new Question(16,"1+16","1","2","3","4","B");
        questions[16]=new Question(17,"1+17","1","2","3","4","C");
        questions[17]=new Question(18,"1+18","1","2","3","4","C");
        questions[18]=new Question(19,"1+19","1","2","3","4","C");
        questions[19]=new Question(20,"1+20","1","2","3","4","C");
        questions[20]=new Question(21,"1+21","1","2","3","4","C");
        questions[21]=new Question(22,"1+22","1","2","3","4","C");
        questions[22]=new Question(23,"1+23","1","2","3","4","C");
        questions[23]=new Question(24,"1+24","1","2","3","4","D");
        questions[24]=new Question(25,"1+25","1","2","3","4","D");
        questions[25]=new Question(26,"1+26","1","2","3","4","D");
        questions[26]=new Question(27,"1+27","1","2","3","4","D");
        questions[27]=new Question(28,"1+28","1","2","3","4","D");
        questions[28]=new Question(29,"1+29","1","2","3","4","D");
        questions[29]=new Question(30,"1+30","1","2","3","4","D");


        return questions;
    }
    public static Question[] getQuestions(Question[] questions){
        Question[] getQ=new Question[10];
        int[] x=new int[10];
        Random random=new Random();
        for(int i=0;i<x.length;i++){
            x[i]=random.nextInt(30);
            for(int j=1;j<i;j++){
                if (x[i]==x[j])
                    i--;
            }
        }
        for(int i=0;i<x.length;i++){
            getQ[i]=questions[x[i]];
        }
        return getQ;

    }
}
