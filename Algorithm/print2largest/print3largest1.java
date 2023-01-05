package Review.Algorithm.print2largest;

public class print3largest1 {
    static void method(int arr[]) {

        /* There should be at least three elements */

        if(arr.length <3) {
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

        // Find third largest element
        int third = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > third && arr[i] < second)
                third = arr[i];

        System.out.println(third);
    }

    public static void main(String[] args) {

        int arr[] = { 12, 35, 1, 10, 34, 1 };

        method(arr);

    }
}
