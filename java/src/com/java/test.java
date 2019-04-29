package com.java;

public class test {
    public static void main(String[] args){
       int num = 10;
        System.out.println(num);
        printInfo(num);

       num = num <<1;//左移一位，后位补0，十进制为20，二进制为10100
        System.out.println(num);
        printInfo(num);
       num = num >>1;//右移一位
        System.out.println(num);
        printInfo(num);
        num = num >>>2;//无符号右移，忽略符号位，0补最高位
        System.out.println(num);
        printInfo(num);
    }
    private static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num));
          }
}

