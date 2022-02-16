package exercises;

public class NumberToWords {

    public static int getDigitCount(int num) {
        if(num < 0) return -1;
        if(num == 0) return 1;


        int count = 0;
        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int reverse(int num) {
        int remainder;
        int reverseNum = 0;
        boolean isNegative = false;

        if(num < 0) {
            num = Math.abs(num);
            isNegative = true;
        }

        while(num > 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
        }
        if(isNegative == true) {
            return -reverseNum;
        }

        return reverseNum;

    }

    public static void numberToWords(int num) {
        if(num < 0) {
            System.out.println("Invalid value");
        } else if(num == 0){
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(num);
            int digitCount = getDigitCount(num);
            int reverseCount = getDigitCount(reversedNumber);

            String string = "";
            int remainder = 0;

            while(reversedNumber > 0) {
                remainder = reversedNumber % 10;
                switch (remainder) {
                    case 0 -> string = string + "Zero ";
                    case 1 -> string = string + "One ";
                    case 2 -> string = string + "Two ";
                    case 3 -> string = string + "Three ";
                    case 4 -> string = string + "Four ";
                    case 5 -> string = string + "Five ";
                    case 6 -> string = string + "Six ";
                    case 7 -> string = string + "Seven ";
                    case 8 -> string = string + "Eight ";
                    case 9 -> string = string + "Nine ";
                    default -> {
                    }
                }
                reversedNumber /= 10;
            }
            if(digitCount > reverseCount) {
                for(int i = 0; i < (digitCount - reverseCount); i++) {
                    string = string + "Zero";
                }
            }
            System.out.println(string);
        }


    }

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(-12);
    }
}
