class maxofarray {

    int arr[] = { 5, 3, 6, 2, 8, 4 };

    void maxofarray() {

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("Max: " + ans);
    }

    public class maxofArray {
        public static void main(String[] args) {

            maxofarray obj = new maxofarray();
            obj.maxofarray();

        }
    }
}
