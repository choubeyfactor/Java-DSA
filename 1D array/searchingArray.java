public class searchingArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        int ans = 0;
        int x = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {

                ans = i;
                System.out.println("We found x on index " + ans);

                break; // so that if the particular number which is searched
            }

            else {
                System.out.println("-1");
            }
        }

    }
}
