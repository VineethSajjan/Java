import java.util.*;
class StrobeFind{
    static boolean Strobe(String s,int l,int r){
        int c = s.charAt(l);
        int v = s.charAt(r);
        if(l<=r){
            if((c =='6' && v =='9')|| (c == '9' && v == '6') || (c == '0' && v =='0')|| (c =='1' && v == '1' )||(c == '8' && v == '8' )){
                l++;
                r--;
                return Strobe(s,l,r);
            }
            else{
                return false;
            }
        }
        return true;
        
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        System.out.println(Strobe(s, 0, s.length()-1));
        sc.close();
    }
}
