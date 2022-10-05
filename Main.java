import java.util.Arrays;
import java.util.Scanner;
public class Main {
    // write code here
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInt = getIntegers(5);
        int[] sorted = sortIntegers(myInt);
        printArray(sorted);
    }
    public static int[] getIntegers(int n){

        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");

        for(int i = 0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}