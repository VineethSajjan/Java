/*Input: s = "226"
Output: 3
Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).*/
import java.util.*;
class Decodings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.print(numDecodings(s));
        sc.close();
    }
    public static int numDecodings(String s) {
        int m = s.length();
        int mem [] = new int[m];
        return numDecodings(s,0,mem);
    }
    public static int numDecodings(String s,int i,int mem[]){
        if(i==s.length()) return 1;
        if(mem[i]!=0) return mem[i];
        if(s.charAt(i)=='0') return 0;
        int count = numDecodings(s,i+1,mem);
        if(i<s.length()-1&&((s.charAt(i)-'0')*10+s.charAt(i+1)-'0')<27){
            count += numDecodings(s,i+2,mem);
        }
        return mem[i] = count;
    }
}