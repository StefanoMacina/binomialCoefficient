package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean flag = true;

        while(true){

            System.out.println("total number of elements (!n) :");
            long n = s.nextLong();
            System.out.println("cardinality for each group (!k) ");
            long k = s.nextLong();

            long C = calculateBinomialCoefficient(n, k);
            DecimalFormat df = new DecimalFormat("#,###");
            System.out.printf("C (%d %d): = %s%n",n,k,df.format(C));
        }
    }

    public static long calculateBinomialCoefficient(long n, long k) {
        if (k < 0 || k > n) {
            return 0;
        }

        if (k == 0 || k == n) {
            return 1;
        }

        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }


}