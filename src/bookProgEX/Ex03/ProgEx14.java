package bookProgEX.Ex03;

import java.util.Arrays;

public class ProgEx14 {
    public static void main(String[] args) {
        int [][] a = { {1, 2, 3}, {1, 2}, {1}, {1, 2, 3}};

        for (int [] row : a) {
            System.out.println(Arrays.toString(row));
        }

        }
    }
