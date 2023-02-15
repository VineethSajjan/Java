import java.util.*;

class Item{
    
    int cost;
    int qty;
    double ratio;
    
    Item(int c,int q){
        
        cost=c;
        qty=q;
        ratio=((double)cost)/qty;
    }
}


class Solution{
    
    
    
    

            public static void main (String[] args) {
                Scanner sc=new Scanner(System.in);
                
                int n=sc.nextInt();
                int c=sc.nextInt();
                
                Item arr[]=new Item[n];
                
                for(int i=0;i<n;i++){
                    int co=sc.nextInt();
                    int q=sc.nextInt();
                    arr[i]=new Item(co,q);
                    
                   // System.out.println(arr[i].ratio);
                    
                }
                
                System.out.println(getRes(arr,c));
                
                
            }
             
        static double getRes(Item arr[],double c){            
                    
                Arrays.sort(arr,(a,b)->{
                    
                    if(a.ratio<b.ratio){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                    
                });   
                
                
                double totalvalue=0d;
                
                for(Item a:arr){
                    
                    if(c-a.qty>=0){
                        c=c-a.qty;
                        totalvalue+=a.cost;
                        //System.out.println(totalvalue);
                        if(c==0){break;}
                    }
                    else{
                        
                        //System.out.println("c="+c);
                        //System.out.println("a.ratio="+a.ratio);
                        totalvalue=totalvalue+(c*a.ratio);
                       //System.out.println(totalvalue);
                        c=0;
                        break;
                        
                        
                        
                    }
                
                    
                }
                            
                return totalvalue;
                
            }
}