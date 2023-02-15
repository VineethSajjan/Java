/*
Bob Khan is working with various number systems.
He has created two kinds of addressing systems to share information 
between any two electronic devices.

Addresses in Type-I has following properties:
	- This addressing has four parts, each part is called as 'octet'
	- each octet can have a decimal value between 0 to 255 only
	- each part is separated by periods(.) 
	- Leading 0's are not allowed.
	- each part should conatins atmost 3 digits.

if any octet in the 4 parts, is not satisfying the rules
specified said to be  "invalid" addressing.


Addresses in Type-II has following properties:
	- This addressing has eight parts, each part is called as 'hextet'
	- each hextext can have a hexadecimal value between 0 to ffff only
	- each part is separated by colons (:) 
	- each part should conatins atmost 4 alphanumerics, 
	  as per hexademial number system.

if any hextet in the 8 parts, is not satisfying the rules
specified said to be "Invalid" addressing.
		
You will be given an address as a string	addr.
Your task is to find, whether the given address "addr" belongs to which asddress type.
And return "Type-I" if belongs to "Type-I" Addressing, 
return "Type-II" if belongs to "Type-II" Addressing, 
return "Invalid" if not belongs to either "Type-I"  or "Type-II"Addressing.


Input Format:
-------------
A string, an address addr.

Output Format:
--------------
Print a string output, as mentioned in above statement.


Sample Input-1:
---------------
213.234.45.12

Sample Output-1:
----------------
Type-I


Sample Input-2:
---------------
abcd:ef12:3456:7:dce8:fab9:1:0cda

Sample Output-2:
----------------
Type-II


Sample Input-3:
---------------
abcd:ef12:3456:7:0dce8:fab9:1:0cda

Sample Output-3:
----------------
Invalid


Sample Input-4:
---------------
123.234.34@.31

Sample Output-4:
----------------
Invalid


*/
/*import java.util.*;

public class Validip{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()<=15){
        String[] arr = s.split("\\.");
        if(arr.length==4){
            int c =0;
        try{
            for (String a : arr){
                if(a.length()>3){
                    System.out.println("Invalid");
                    return;
                }
                if(a.charAt(0)=='0'){
                    System.out.println("Invalid");
                    return;
                }
                int i = Integer.parseInt(a);
                if(i>=0 && i<=255)
                c++;
            }
            }catch (NumberFormatException e){
                System.out.println("Invalid");
                return;
            }
            if(c==4){
                System.out.println("Type-I");
                return;
            }
                
            }
        }
        if(s.length()>=15 && s.length()<40){
        String[] arr1 = s.split(":");
        if(arr1.length==8){
            int c1 =0;
            try{
            for(String a1: arr1){
                if(a1.length()>4){
                    System.out.println("Invalid");
                    return;
                }
                int i = Integer.parseInt(a1,16);
                if(i>=0 && i<=65535)
                c1++;
            }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid");
                return;
            }
    
                if(c1==8){
                    System.out.println("Type-II");
                    return;
                }
                else{
                    System.out.println("Invalid");
                    return;
                }
                
        }
        }
        System.out.println("Invalid");
        sc.close();

    }
}*/
import java.util.*;
class Validip{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            if(s.length()==0){
                System.out.println("Invalid");
            }
            else if((s.indexOf('.')>0 && s.indexOf(':')>0) || (s.indexOf('.')<0 && s.indexOf(':')<0)){
                System.out.println("Invalid");
            }
            else if(s.indexOf('.')>0){
                String arr[] = s.split("[.]");
                if(arr.length!=4){
                    System.out.println("Invalid");
                }
                else{
                    int flag = 0;
                    for(String i:arr){
                        if(i.charAt(0)=='0' || !isNum(i) ||  i.length()==0 || i.length()>4 || (Integer.valueOf(i)>=256 || Integer.valueOf(i)<0)){
                            System.out.println("Invalid");
                            
                            flag = 1;
                            return;
                        }
                    }
                    if(flag==0) System.out.println("Type-I");
                }
            }
            else{
                String arr[] = s.split(":");
                if(arr.length!=8){
                    System.out.println("Invalid");
                }
                else{
                    int flag = 0;
                    for(String i:arr){
                        if(!isHex(i) || i.length()==0 || i.length()>4 ){
                            System.out.println("Invalid");
                            flag = 1;
                            break;
                        }
                    }
                    if(flag==0) System.out.println("Type-II");
                }
                sc.close();
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static boolean isNum(String s){
        String ss = "0123456789";
        for(int i = 0;i<s.length();i++){
            if(ss.indexOf(s.charAt(i))<0) return false; 
        }
        return true;
    }
    
    public static boolean isHex(String s){
        String ss = "0123456789abcdefABCDEF";
        for(int i=0;i<s.length();i++){
            if(ss.indexOf(s.charAt(i))<0) return false;
        }
        return true;
    }
}


