import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //write code here...

        // Find the number of words in a string

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String sen = sc.nextLine();

        int count = 1;

        for (int i = 0; i <sen.length() ; i++) {
            if (sen.charAt(i)==' ' && sen.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("Number of words in string are : "+count);

    }
}
