import java.util.*;
class Encoder{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.print(convert(s));
        sc.close();
    }
    public static String convert(String s){
        String sb = "";
        for(int i=0;i<s.length();i++){
            if(constant(s.charAt(i))&&s.charAt(i)!=' '){
                sb+=s.charAt(i)+"#"+s.charAt(i);
            }
            else{
                sb+=s.charAt(i);
            }
        }
        return sb;
    }
    public static boolean constant(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return false;
        }
        else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return false;
        }
        return true;
    }
}
