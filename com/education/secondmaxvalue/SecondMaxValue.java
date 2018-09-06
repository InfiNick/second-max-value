package com.education.secondmaxvalue;

import java.util.ArrayList;


/**
 * Created by korzan on 7/26/2018.
 */
public class SecondMaxValue {


    public static void main(String[] args) {

        solution(args);
    }

    private static Integer[] targetArray = null;
    private static ArrayList<Integer> list = null;

    public static void checkInt(String array[]) {            //check integer numbers


        list = new ArrayList <Integer>();

        int n = 0;
        for (String s : array) {


            try {

                n = Integer.parseInt(s);
                list.add(n);
            } catch (NumberFormatException e) {

            }

        }

    }

    public static void ListToArray(ArrayList<Integer> list) {
        targetArray = list.toArray(new Integer[list.size()]);           // convert list to array

    }


    public static int secondLargest(Integer[] input) {     //second maximum number search algorithm
        int largest, secondLargest;

        if (input[0] > input[1]) {
            largest = input[0];
            secondLargest = input[1];
        } else {
            largest = input[1];
            secondLargest = input[0];
        }

        for (int i = 2; i < input.length; i++) {
            if ((input[i] <= largest) && input[i] > secondLargest) {
                secondLargest = input[i];
            }

            if (input[i] > largest) {
                secondLargest = largest;
                largest = input[i];
            }
        }

        return secondLargest;

    }

    public static void solution(String array[]) {               //start the methods needed to solve the task

        checkInt(array);
        ListToArray(list);
        System.out.println(secondLargest(targetArray));


    }

}



