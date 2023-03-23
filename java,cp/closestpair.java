class closestpair {
    public static void main(String[] args) {
       int ar1[] = {1, 4, 5, 7};
       int ar2[] = {10, 20, 30, 40};
       int min = Integer.MAX_VALUE;
       int v=31;
       int l=0;
       int r=ar2.length-1;
       int i=0,j=0;
       while(l<ar1.length&&r>=0){
           if(Math.abs(ar1[l]+ar2[r]-v)<min){
              i=ar1[l];
              j=ar2[r];
              min=Math.abs(ar1[l]+ar2[r]-v);
           }
           if(ar1[l]+ar2[r]>v){
                r--;
           }
           else{
               l++;
           }
       }
       System.out.println(i+","+j);
    }
}
