package Review.Algorithm.print2largest;

public class print2largest1 {

    static int method(int[] arr){
        int largest = 0, secondLargest = -1;
        // find the largest in the array

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest])
                largest = i;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[largest]) {
                if(secondLargest == -1) {
                    secondLargest = i;
                }
                else if (arr[i] > arr[secondLargest])
                    secondLargest =i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {12,35,1,10,34,1};
        int secondLargest  = method(arr);
        if(secondLargest == -1)
            System.out.println("Second largest didn't exist");
        else System.out.println("Second largest: " + arr[secondLargest]);
    }
}
