package com.company;

import java.util.Scanner;

public class EXAM_Q1B {


    public static void main(String[] args) {
        EXAM_Q1B b = new EXAM_Q1B();

        System.out.println(b.period());

    }

    public int period() {
        Scanner scanner = new Scanner(System.in);
     //   int n = scanner.nextInt(); //n stores the array size
        int[] times = new int[4];

        for (int i = 0; i < times.length; i++) { //i<size of array 'times'
            times[i] = scanner.nextInt(); //storing input of array elements
        }
        int startTimeInMins = (times[0] * 60 + times[1]);
        int endTimeInMins = (times[2] * 60 + times[3]);

        int minutesWorked = (endTimeInMins - startTimeInMins);

        return minutesWorked;

    }


}