import java.util.*;
public class test4c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'a'|| c =='b' ||c =='c' ){
                sb.append(2);
            } 
            if(c =='d' || c =='e' ||c =='f' ){
                sb.append(3);
            }    
            if(c =='g' || c =='h' ||c =='i' ){
                sb.append(4);
            }    
            if(c == 'j'|| c =='k' ||c =='l' ){
                sb.append(5);
            }    
            if(c =='m' || c =='n' ||c =='o' ){
                sb.append(6);
            }    
            if(c =='p' || c =='q' ||c =='r'||c=='s' ){
                sb.append(7);
            }    
            if(c =='t' || c =='u' ||c =='v' ){
                sb.append(8);
            }    
            if(c == 'w'|| c =='x' ||c =='y'|| c=='z' ){
                sb.append(9);
            }       
        }
        System.out.println(sb);
        sc.close();
    }
}
