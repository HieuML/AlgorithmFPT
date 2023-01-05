package Review.Algorithm.print2largest;

public class print2largest2 {
    static void method(int arr[]) {

        int first = 0, second = 0;

        if(arr.length <2) {
            System.out.println("invalid input");
        }

        for(int i = 0 ; i < arr.length; i ++) {
            /* If current element is greater than first
           then update both first and second */

            if(arr[i] > first) {
                second = first;
                first = arr[i];

            }
            else if (arr[i] > second && arr[i] != first) second = arr[i];
        }
        if(second == 0 )
            System.out.println("There is no second largest element");
        else System.out.println("There is no second largest element" + second);

    }

    public static void main(String[] args) {

        int arr[] = { 12, 35, 1, 10, 34, 1 };

        method(arr);
    }
}
