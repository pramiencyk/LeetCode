public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.hammingDistance(1, 3));
    }

    public int hammingDistance(int x, int y) {
        int num = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++ ){
            count += (num % 2 == 0) ? 0 : 1;
            num >>= 1;
        }
        return count;
    }

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        s = new String();
        for(int j = 0; j < strs.length; j++){
            char[] array = strs[j].toCharArray();
            int length = array.length;
            int half = (int) Math.floor(array.length / 2);
            for (int i = 0; i < half; i++) {
                array[i] ^= array[length - i - 1];
                array[length - i - 1] ^= array[i];
                array[i] ^= array[length - i - 1];
            }
            strs[j] = String.valueOf(array);
            s += ((j == 0) ? "" : " ") + strs[j];
        }
        return s;
    }
}
