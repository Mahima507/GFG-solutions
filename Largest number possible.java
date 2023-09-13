public static String findLargest(int N, int S) {
    StringBuilder ans = new StringBuilder();
    if (S == 0 && N > 1) {
        return "-1";
    }
    for (int i = 0; i < N; i++) {
        if (S > 9) {
            ans.append('9');
            S -= 9;
        } else {
            ans.append(Integer.toString(S));
            S -= S;
        }
    }
    if (S != 0) {
        return "-1";
    }
    return ans.toString();
}
