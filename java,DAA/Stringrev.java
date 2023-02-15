import java.util.*;
class Stringrev{
      public static String rev(String r){
          if(r.isEmpty()){
              return "";
          }
          return rev(r.substring(1))+r.charAt(0);
      }  
        
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(rev(s));
        sc.close();
    }
}
