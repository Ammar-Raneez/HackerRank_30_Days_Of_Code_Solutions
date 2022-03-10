import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int consecutives = 0;
        int temp = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        List<String> binary = new ArrayList<>();

        while(n>0) {
            // Create binary representation
            // dividing by 2 till 0
            binary.add(String.valueOf(n%2));
            n /= 2;
        }
        for(int i=0;i<binary.size();i++) {
            if(binary.get(i).equals("0")) {
				temp = 0;
            }
            else {
            	temp++;
            }
            
            if(temp>consecutives) {
                consecutives = temp;
            }
        }
        System.out.println(consecutives);
    }
}
