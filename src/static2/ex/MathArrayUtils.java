package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values){
        int sum=0;
        for(int i=0;i< values.length;i++){
            sum+=values[i];
        }
        return sum;
    }

    public static double average(int[] values){
        int sum=0;
        for(int i=0;i< values.length;i++){
            sum+=values[i];
        }
        return (double) sum/values.length;
    }

    public static int min(int[] values){
        int min=values[0];
        for(int i=0;i<values.length;i++) {
            min=Math.min(values[0],values[i]);
        }
        return min;
    }

    public static int max(int[] values){
        int max=values[0];
        for(int i=0;i<values.length;i++) {
           max= Math.max(values[0],values[i]);
        }
        return max;
    }
}
