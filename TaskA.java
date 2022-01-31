/*
Francisco Serrano 
CS 1400 
Assignment 6
11/28/21 */
public class TaskA {
    static int counter=0;
    public  static void main(String[] args) {
        int[] b={2,2,2,2,3,4,5,6,4,2};
        int length= b.length; 
        System.out.print("Your number appeared:"+numberCount(b,2,length)+" time(s)"); 
    }
    public static int numberCount(int[] a, int target, int length) {
        // for when the array passed is empty
        if( length==0) {
            System.out.println("The empty array doesn't hold your desired value"); 
        }
        // condition to bound me as length decreases, starting at end of array
        else if(length>0) { 
            // length-1 to keep in bounds
            if (a[length-1]==target) { 
                // increase if they match
                counter++; 
            }
            // call again but index one less
            numberCount(a, target, length-1);
        }
        // return the number of times it appeared
        return counter;
    }

}
