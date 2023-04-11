
public class MaxMethod {
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        int m = Integer.MIN_VALUE;
        for(int i:values){
            m= Math.max(m,i);
        }
        return m;
    }
}

