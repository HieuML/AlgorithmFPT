package Review.Algorithm.print2repeat;


public class printTwoElements {

    static void printTwoElements(int arr[])
    {
        int i;
        System.out.println("The repeat int element is: ");

        for (i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0)
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            else
//                cout << abs(arr[i]) << "\n";
            System.out.println(Math.abs(arr[i]));
        }

        System.out.println("The repeatint element is: ");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                System.out.println(i+1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 6, 4, 5, 5, 6, 2 };
        printTwoElements(arr);
    }
}
