package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.print("a: ");
        a= sc.nextDouble();
        System.out.print("b: ");
        b= sc.nextDouble();
        if (a!=0){
            System.out.printf("phương trình có nghiệm "+ (-a/b));
        }else if (a==0||b==0){
            System.out.printf("phương trình vô nghiệm");
        }
    }
}
