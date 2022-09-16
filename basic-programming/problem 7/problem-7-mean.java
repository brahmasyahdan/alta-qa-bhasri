public class Mean {
    private static float Mean (float [] numbers){
        float sum =0;
       for (float value : numbers){
            sum+=value;
        }
        return sum / numbers.length ;
  }

    public static void main(String[] args) {
        float [] value = {1,2,3,4};
        System.out.println(Mean(value));

    }
}
