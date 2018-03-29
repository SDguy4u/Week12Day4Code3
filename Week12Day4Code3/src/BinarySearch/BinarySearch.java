package BinarySearch ;

import java.util.Arrays;

public class BinarySearch {
                
                private static int data[] = {19,70,8,2,11,15,111,25,21};
                
                public static int recursiveBinarySearch (int d[], int g, int left, int right) {
                                Arrays.sort(data);
        System.out.println("After sorting data  :"  + Arrays.toString(data));
                                int middle = (left + right)/2;
                                if (d[middle] != g && left <= right) {
                                                if (d[middle] > g) 
                                                                return recursiveBinarySearch (d, g, left, middle-1);
                                                else 
                                                                return recursiveBinarySearch (d, g, middle+1, right);
                                }
                                if (d[middle] == g) return middle;
                                else return -1;
                }
                
                public static void main (String [] args) {
                                int goal = 19;
                                int result = recursiveBinarySearch(data, goal, 0, data.length-1);
                                if (result < 0) System.out.println("The search could not find: " + goal);
                                else System.out.println("The goal of " + goal + " was found at index: " + result);
                }

}

