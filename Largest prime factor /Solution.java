// POTD 9TH AUG
class Solution {
    static long largestPrimeFactor(int N) {
        // code here
        for (long i = 2; i <= Math.sqrt(N); ++i) {
            if (N % i == 0) {
                N = (int) (N / i);
                i--;
            }
        }
        return N;
    }
}

