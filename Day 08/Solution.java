//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        HashMap<String, Integer> hash = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hash.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer output = hash.get(s);
            if(output != null){
                System.out.println(s+"="+output);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
