class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; // Counter for $5 bills
        int ten = 0;  // Counter for $10 bills

        for (int bill : bills) {
            if (bill == 5) {
                five++; // Collect $5 bill
            } else if (bill == 10) {
                if (five > 0) {
                    five--; // Provide one $5 as change
                    ten++;  // Collect $10 bill
                } else {
                    return false; // Cannot provide change
                }
            } else if (bill == 20) {
                // Prefer to give one $10 and one $5 as change
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3; // Otherwise, give three $5 bills as change
                } else {
                    return false; // Cannot provide change
                }
            }
        }

        return true; // Successfully provided change to all customers
    }
}

/* 
Input
bills =
[5,5,5,10,20]
Output
true*/
