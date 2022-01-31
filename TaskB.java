/*
Francisco Serrano 
CS 1400 
Assignment 6
11/28/21 */

public class TaskB {
    // to hold my position and sum
    static int current=0; 
    static int ourSum=0;
    // To demo my sum method
    public static void main(String[] args) {
        System.out.print(sum(5));
    }

    public static int sum(int target) {
        // up until the target number 
        if (target>=current) { 
            // add my current to sum, increment current and call again using same target 
            ourSum+=current;
            current++;
            sum(target); 
        }
        // return the sum once all other calls are able to execute
        return ourSum;
    }
}