import java.util.*;
public class test9a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        LinkedHashMap<Character,Integer> h = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        System.out.println(h);
        for(char ch:h.keySet()){
            System.out.print(ch+"-"+h.get(ch)+" ");
        }
        sc.close();
    }
}
