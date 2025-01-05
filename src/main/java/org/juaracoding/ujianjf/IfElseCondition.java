package org.juaracoding.ujianjf;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {

        // If Else Condition menentukan level dan salary SQA //
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama kandidat: ");
        String nama = input.nextLine();
        String divisi = "";
        String level = "";
        System.out.print("Masukan Nilai kandidat (0-10): ");
        int myValue = input.nextInt();
        int salary = 0;

        int standardCompany = 6;
        int standardSeniorAutomation = 8;
        int standardSeniorManual = standardCompany;

        if (myValue > standardCompany) {
            divisi = "QA utomation";
            if (myValue >= standardSeniorAutomation) {
                level = "Senior";
                salary = 10000000;
            } else {
                level = "Junior";
                salary = 8000000;
            }
        } else if (myValue > 0) {
            divisi = "QA Manual";
            if (myValue == standardSeniorManual) {
                level = "Senior";
                salary = 8000000;
            } else {
                level = "Junior";
                salary = 6000000;
            }
        } else {
            System.out.println("Maaf anda kurang beruntung");
        }
        System.out.println("Nama = " + nama);
        System.out.println("Divivi = " + divisi);
        System.out.println("Level = " + level);
        System.out.println("Salary/month = IDR. " + salary);
    }
}
