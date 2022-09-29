package com.company;

import java.util.Scanner;

public class EXAM_Q2A {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int n = scanner1.nextInt();       //length of array captured here

        String [] array= new String[n];
        for (int i = 0; i < n; i += 1) {
            array[i] = scanner2.nextLine();  //capturing elements of array
        }
        int max = 0;

        for(int a = 0; a < array.length; a += 1){
            if(array[a].length() > max){
                max = array[a].length();
            }
        }
        System.out.println(max + " x " + n);
    }

}

