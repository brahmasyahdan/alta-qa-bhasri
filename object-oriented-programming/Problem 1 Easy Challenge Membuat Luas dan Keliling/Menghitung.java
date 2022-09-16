import static java.lang.Math.sqrt;

public class Menghitung {
//persegi
    int sisi,lPersegi,kPersegi;
    public void luas_persegi(){
        lPersegi=sisi*sisi;
        System.out.println("Persegi: "+lPersegi);
    }
    public void keliling_persegi(){
        kPersegi=4*sisi;
        System.out.println("Persegi: "+kPersegi);
    }

//segitiga
    int alas,tinggi;
    double hipo,lSegitiga,kSegitiga;
    public void luas_segitiga(){
        lSegitiga=0.5*alas*tinggi;
        System.out.println("Segitiga: "+lSegitiga);
    }
    public void keliling_segitiga(){
        hipo= sqrt((alas*alas)+(tinggi*tinggi));
        kSegitiga=alas+tinggi+hipo;
        System.out.println("Segitiga: "+kSegitiga);
    }

//persegi panjang
    int p,l,lPersegiPanjang,kPersegiPanjang;
    public void luas_persegi_panjang(){
        lPersegiPanjang=p*l;
        System.out.println("Persegi Panjang: "+lPersegiPanjang);
    }
    public void keliling_persegi_panjang(){
        kPersegiPanjang=2*(p+l);
        System.out.println("Persegi Panjang: "+kPersegiPanjang);
    }

//main Program
    public static void main(String[] args) {
        System.out.println("Luas");

        //persegi
        Menghitung luasPersegi=new Menghitung();
        luasPersegi.sisi=4;
        luasPersegi.luas_persegi();

        //segitiga
        Menghitung luasSegitiga=new Menghitung();
        luasSegitiga.alas=3;
        luasSegitiga.tinggi=4;
        luasSegitiga.luas_segitiga();

        //persegi panjang
        Menghitung luasPersegiPanjang=new Menghitung();
        luasPersegiPanjang.p=7;
        luasPersegiPanjang.l=8;
        luasPersegiPanjang.luas_persegi_panjang();

        System.out.println("Keliling");

        //persegi
        Menghitung kelilingPersegi=new Menghitung();
        kelilingPersegi.sisi=4;
        kelilingPersegi.keliling_persegi();

        //segitiga
        Menghitung kelilingSegitiga=new Menghitung();
        kelilingSegitiga.alas=3;
        kelilingSegitiga.tinggi=4;
        kelilingSegitiga.keliling_segitiga();

        //persegi panjang
        Menghitung kelilingPersegiPanjang=new Menghitung();
        kelilingPersegiPanjang.p=7;
        kelilingPersegiPanjang.l=8;
        kelilingPersegiPanjang.keliling_persegi_panjang();


    }
}
