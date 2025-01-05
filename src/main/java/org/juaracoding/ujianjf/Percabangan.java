package org.juaracoding.ujianjf;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

        // Menghitung Total harga Tiket //
        Scanner input = new Scanner(System.in);
        LocalDate tanggalHariIni = LocalDate.now();
        DayOfWeek hariIni = tanggalHariIni.getDayOfWeek();

        System.out.print("Masukan jumlah tiket : ");
        int jumlahTiket = input.nextInt();

        double hargaPerTiket;
            if (hariIni == DayOfWeek.SATURDAY || hariIni == DayOfWeek.SUNDAY) {
                hargaPerTiket = 40000;
            } else {
                hargaPerTiket = 35000;
            }

        double totalHarga = jumlahTiket * hargaPerTiket;
        double diskonPersen = 0;

        if (jumlahTiket > 5) {
            diskonPersen = 10;
        }

        double diskon = totalHarga * (diskonPersen / 100 );
        double hargaSetelahDiskon = totalHarga - diskon;

        System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
        System.out.println("Selamat Anda Mendapatkan diskon: Rp " + diskon);
        System.out.println("Harga Akhir: Rp " + hargaSetelahDiskon );
    }
}
