import java.util.*;
class partitionlabels{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(print(s));
    }
    public static List<Integer> print(String s){
        Map<Character,Integer> h=new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),i);
        }
        int v=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            max= Math.max(max,h.get(s.charAt(i)));
            if(max==i){
                l.add(max-v);
                v=max;
            }
        }
        return l;
    }
}