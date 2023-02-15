/*
Mr Shravan is given a word W, and W cosists of lowercase alphabets and '#'. 
Mr Shravan is allowed to replace the '#' with any one lowercase alphabet, 
such that the word W is a palindrome and it has to be the lexicographically
smallest among all the possible options.

Your task is to help Mr Sharavan to return the lexicographically smallest 
palindrome string among all the possible options. 
OR "invlaid" if it is not possible.

Input Format:
-------------
A String W, consists of lowercase letters and #.

Output Format:
--------------
A String result.


Sample Input-1:
---------------
r#d#v##er

Sample Output-1:
----------------
redavader


Sample Input-2:
---------------
r#d#v#cer

Sample Output-2:
----------------
invalid
*/
import java.util.*;
class LexiSmallestPalindrome{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        if(s.length()%2!=0){
        if(arr[(s.length()/2)]=='#'){
            arr[(s.length()/2)]='a';
        }
        }
        while(i<j){
            System.out.println(i);
            System.out.println(j);
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!='#' && ch2!='#'){
                if(ch1!=ch2){
                    System.out.println("invalid");
                    System.exit(0);
                    
                }
            }
            if(ch1=='#' && ch2!='#'){
                arr[i]=ch2;
            }
            if(ch1!='#' && ch2=='#'){
                arr[j]=ch1;
            }
            
            if(ch1 =='#' && ch2=='#'){
                arr[i]='a';
                arr[j]='a';
            }
            i++;
            j--;
        }
        System.out.println(String.valueOf(arr));
        sc.close();
    }
}

