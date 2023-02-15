import java.util.*;
public class test9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> h = new HashMap<>();
        HashMap<String,String> v = new HashMap<>();
        System.out.print("no of  pairs:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the pairs:");
        for(int i=0;i<n;i++){
            String s[] = sc.nextLine().split("\\s+");
            h.put(s[0],s[1]);
        }
        System.out.print("no of pairs:");
        int z= sc.nextInt();
        sc.nextLine();
        System.out.println("enter the pairs:");
        for(int i=0;i<z;i++){
            String s[] = sc.nextLine().split("\\s+");
            v.put(s[0],s[1]);
        }
        int c =0;
        for(String s:h.keySet()){
            if(v.containsKey(s)){
                if(h.get(s).equals(v.get(s))) c++;
            }
        }
        System.out.println("no of keyvalue pairs are:"+c);
        sc.close();
    }
}
