package com.unicorn.hms;

/**
 * @Author: kano_dayo
 * @Date:   2021/4/4 17:38
 */

public class RunClient {
    static Method scholarship = new Method();
    public static void main(String[] args) {
            scholarship.menu();
            scholarship.student();
            scholarship.result(Method.level);
    }
}