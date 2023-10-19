public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace this with your Roman numeral

        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0; // Initialize the previous value as 0

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);

            int value;
            switch (currentChar) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    value = 0;
            }

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }
}
