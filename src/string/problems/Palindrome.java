package string.problems;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");

        String a = sc.next();
        String b_a = a;
        String rev = "";
        int len = a.length();
        for (int i = len-1; i>=0;i--){
            rev = rev+a.charAt(i);
        }
        if (b_a.equals(rev)){
            System.out.println(b_a + " " +"is palindrome");
        }
        else{
            System.out.println(b_a +" " +"is not palindrome");
        }

    }
}
