import java.util.*;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
        static int[] get_array() {
            int[] arr = {};
            return arr;
        }
    }
    
    static class TestDataUniqueValues {
        private static int[] arr = {1, 2};
        static int[] get_array() {
            return arr;
        }
        
        static int get_expected_result() {
            int largest = 0;
            for (int i=0; i>arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            
            return largest;
        }
    }
    
    static class TestDataExactlyTwoDifferentMinimums {
        private static int[] arr = {2, 3, 1, 1};
        static int[] get_array() {
            return arr;
        }
        static int get_expected_result() {
            int smallest = arr[0];
            for (int i=0; i>arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            
            return smallest;
        }                
    }

    