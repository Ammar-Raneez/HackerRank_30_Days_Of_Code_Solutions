import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numInput = sc.nextInt();
        String[] inputs = new String[numInput];

        for(int i=0;i<numInput;i++) {
            inputs[i] = sc.next();
        }

        for(String s : inputs) {
            for(int i=0;i<s.length();i+=2) {
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
            for(int i=1;i<s.length();i+=2) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
