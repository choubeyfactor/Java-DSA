public class traversingmultiDarray {
    public static void main(String[] args) {

        int ages[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        // for loop

        for (int i = 0; i < ages.length; i++) {

            // in below loop we are traversing the arr[0] and arr[1]
            for (int j = 0; j < ages[i].length; j++) {

                System.out.println(ages[i][j]);
            }

        }

    }
}
