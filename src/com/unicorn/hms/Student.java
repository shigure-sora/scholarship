package com.unicorn.hms;

/**
 * @Author: kano_dayo
 * @Date:   2021/4/4 17:38
 */

public class Student {
    public String Num;
    public String Name;
    public int average;
    public int sum;
    public int level;
    int[] Score;
    public Student(String Num, String Name, int[] Score,int sum,int average,int level){
    this.Num = Num;
    this.Name = Name;
    this.Score =Score;
    this.sum = sum;
    this.average =average;
    this.level = level;
}
    public String getNum(){
        return Num;
    }
    public String getName(){
        return Name;
    }
    public int getlevel(){
        return level;
    }
    public int getAverage(){
        return average;
    }
}