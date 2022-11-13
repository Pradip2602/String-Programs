package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //write code here...

        // first of all rev the string and then check with original string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        // now we reverse the string
        //checking length of string.
        int len = str.length();
        //extract each character from string and store in rev
        String rev = "";

        //traverse string from end
        for (int i = len-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        // now compare rev with original
        if (rev.equals(str)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
