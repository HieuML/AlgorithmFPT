package Review.Algorithm.print2largest;

public class print2largest3 {

    static void method(int arr[]) {

        /* There should be atleast three elements */

        if(arr.length <2) {
            System.out.println("invalid input");
        }

        int first = arr[0];

        // Find  largest element
        for(int i = 0; i < arr.length; i++ )
            if(arr[i] > first)
                first = arr[i];

        // Find second largest element
        int second = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > second && arr[i] < first)
                second = arr[i];

        System.out.println(second);
    }

    public static void main(String[] args) {

        int arr[] = { 12, 35, 1, 10, 34, 1 };

        method(arr);
    }
}
