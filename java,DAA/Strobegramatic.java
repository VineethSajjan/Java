import java.util.*;
class Strobegramatic{
    public static HashSet<String> strobe(int v){
        HashSet<String> h = new HashSet<>(); 
        if(v ==0){
         h.add("");
         return h;
        }
        if(v == 1){
            h.add("0");
            h.add("1");
            h.add("8");
            return h;
        }
        HashSet<String> j = strobe(v-2);
        HashSet<String> n = new HashSet<>();
        for(String k:j){
            n.add("0"+k+"0");
            n.add("1"+k+"1");
            n.add("8"+k+"8");
            n.add("6"+k+"9");
            n.add("9"+k+"6");
        }
        return n;

    }
    static List<Long> printele(int n){
        HashSet<String> h=strobe(n);
        List <Long> l=new ArrayList<>();
        for(String ele:h){
            
            long x=Long.parseLong(ele);
            ele=Long.toString(x);
            if(ele.length()==n){
                l.add(x);
            } 
            
        }
        
        Collections.sort(l);
        return l;
    }
    
    
    
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printele(n));
        sc.close();
    }
}