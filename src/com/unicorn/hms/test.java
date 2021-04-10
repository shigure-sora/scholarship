package com.unicorn.hms;

import java.util.Scanner;

public class test {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] score = new int[4];
        System.out.println("请输入成绩:");
        for (int i = 0; i < score.length; i++) {
            score[i] = scan.nextInt();
        }//输入分数
        int[] data = new int[2];
        for (int j = 0; j < score.length; j++) {
            int sum = 0;
            int size = score.length;
            for (int f = 0; f < size; f++) {
                sum += score[f];
            }//求总分
            int average = sum / size;
            data[0] = sum;
            data[1] = average;
        }//求平均分
        for (int a = 0; a < score.length; a++) {
            for (int b = 0; b < score.length; b++) {
                if (score[a] >= 80 && data[1] >= 85) {
                    System.out.println("您可评一等奖");//一等奖判定
                } else if (data[1] >= 80 & score[a] >= 70) {
                    System.out.println("您可评二等奖");//二等奖判定
                } else if (data[1] >= 80) {
                    int x1 = 0, x2 = 0;
                    for (int x = 0; x <= score.length; x++) {
                        if (score[a] < 70 && score[b] >= 60)
                            x1 = x1 + 1;
                        if (score[a] < 70 && score[b] >= 65)
                            x2 = x2 + 1;
                    }
                    if (x1 == 5 || x2 == 5) {
                        System.out.println("您可评三等奖");//三等奖判定
                    }
                }else {System.out.println("您不可参与评奖");}break;//无法参与;
            }break;
        }
    }
}
