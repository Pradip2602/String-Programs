package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //write code here...

        // find duplicate element from an array
        /*
                1) first we will take first element and compare with other element of array.
                2) if element found we will print and make flag value true.
                3) if element not found flag value remain false and no duplicate found get printed.
         */
        String [] sub = {"math","science","history","biology","Math"};

        // taking flag variable to confirm duplicate found or not.
        boolean flag = false;
        
        for (int i = 0; i<sub.length; i++){
            for (int j=i+1; j<sub.length; j++){
                if (sub[i].equalsIgnoreCase(sub[j])){
                    System.out.println("Found Duplicate : "+sub[j]);
                    flag = true;
                }
            }
        }
        if (flag==false){
            System.out.println("No duplicates found");
        }
    }
}
