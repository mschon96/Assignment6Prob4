
/*
Name: Mariah Schon
Class : 3320-002
Program # : Assignment 6 Program 4
Due Date : Nov 17
Honor Pledge: On my honor as a student of the University
of Nebraska at Omaha, I have neither given nor received
unauthorized help on this homework assignment.
NAME: Mariah Schon
NUID: 581
EMAIL: mschon@unomaha.edu
Partners: CSLC
This program ....


*/

import java.util.Scanner;

public class prob4{

    public static void main (String[] args){

        int low, high;

        Scanner input = new Scanner(System.in);
        //        Scanner dinput = new Scanner(System.in);
        //        Scanner cinput = new Scanner(System.in);

        //prompts user for information, enters the information into variable ELEMENTS
        System.out.println("Enter heap elements: ");
        String elements = input.nextLine();

        //break up numbers and put into array
        String arr[]= elements.split(" ");
        int intArr[] = new int[arr.length];
        for (int i = 0; i < intArr.length; ++i) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        myDHeap dheap = new myDHeap(intArr);

        dheap.printOutput();
        System.out.printf("\n");

        System.out.print("Enter the low: ");
        low = input.nextInt();
        System.out.printf("\n");
        dheap.heapSort(low, high);
        dheap.printOutput();

    }
}
