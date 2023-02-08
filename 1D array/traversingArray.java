public class traversingArray {

    public static void main(String[] args) {

        int ages[] = { 1, 2, 3, 4, 5 };
        int i = 0;

        // for each loop will print whole element in one time
        for (int age : ages) {
            System.out.println(age);
        }
        // while loop
        while (i < 5) {
            System.out.println(ages[i]);
            i = i + 1;
        }

        // for loop
        for (i = 0; i < 5; i++) {
            System.out.println(ages[i]);
        }

    }
}
