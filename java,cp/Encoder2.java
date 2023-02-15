
import java.util.*;
public class Encoder2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //sc.nextInt();
       // sc.nextLine();
        int n=sc.nextInt();
        System.out.println(s);
        //System.out.println(n);
        char arr[][]=new char[n][s.length()];
        
        for(int i=0;i<n;i++){
            Arrays.fill(arr[i],'#');
        }
        if(n==1){
            System.out.println(s);
            System.exit(0);
        }
        
        int flag=0;
        
        int pos=0;
        
        
        for(int i=0;i<s.length();i++){
            
            if(flag==0){
            arr[pos][i]=s.charAt(i);
            pos++;
            if(pos==n){
                flag=1;
                pos--;
            }
            
            }
            if(flag==1){
                arr[pos][i]=s.charAt(i);
                
                pos--;
                
                if(pos<0){
                    flag=0;
                    pos=1;
                }
                
                
                
                
                
                
            }
            
            
            
            
            
            
            
            
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<s.length();j++){
               if(arr[i][j]!='#'){
                   sb.append(arr[i][j]);
               }
            }
            
        }
        
        System.out.println(sb.toString());
        
        
        
        sc.close();
        
        
}

    
}




