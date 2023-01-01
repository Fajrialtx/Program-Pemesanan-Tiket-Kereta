package tugasakhir;

import java.util.ArrayList;
import java.util.Date;

public class Penumpang {
    String nama;
    String nik;
    String telpon;
    String email;
    Date tgl;

    Penumpang(String nama, String nik, String telpon, String email, Date tgl){
        this.nama = nama;
        this.nik = nik;
        this.telpon = telpon;
        this.email = email;
        this.tgl = tgl;
    }

    void print(){
        System.out.println("Nama : "+this.nama);
        System.out.println("NIK : "+this.nik);
        System.out.println("No Hp : "+this.telpon);
        System.out.println("Email : "this.email);
        System.out.println("Tanggal Pemesanan : "+this.tgl);
    }
    void printidentitas(){
        System.out.println("Nama Penumpang : "+this.nama);
        System.out.println("NIK : "+this.id);
    }
}

class DataPenumpang{
    ArrayList<Penumpang> dataPenumpang = new ArrayList<Penumpang>();
    void tambahPenumpang(Penumpang data){
        this.dataPenumpang.add(data);
    }
    void tampilSemua(){
        System.out.println(" Daftar Penumpang Kereta");
        System.out.println("-------------------------");
        for (Penumpang item: this.dataPenumpang){
            item.print();
        }
    }
    void tampilPenumpang(int pilihan){
        dataPenumpang.get(pilihan).printidentitas();
    }
}
