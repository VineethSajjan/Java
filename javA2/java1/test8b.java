import java.util.*;
class test8b{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s[]=sc.nextLine().split(" ");
        Map<String,Integer> m=new HashMap<>();
        List<String> l=new ArrayList<>();
        for(String i: s){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(String i: m.keySet()){
            l.add(i);
        }
        Collections.sort(l,(a,b)->{if(m.get(a)==m.get(b)){return a.compareTo(b);}return m.get(b)-m.get(a);});
        System.out.println("the output is: ");
        for(String i:l){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
