package org.juaracoding.ujianjf;

import java.util.Scanner;

public class BaseCoveragePrinter {
    public static void main(String[] args) {

        // Menghitung Harga Print perlembar //
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Base Coverage: ");
        int baseCoverage = input.nextInt();
        double CMY = 7500;
        double K = 4500;
        double baseCoveragePrice = 5;
        int price = 216860;
        double averagePages = (CMY + K) / 2;
        double hasilBaseCoverage = (baseCoverage / baseCoveragePrice);
        double pageDiv = (averagePages / hasilBaseCoverage);
        double result = (price / pageDiv);
        int ceil = (int) Math.ceil(result);
        int resultFinal = ceil;

        System.out.println("Harga Print perlembar = Rp " + resultFinal);
    }
}
