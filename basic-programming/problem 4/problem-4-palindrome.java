public class Palindrome {
    private static boolean palindrome(String value){
        String kataKosong="";
        boolean  cekKata=false;
        for (int i=value.length()-1;i>=0;i--){
            kataKosong=kataKosong + value.charAt(i);
        }
        if (value.equals(kataKosong)){
            cekKata=true;
        }
        return cekKata;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
