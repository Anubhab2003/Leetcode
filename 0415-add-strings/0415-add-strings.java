import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        BigInteger sum = bigNum1.add(bigNum2);
        return sum.toString();
    }
}
