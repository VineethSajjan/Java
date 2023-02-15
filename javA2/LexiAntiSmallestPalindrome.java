/*Mr Shravan is given a word W, and W is a palindrome. Mr Shravan is 
allowed to replace only one letter in W, with any lowercase alphabet, 
such that the word W is not a palindrome again and which is the 
lexicographically smallest among all the possible options.

Examples of Lexicographical order are:
	- aaa is smaller than aab
	- abb is smaller than abc.

Return the lexicographically smallest string among all the possible options.

Input Format:
-------------
A String P, palindrome.

Output Format:
--------------
A String result.


Sample Input-1:
---------------
abcdcba

Sample Output-1:
----------------
aacdcba


Sample Input-2:
---------------
aaaa

Sample Output-2:
----------------
aaab


Sample Input-3:
---------------
aaabaaa

Sample Output-3:
----------------
aaabaab
*/
/*import java.util.*;
class LexiAntiSmallestpalindrome{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        System.out.println(pl(s));
        sc.close();
    }
    public static boolean isp(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            res=s.charAt(i)+res;
        }
        if(res.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }  
        public static String pl(String s){
        for(int ind=0;ind<s.length();ind++){
            char ch=s.charAt(0);
            
                int i=0;
                String res="";
                while(i<s.length()){
                    if(s.charAt(i)!='a'){
                    res=s.substring(0,i)+"a"+s.substring(i+1,s.length());
                    if(!isp(res)){
                        
                        return res;
                       
                    }
                    }
                    res="";
                    if(i==s.length()-1){
                        char x=(char)((int)(s.charAt(i)+1));
                        System.out.println(x);
                        res=s.substring(0,i)+x;
                        return res;
                    }
                    i++;
                    
                }
        }
        return"";
        }
}*/
import java.util.*;
public class LexiAntiSmallestPalindrome{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(check(s));
        sc.close();
    }
    static String check(String s){
        
        int f=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length/2;i++){
            if(a[i]!='a'){
                a[i]='a';
                f=1;
                break;
            }
        }
        if(f==0){
            a[a.length-1]='b';
        }
        return String.valueOf(a);
    }
}


