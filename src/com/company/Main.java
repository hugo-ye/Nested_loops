package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        homework3();
    }

    public static void homework1_1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%d ", j);
            }
            System.out.print("\n");
        }
    }

    public static void homework1_2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= i + 4; j++) {
                System.out.printf("%d ", j);
            }
            System.out.print("\n");
        }
    }

    public static void homework2() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {9, 8, 7, 6, 5};
        boolean flag = false;
        for (int n = 0; n < a.length && !flag; n++) {
            for (int m = 0; m < b.length && !flag; m++) {
                if (a[n] == b[m]) {
                    flag = true;
                }
            }
        }
        System.out.print(flag);
    }

    public static void homework3() {
        int[] nums = new int[]{3, 7, 4};
        int k = 0;
        while (k < 3) {
            int l = 0;
            while (l < 3) {
                if (!(k == l)) {
                    System.out.println(10 * nums[k] + nums[l]);
                }
                l = l + 1;
            }
            k = k + 1;
        }
    }

    public static void homework4_1() {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void homework4_2() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.print("\n");
        }
    }

    public static boolean uniques(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void homework6() {
        int[] a = {4, 4, 6, 11, -2, 3};
        int[] b = {5, 11, 11, -3, 3, 5};
        System.out.print("sym diff: ");
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < b.length && !found; j++) {
                if (a[i] == b[j]) {
                    found = true;
                }


            }
            System.out.printf(!found ? "%d " : "", a[i]);

        }
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length && !found; j++) {
                if (b[i] == a[j]) {
                    found = true;
                }


            }
            System.out.printf(!found ? "%d " : "", b[i]);
        }
    }
}
