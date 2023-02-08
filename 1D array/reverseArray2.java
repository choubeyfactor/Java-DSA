public class reverseArray2 {

    static void swap(int[] arr, int i, int j) { //swap function

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverseArrayz(int[] arr) {
        int i = 0, j = arr.length - 1;
//using sawap function which was created earlier
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    static void printArrayz(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverseArrayz(arr);
        printArrayz(arr);   //calling the func
    }

}
