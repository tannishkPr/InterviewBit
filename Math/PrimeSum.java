public class Solution {
    public boolean[] sieve(int n){
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
        prime[0] = false;
        prime[1] = false;
        for(int p = 2; p*p <=n; p++){ 
            if(prime[p] == true) 
            { 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        }
        return prime;
    }
    public ArrayList<Integer> primesum(int A) {
        boolean[] primes = sieve(A);
        for(int i=0;i<=A;i++){
            if(primes[i] && primes[A-i]){
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(i);
                arr.add(A-i);
                return arr;
            }
        }
        return new ArrayList<>();
    }
}
