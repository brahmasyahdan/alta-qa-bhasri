public class Ongkir {
    int p,l,t,berat,volume,harga;
    public void total_ongkir(){

        volume=p*l*t;
        harga=berat*5000;
        System.out.println("harga: "+harga);
    }
    
    public static void main(String[] args) {
        Ongkir TotalOngkir=new Ongkir();
        TotalOngkir.p=5;
        TotalOngkir.l=2;
        TotalOngkir.t=4;
        TotalOngkir.berat=1;
        TotalOngkir.total_ongkir();
    }
}
