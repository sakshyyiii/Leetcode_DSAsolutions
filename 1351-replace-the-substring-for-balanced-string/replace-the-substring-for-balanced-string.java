class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int target = n / 4;
        int[] count = new int[128];
        for (char ch : s.toCharArray()) {
            count[ch]++;
        }
        if (count['Q'] == target && count['W'] == target &&
            count['E'] == target && count['R'] == target) {
            return 0;
        }
        int l = 0;
        int ans = n;
        for (int r = 0; r < n; r++) {
            count[s.charAt(r)]--;
            while (l < n && count['Q'] <= target &&
                            count['W'] <= target &&
                            count['E'] <= target &&
                            count['R'] <= target) {
                ans = Math.min(ans, r - l + 1);
                count[s.charAt(l)]++;
                l++;
            }
        }
        return ans;
    }
}