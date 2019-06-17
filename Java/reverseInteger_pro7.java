class Solution {
    public int reverse(int x) {

        int x1 = Math.abs(x);
        long ans = 0;
        while (x1 > 0) {

            ans = ans * 10 + x1 % 10;
            x1 /= 10;
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
                return 0;
        }

        return x > 0 ? (int) ans : (int) -ans;
    }

}