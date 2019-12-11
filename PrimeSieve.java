import java.util.Arrays;

public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    public static void main(String[] args) {
        Arrays.fill(sieve, true); 
        sieve[0] = false;
        sieve[1] = false;
        int n =0;
     for( int i= 2; i <= sieve.length-1;i++){  
     for ( n= 2*i; n <= sieve.length-1;n+=i){
    if (i % n==0){
        sieve[i]=false;
    n++;
   }
    else {
     sieve[i]=true;
   }  
   System.out.println(java.util.Arrays.toString(sieve));
  } 
} 
}

    public static int[]collectPrimes(){
    int n = 0;
    for (int i=2; i<= sieve.length - 1; i++){
        if(sieve[i]=true){
        n++;
        int[] primes = new int[m];
        for( int m = i; m< sieve.length; m+=i){
             sieve[i]=prime[m];   
  }
  return prime;
 }
}
}




 

