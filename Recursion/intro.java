
public class intro {

    public static void PD(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        PD(n - 1);
    }

    public static void PI(int n) {
        if (n == 0) {
            return;
        }
        PI(n - 1);
        System.out.print(n + " ");
    }

    public static void PDI(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        PDI(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        PD(5);
        PI(5);
        PDI(5);
    }

}