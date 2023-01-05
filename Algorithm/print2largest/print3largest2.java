package Review.Algorithm.print2largest;

public class print3largest2 {

    static void method(int arr[]) {


        /* There should be at least three elements */

        if (arr.length < 3) {
            System.out.println("invalid input");
        }

        int first = arr[0], second = 0, third = 0;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third)
                third = arr[i];
        }

        System.out.println(third);

    }

    public static void main(String[] args) {

        int arr[] = { 12, 35, 1, 10, 34, 1 };

        method(arr);

    }
}
