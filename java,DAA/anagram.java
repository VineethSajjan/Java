import java.util.*;
class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String t = sc.next();
        System.out.println(anag(s,t));
        sc.close();
    }
    public static boolean anag(String s,String t){
        char A[] = s.toCharArray();
        char B[] = t.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        int y=0;
        for(int i=0;i<A.length;i++){
            if(A[i] !=B[y]){
                return false;
            }
            y++;
        }
        return true;
    }
}