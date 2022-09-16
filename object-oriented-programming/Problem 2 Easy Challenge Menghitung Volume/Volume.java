public class Volume {
    //kubus
    int vKubus,sKubus;
    public void volume_kubus(){
        vKubus=sKubus*sKubus*sKubus;
        System.out.println("Kubus: "+vKubus);
    }
    //balok
    int vBalok,pBalok,lBalok,tBalok;
    public void volume_balok(){
        vBalok=pBalok*lBalok*tBalok;
        System.out.println("Balok: "+vBalok);
    }
    //tabung
    int rTabung,tTabung,vTabung;
    public void volume_tabung(){
        vTabung=(rTabung*rTabung)*tTabung*22/7;
        System.out.println("Tabung: "+vTabung);
    }

//main program
    public static void main(String[] args) {
        System.out.println("Volume: ");
        //kubus
        Volume Kubus = new Volume();
        Kubus.sKubus=10;
        Kubus.volume_kubus();
        //balok
        Volume Balok = new Volume();
        Balok.pBalok=3;
        Balok.lBalok=6;
        Balok.tBalok=10;
        Balok.volume_balok();
        //tabung
        Volume Tabung = new Volume();
        Tabung.rTabung=7;
        Tabung.tTabung=10;
        Tabung.volume_tabung();
    }
}
