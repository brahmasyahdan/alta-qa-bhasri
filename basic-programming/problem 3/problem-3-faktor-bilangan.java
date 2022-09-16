import java.util.Scanner;

public class faktorBilangan {
    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        bilangan=input.nextInt();
        System.out.println("Faktor Dari "+bilangan+" Adalah ");
        for (int i=1;i<=bilangan;i++){
            if (bilangan%i==0){
                System.out.println(i+"");
            }
        }
    }
}
