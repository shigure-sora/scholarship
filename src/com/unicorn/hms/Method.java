package com.unicorn.hms;

/**
 * @Author: kano_dayo
 * @Date:   2021/4/4 17:38
 */

import java.util.LinkedList;
import java.util.Scanner;

import static com.unicorn.hms.RunClient.scholarship;

public class Method {
    static LinkedList<Student> studentList = new LinkedList<Student>();
    Scanner scan = new Scanner(System.in);
    public static int level = 0;
    void student() {
        System.out.println(">>>>>>>>>>>>请输入姓名 学号 课程1~4的成绩<<<<<<<<<<<<");
        String name = "";//姓名
        String num = "";//学号
        int level = 0;
        int[] score = new int[4];
        System.out.print("请输入姓名");
        name = scan.next();
        System.out.print("学号");
        num = scan.next();
        System.out.println("课程1~4的成绩");
        for (int i = 0; i <score.length; i++) {
            score[i] = scan.nextInt();
        }//输入分数
        int[] data = new int[2];
        for (int j = 0; j <score.length; j++) {
            int sum = 0;
            int size=score.length;
            for(int f=0;f<size;f++){
                sum += score[f];
            }//求总分
            int average = sum /size;
            data[0] = sum;
            data[1] = average;
        }//求平均分
        for (int a = 0; a <score.length; a++) {
            for (int b = 0; b <score.length; b++) {
                if (score[a]>=80 && data[1]>=85) {
                    level=1;//一等奖判定
                }else if(data[1]>=80 & score[a]>=70){
                    level =2;//二等奖判定
                }else if(data[1]>=80){
                    int x1=0,x2=0;
                    for(int x=0;x<=score.length;x++) {
                        if(score[a]<70 && score[b]>=60)
                            x1 = x1 + 1;
                        if(score[a]<70 && score[b]>=65)
                            x2 = x2 + 1;
                    }if(x1==5 || x2==5) {
                        level = 3;//三等奖判定
                    }else
                        scholarship.resultnull(Method.level);//无法参与
                }
            }
        }
        studentList.add(new Student(num, name, score, data[0], data[1],level));
    }//学生信息方法+奖学金评判方法
    void resultnull(int i){
        System.out.println(Method.studentList.get(i).getName()+"您不可参与评奖,继续努力");
    }
    void result(int i){
        if(Method.studentList.get(i).getAverage()<80){
            System.out.println(Method.studentList.get(i).getName()+"您不可参与评奖,继续努力");
        }else {
            System.out.println("名字:" + studentList.get(i).getName() +" "+ "学号:" + studentList.get(i).getNum() +" "+ "您可参评:" + studentList.get(i).getlevel() + "等奖学金");
        }
    }//输出方法

    void menu(){
        System.out.println("-----------------------------------------------");
        System.out.println("*************欢迎使用奖学金资格查询系统*************");
        System.out.println("-----------------------------------------------");
    }//一个简单的UI

}


