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
                    for (int indeks=0; indeks<jumlah; indeks++);
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
                    int KotaTujuan=Integer.parseInt(scanner.nextLine());
                    if (KotaTujuan==1){
                        System.out.println("Kelas Kereta : \n1. Ekonomi\n2. Eksekutif\n3. Bisnis");
                        System.out.println("Kelas Kereta (1/2/3) :" );
                        int KelasKereta=Integer.parseInt(scanner.nextLine());
                        if (KelasKereta==1){
                            pemesanan.tambahPemesanan(new tugasakhir.Pemesanan(kereta, penumpang));
                            ArrayList<Integer> kursiMlgEko = new ArrayList<Integer>();
                            kursiMlgEko.add(1); kursiMlgEko.add(2); kursiMlgEko.add(3); kursiMlgEko.add(4); kursiMlgEko.add(5);                       kursiMlgEko.add(1); kursiMlgEko.add(1); kursiMlgEko.add(1); kursiMlgEko.add(1);
                            kursiMlgEko.add(6); kursiMlgEko.add(7); kursiMlgEko.add(8); kursiMlgEko.add(9); kursiMlgEko.add(10);
                            System.out.println("Kursi yang Tersedia : "+ kursiMlgEko);
                            System.out.println("Pilih Kursi : (1-10) :" );
                            int pilKursi=Integer.parseInt((scanner.nextLine()));
                            kursiMlgEko.remove(pilKursi-1);
                        } else if (KelasKereta==2) {
                            

                        }
                    }
            }
        }

    }
}