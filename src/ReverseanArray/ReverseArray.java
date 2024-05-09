
//https://www.geeksforgeeks.org/program-to-reverse-an-array/


package ReverseanArray;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the array you entered :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }
        sc.close();
//      int[] arr = {1, 2, 3, 4};
        int[] reversearray = reverse(arr);
        System.out.println("your reverse array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(reversearray[i]);
        }
        //using for each loop
//        for(int i : reversearray){
//            System.out.print(i+"");
//        }
    }
    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start <end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}