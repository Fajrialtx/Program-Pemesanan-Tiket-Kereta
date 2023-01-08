package tugasakhir;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tugasakhir.DataKereta kereta = new tugasakhir.DataKereta();
        LocalDate now = LocalDate.now();
        LocalDate later = now.plusDays(7);
        kereta.tambahKereta(new tugasakhir.Kereta("Malang","Sancaka","Ekonomi",88000,1,later,"08.00"));
        kereta.tambahKereta(new tugasakhir.Kereta("Malang","Sancaka","Eksekutif",160000,2,later,"17.00"));
        kereta.tambahKereta(new tugasakhir.Kereta("Malang","Sancaka","Bisnis",240000,3,later,"12.00"));
        kereta.tambahKereta(new tugasakhir.Kereta("Semarang","Sri Tanjung","Ekonomi",88000,4,later,"10.00"));
        kereta.tambahKereta(new tugasakhir.Kereta("Semarang","Sri Tanjung","Eksekutif",160000,5,later,"09.00"));
        kereta.tambahKereta(new tugasakhir.Kereta("Semarang","Sri Tanjung","Bisnis",240000,6,later,"14.00"));
        kereta.tambahKereta(new tugasakhir.Kereta("Bandung","Sri Tanjung","Ekonomi",88000,7,later,"08.00"));
        kereta.tambahKereta(new tugasakhir.Kereta("Bandung","Sri Tanjung","Eksekutif",160000,8,later,"12.00"));
        kereta.tambahKereta(new tugasakhir.Kereta("Bandung","Sri Tanjung","Bisnis",240000,9,later,"10.00"));

        tugasakhir.DataPenumpang penumpang = new tugasakhir.DataPenumpang();
        boolean exit;

        while(exit = true){
            System.out.println(" Pemesanan Tiket Kereta");
            System.out.println("-------------------------");
            System.out.println("1. Pesan Tiket");
            System.out.println("2. Daftar Kereta");
            System.out.println("3. Daftar Penumpang");
            System.out.println("4. Exit");
            System.out.println("Masukkan Pilihan : ");

            int pilih = Integer.parseInt(scanner.nextLine());
            switch(pilih){
                case 1:
                    System.out.println("Masukkan Jumlah Penumpang : ");
                    int jumlah = Integer.parseInt(scanner.nextLine());
                    for (int indeks=0; indeks<jumlah; indeks++) {
                        System.out.println("Masukkan Nama : ");
                        String nama = scanner.nextLine();

                        System.out.println("Masukkan NIK : ");
                        String nik = scanner.nextLine();

                        System.out.println("Masukkan No.HP : ");
                        String telpon = scanner.nextLine();

                        System.out.println("Masukkan Email : ");
                        String email = scanner.nextLine();

                        Date tgl = new Date();
                        System.out.println("Tanggal Pemesanan : " + tgl.toString());

                        penumpang.tambahPenumpang(new tugasakhir.Penumpang(nama, nik, telpon, email, tgl));

                        tugasakhir.DataPemesanan pemesanan = new tugasakhir.DataPemesanan();
                        System.out.println("Kota Tujuan : \n1. Malang\n2. Semarang\n3. Bandung");
                        System.out.println("Kota Tujuan (1/2/3) : ");
                        int KotaTujuan = Integer.parseInt(scanner.nextLine());
                        if (KotaTujuan == 1) {
                            System.out.println("Kelas Kereta : \n1. Ekonomi\n2. Eksekutif\n3. Bisnis");
                            System.out.println("Kelas Kereta (1/2/3) :");
                            int KelasKereta = Integer.parseInt(scanner.nextLine());
                            if (KelasKereta == 1) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 0);
                                ArrayList<Integer> kursiMlgEko = new ArrayList<Integer>();
                                kursiMlgEko.add(1);
                                kursiMlgEko.add(2);
                                kursiMlgEko.add(3);
                                kursiMlgEko.add(4);
                                kursiMlgEko.add(5);
                                kursiMlgEko.add(1);
                                kursiMlgEko.add(1);
                                kursiMlgEko.add(1);
                                kursiMlgEko.add(1);
                                kursiMlgEko.add(6);
                                kursiMlgEko.add(7);
                                kursiMlgEko.add(8);
                                kursiMlgEko.add(9);
                                kursiMlgEko.add(10);
                                System.out.println("Kursi yang Tersedia : " + kursiMlgEko);
                                System.out.println("Pilih Kursi : (1-10) :");
                                int pilKursi = Integer.parseInt((scanner.nextLine()));
                                kursiMlgEko.remove(pilKursi - 1);
                            } else if (KelasKereta == 2) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 1);
                                ArrayList<Integer> kursiMlgEks = new ArrayList<Integer>();
                                kursiMlgEks.add(1);
                                kursiMlgEks.add(2);
                                kursiMlgEks.add(3);
                                kursiMlgEks.add(4);
                                kursiMlgEks.add(5);
                                kursiMlgEks.add(6);
                                kursiMlgEks.add(7);
                                kursiMlgEks.add(8);
                                kursiMlgEks.add(9);
                                kursiMlgEks.add(10);
                                System.out.print("Kursi yang tersedia : " + kursiMlgEks);
                                System.out.print("Pilih Kursi (1-10) : ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiMlgEks.remove(pilKursi - 1);

                            } else if (KelasKereta == 3) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 2);
                                ArrayList<Integer> kursiMlgBis = new ArrayList<Integer>();
                                kursiMlgBis.add(1);
                                kursiMlgBis.add(2);
                                kursiMlgBis.add(3);
                                kursiMlgBis.add(4);
                                kursiMlgBis.add(5);
                                kursiMlgBis.add(6);
                                kursiMlgBis.add(7);
                                kursiMlgBis.add(8);
                                kursiMlgBis.add(9);
                                kursiMlgBis.add(10);
                                System.out.print("Kursi yang tersedia : " + kursiMlgBis);
                                System.out.print("Pilih Kursi (1-10) : ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiMlgBis.remove(pilKursi - 1);


                            }
                        } else if (KotaTujuan == 2) {
                            System.out.println("Kelas Kereta : \n1. Ekonomi\n2. Eksekutif\n3. Bisnis");
                            System.out.println("Kelas Kereta (1/2/3) :");
                            int KelasKereta = Integer.parseInt(scanner.nextLine());
                            if (KelasKereta == 1) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 3);
                                ArrayList<Integer> kursiSmgEko = new ArrayList<Integer>();
                                kursiSmgEko.add(1);
                                kursiSmgEko.add(2);
                                kursiSmgEko.add(3);
                                kursiSmgEko.add(4);
                                kursiSmgEko.add(5);
                                kursiSmgEko.add(6);
                                kursiSmgEko.add(7);
                                kursiSmgEko.add(8);
                                kursiSmgEko.add(9);
                                kursiSmgEko.add(10);
                                System.out.println("Kursi yang Tersedia : " + kursiSmgEko);
                                System.out.println("Pilih Kursi : (1-10) :");
                                int pilKursi = Integer.parseInt((scanner.nextLine()));
                                kursiSmgEko.remove(pilKursi - 1);
                            } else if (KelasKereta == 2) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 4);
                                ArrayList<Integer> kursiSmgEks = new ArrayList<Integer>();
                                kursiSmgEks.add(1);
                                kursiSmgEks.add(2);
                                kursiSmgEks.add(3);
                                kursiSmgEks.add(4);
                                kursiSmgEks.add(5);
                                kursiSmgEks.add(6);
                                kursiSmgEks.add(7);
                                kursiSmgEks.add(8);
                                kursiSmgEks.add(9);
                                kursiSmgEks.add(10);
                                System.out.print("Kursi yang tersedia : " + kursiSmgEks);
                                System.out.print("Pilih Kursi (1-10) : ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiSmgEks.remove(pilKursi - 1);

                            } else if (KelasKereta == 3) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 5);
                                ArrayList<Integer> kursiSmgBis = new ArrayList<Integer>();
                                kursiSmgBis.add(1);
                                kursiSmgBis.add(2);
                                kursiSmgBis.add(3);
                                kursiSmgBis.add(4);
                                kursiSmgBis.add(5);
                                kursiSmgBis.add(6);
                                kursiSmgBis.add(7);
                                kursiSmgBis.add(8);
                                kursiSmgBis.add(9);
                                kursiSmgBis.add(10);
                                System.out.print("Kursi yang tersedia : " + kursiSmgBis);
                                System.out.print("Pilih Kursi (1-10) : ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiSmgBis.remove(pilKursi - 1);


                            }
                        } else if (KotaTujuan == 3) {
                            System.out.println("Kelas Kereta : \n1. Ekonomi\n2. Eksekutif\n3. Bisnis");
                            System.out.println("Kelas Kereta (1/2/3) :");
                            int KelasKereta = Integer.parseInt(scanner.nextLine());
                            if (KelasKereta == 1) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 6);
                                ArrayList<Integer> kursiBdgEko = new ArrayList<Integer>();
                                kursiBdgEko.add(1);
                                kursiBdgEko.add(2);
                                kursiBdgEko.add(3);
                                kursiBdgEko.add(4);
                                kursiBdgEko.add(5);
                                kursiBdgEko.add(6);
                                kursiBdgEko.add(7);
                                kursiBdgEko.add(8);
                                kursiBdgEko.add(9);
                                kursiBdgEko.add(10);
                                System.out.println("Kursi yang Tersedia : " + kursiBdgEko);
                                System.out.println("Pilih Kursi : (1-10) :");
                                int pilKursi = Integer.parseInt((scanner.nextLine()));
                                kursiBdgEko.remove(pilKursi - 1);
                            } else if (KelasKereta == 2) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 7);
                                ArrayList<Integer> kursiBdgEks = new ArrayList<Integer>();
                                kursiBdgEks.add(1);
                                kursiBdgEks.add(2);
                                kursiBdgEks.add(3);
                                kursiBdgEks.add(4);
                                kursiBdgEks.add(5);
                                kursiBdgEks.add(6);
                                kursiBdgEks.add(7);
                                kursiBdgEks.add(8);
                                kursiBdgEks.add(9);
                                kursiBdgEks.add(10);
                                System.out.print("Kursi yang tersedia : " + kursiBdgEks);
                                System.out.print("Pilih Kursi (1-10) : ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiBdgEks.remove(pilKursi - 1);

                            } else if (KelasKereta == 3) {
                                pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                                pemesanan.tampilPemesanan(indeks, 8);
                                ArrayList<Integer> kursiBdgBis = new ArrayList<Integer>();
                                kursiBdgBis.add(1);
                                kursiBdgBis.add(2);
                                kursiBdgBis.add(3);
                                kursiBdgBis.add(4);
                                kursiBdgBis.add(5);
                                kursiBdgBis.add(6);
                                kursiBdgBis.add(7);
                                kursiBdgBis.add(8);
                                kursiBdgBis.add(9);
                                kursiBdgBis.add(10);
                                System.out.print("Kursi yang tersedia : " + kursiBdgBis);
                                System.out.print("Pilih Kursi (1-10) : ");
                                int pilKursi = Integer.parseInt(scanner.nextLine());
                                kursiBdgBis.remove(pilKursi - 1);


                            }
                        }
                    }

                    break;
                case 2:
                    kereta.tampil();
                    break;

                case 3:
                    penumpang.tampilSemua();
                    break;

                case 4:
                    System.exit(0);
                    break;
            }



        }

    }

}