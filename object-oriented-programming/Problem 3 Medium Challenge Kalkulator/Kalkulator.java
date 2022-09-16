public class Kalkulator {

    int jumlah,bilA,bilB;
    //penjumlahan
    public void tambah(){
        jumlah=bilA+bilB;
        System.out.println("Penjumlahan: "+jumlah);
    }
    //pengurangan
    public void kurang(){
        jumlah=bilA-bilB;
        System.out.println("Pemgurangan: "+jumlah);
    }
    //perkalian
    public void kali(){
        jumlah=bilA*bilB;
        System.out.println("Perkalian: "+jumlah);
    }

    //pembagian
    public void bagi(){
        jumlah=bilA/bilB;
        System.out.println("Pembagian: "+jumlah);
    }
    
    public static void main(String[] args) {
        Kalkulator Penjumlahan=new Kalkulator();
        Penjumlahan.bilA=3;
        Penjumlahan.bilB=4;
        Penjumlahan.tambah();

        Kalkulator Pengurangan=new Kalkulator();
        Pengurangan.bilA=15;
        Pengurangan.bilB=4;
        Pengurangan.kurang();

        Kalkulator Perkalian=new Kalkulator();
        Perkalian.bilA=10;
        Perkalian.bilB=10;
        Perkalian.kali();

        Kalkulator Pembagian=new Kalkulator();
        Pembagian.bilA=12;
        Pembagian.bilB=4;
        Pembagian.bagi();
    }
}
