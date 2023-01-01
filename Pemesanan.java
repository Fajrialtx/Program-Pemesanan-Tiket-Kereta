package tugasakhir;

import java.util.ArrayList;

public class Pemesanan {
    public tugasakhir.DataKereta kereta;
    public tugasakhir.DataPenumpang penumpang;

    Pemesanan(tugasakhir.DataKereta kereta, tugasakhir.DataPenumpang penumpang){
        this.kereta = kereta;
        this.penumpang = penumpang;
    }
    void printPenumpang(int pil1){
        penumpang.tampilPenumpang(pil1);
    }
    void printKereta(int pil2){
        kereta.tampilKereta(pil2);
    }
}

class DataPemesanan{
    ArrayList<Pemesanan> dataPemesanan = new ArrayList<Pemesanan>();
    void tambahPemesanan(Pemesanan data){
        this.dataPemesanan.add(data);
    }

    void tampilPemesanan(int pil1, int pil2){
        System.out.println("Pemesanan Ke - "+ pil1+1);
        for (Pemesanan item: this.dataPemesanan){
            item.printPenumpang(pil1);
            item.printKereta(pil2);
        }
    }
}