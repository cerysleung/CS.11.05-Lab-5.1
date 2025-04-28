import java.util.Arrays;

public class ArrayUtility {

    public static void print(int[] array) {
        for (int i=0; i < array.length; i++){
            System.out.print(array[i] + ", ");

        }
    }

    public static int sum (int[] array) {
        int sum  = 0;
        for (int i=0; i < array.length; i++){
            sum = sum + array [i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++){
            sum = sum + array[i];
        }
        double sumdouble = sum;
        double average = sumdouble/array.length;
        double roundoff = Math.floor (average * 100.0)/ 100.0;
        return roundoff;
    }

    public static int minimum(int[] array) {
        int minimum = array [0];
        for (int i = 1; i < array.length; i++){
            if (array [i] < minimum){
                minimum = array [i];
            }
        }
        return minimum;
    }

    public static int maximum(int[] array) {
        int maximum = array [0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maximum){
                maximum = array [i];
            }
        }
        return maximum;
    }

    public static int evenCount(int[] array) {
        int evencount = 0;
        for (int i: array){
            if (i % 2 == 0){
                evencount = evencount + 1;
            }
        }
        return evencount;
    }

    public static int[] reverseOne(int[] array) {
        int [] newarray = new int [array.length];
        int j=0;
        for(int i = array.length -1; i >= 0; i--){
            newarray [j] = array [i];
            j++;
        }
        return newarray;
    }

    public static void reverseTwo(int[] array) {
        int [] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copy.length; i++){
            array [i] = copy[copy.length-i-1];
        }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        boolean finalanswer = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                finalanswer = true;
            }
        }
        return finalanswer;
    }

    public static boolean linearSearchString(String[] array, String str) {
        boolean finalanswer = false;
        for (int i = 0; i < array.length; i++){
            if(array [i].equals(str) ){
                finalanswer = true;
            }
        }
        return finalanswer;
    }

    public static void multiplyByTwo(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        for(int i = 0; i < copy.length; i++){
            array[i] = copy[i] * 2;
        }

    }

    public static void multiplyByN(int[] array, int n) {
        int[] copy = Arrays.copyOf(array, array.length);
        for(int i = 0; i < copy.length; i++){
            array[i] = copy[i] * n;

        }

    }

    public static String toString(int[] array) {
        String finalanswer = "";
        for(int i = 0; i < array.length; i++){
            int num = array[i];
            String intToStr = Integer.toString(num);
            if(i == array.length-1){
                finalanswer = finalanswer + intToStr;
            }
            else{finalanswer = finalanswer + intToStr + ", ";}
        }
        return finalanswer;
    }

    public static boolean twoSum(int[] array, int num) {
        boolean finalanswer = false;
        for(int numbertrack = 0; numbertrack < array.length; numbertrack++){
            for(int sumup = numbertrack+1; sumup < array.length; sumup++){
                if(array[numbertrack] + array[sumup] == num){
                    finalanswer = true;
                }
            }
        }
        return finalanswer;
    }

    public static void shiftRight(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        array[0] = copy[copy.length-1];
        for (int i = 1; i < array.length; i++){
                array[i] = copy[i-1];
        }

    }

    public static void shiftLeft(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        for(int i = 0; i < array.length-1; i++){
            array[i] = copy[i+1];
        }
        array[array.length-1] = copy[0];

    }

    public static void shiftRightNTimes(int[] array, int n) {
        int [] copy;
        for(int j = 0; j < n; j++){
            copy = Arrays.copyOf(array, array.length);
            array[0] = copy[copy.length-1];
            for(int i=1; i < array.length; i++){
                array[i] = copy[i-1];
            }
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for(int j = 0; j < n; j++){
            int[] copy = Arrays.copyOf(array, array.length);
            for(int i=0; i < array.length-1; i++){
                array[i] = copy[i+1];
            }
            array[array.length-1] = copy [0];
        }

    }


}
