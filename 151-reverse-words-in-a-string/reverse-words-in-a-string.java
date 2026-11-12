
class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                i++;
                continue;
            }
            int start = i;
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }
            words.add(s.substring(start, i));
        }
        int left = 0, right = words.size() - 1;
        while (left < right) {
            String temp = words.get(left);
            words.set(left, words.get(right));
            words.set(right, temp);
            left++;
            right--;
        }
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < words.size(); j++) {
            res.append(words.get(j));
            if (j < words.size() - 1) {
                res.append(" ");
            }
        }

        return res.toString();
    }
}