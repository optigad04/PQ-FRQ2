import java.util.Scanner;

public class Main{
    public static boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void sortArray(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do you want? ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)){
            System.out.println("The array is sorted in ascending order.");
        } else{
            System.out.println("The array is not sorted in ascending order.");
            sortArray(arr);
            System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
        }

        sc.close();
    }
}