class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int aInd = a.length() - 1, bInd = b.length() - 1;
        int carry = 0;

        while (aInd >= 0 || bInd >= 0 || carry > 0) {
            int aValue = (aInd >= 0) ? (a.charAt(aInd) - '0') : 0;
            int bValue = (bInd >= 0) ? (b.charAt(bInd) - '0') : 0;
            int sum = aValue + bValue + carry;

            // Determine current bit and carry
            if (sum % 2 == 1) {
                ans.append('1');
                carry = (sum > 1) ? 1 : 0;
            } else {
                ans.append('0');
                carry = (sum > 0) ? 1 : 0;
            }

            if (aInd >= 0) aInd--;
            if (bInd >= 0) bInd--;
        }

        return ans.reverse().toString();
    }
}