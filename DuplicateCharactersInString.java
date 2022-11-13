package com.company;

public class Main {
    public static void main(String[] args) {
        //write code here...

        // find duplicate characters from string and its total count
        /*
                1) first we will take first character and compare with other character of string.
                2) if element found we will print and make flag value true.
                3) if element not found flag value remain false and no duplicate found get printed.
         */
        String sub = "AutomationTesting";

        // convert string into char array.

        char [] ch = sub.toCharArray();
        int count = 0;
        boolean flag = false;
        // iterate for loop and check each character.

        for (int i = 0; i<ch.length; i++){
            for (int j = i+1; j<ch.length; j++){
                if (ch[i] == ch[j]){
                    System.out.println("Duplicate found is : "+ch[j]);
                    count++;
                    flag = true;
                }
            }
        }
        if (flag==false){
            System.out.println("Duplicates not found");
        }
        System.out.println("Total duplicates are : "+count);
    }
}
