import java.util.*;
import java.io.*;
import java.lang.*;

class SquareRootNaive {

    static int sqRootFloor(int x) {
        int i = 1;

        while (i * i <= x)
            i++;

        return i - 1;
    }

    public static void main(String args[]) {

        System.out.println(sqRootFloor(15));

    }

}
