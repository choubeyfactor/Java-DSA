public class passbyref {

    public static void update(int[] marks, int x) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        int nonChangable = 10;
    }

    public static void main(String[] args) {

        int[] marks = { 97, 98, 99 };
        int nonChangable = 5;
        update(marks, nonChangable);

        // This 5 will not change as it is called by value and which doesnt affect main
        // section
        System.out.println(nonChangable);

        // marks array will be updated as it iscalled by refn.
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

}
