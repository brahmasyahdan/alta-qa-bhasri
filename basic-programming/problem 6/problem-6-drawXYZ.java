public class drawXYZ {
    public static void drawWing(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print("w");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawWing(3);
    }
}
