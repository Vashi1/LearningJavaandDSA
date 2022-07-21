package Assignments;

import java.util.Scanner;

public class A1_q8 {
    //To find whether a string is palindrome or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        StringBuilder nest = new StringBuilder();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--){
            char ch = a.charAt(i);
            nest.append(ch);
//            n--;
        }
//        System.out.println(nest + " NEST");
        if (nest.toString().equals(a)){
            System.out.println("The String is a palindrome");
        }
        else{
            System.out.println("The String is not a palindrome");
        }
       }

}
