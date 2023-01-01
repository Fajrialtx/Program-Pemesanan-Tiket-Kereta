package tugasakhir;

import java.util.ArrayList;
import java.time.LocalDate;

public class Kereta {
    String tujuan;
    String namakereta;
    String kelas;
    int harga;
    int kursi;
    LocalDate jadwal;
    String waktu;

    Kereta(String tujuan, String namakereta, String kelas,int harga, int kursi, LocalDate jadwal, String waktu){
        this.tujuan = tujuan;
        this.namakereta = namakereta;
        this.kelas = kelas;
        this.harga = harga;
        this.kursi = kursi;
        this.jadwal = jadwal;
        this.waktu = waktu;
    }
    void print (){
        System.out.println("Tujuan : "+this.tujuan);
        System.out.println("Nama Kereta : "+this.namakereta);
        System.out.println("Kelas Kereta : "+this.kelas);
        System.out.println("Harga : "+this.harga);
        System.out.println("No. Kursi : "+this.kursi);
        System.out.println("Tanggal Berangkat : "+this.jadwal+ "Pukul : "+this.waktu);
    }
}

class DataKereta{
    ArrayList<Kereta> dataKereta = new ArrayList<Kereta>();
    void tambahKereta(Kereta data){
            this.dataKereta.add(data);
        }
        void tampil(){
            System.out.println(" Daftar Kereta");
            System.out.println("---------------");
            for (Kereta item: this.dataKereta){
                item.print();
            }
        }
        void tampilKereta(int pilihan){
            dataKereta.get(pilihan).print();
        }
    }

