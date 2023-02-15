import java.util.*;
class SwitchGame{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(change(s));
        sc.close();
    }
    public static List<String> change(String s){
        List<String> l= new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            char a[] = s.toCharArray();
            if(s.charAt(i)=='+'&& s.charAt(i+1)=='+'){
                a[i]='-';
                a[i+1]='-';
                l.add(String.valueOf(a));
            }
        }
        return l;
    }
}
