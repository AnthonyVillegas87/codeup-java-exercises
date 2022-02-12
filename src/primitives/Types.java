package primitives;

public class Types {
        public static void main(String[] args) {
            //INT OCCUPIES 32 BITS & A WIDTH OF 32
            int myValue = 10000;
            int myMinIntValue = Integer.MIN_VALUE;
            int myMaxIntValue = Integer.MAX_VALUE;

            System.out.println("Integer minimum value = " + myMinIntValue);
            System.out.println("Integer maximum value = " + myMaxIntValue);
            //Overflow
            System.out.println("Busted Max value = " + (myMaxIntValue + 1));
            //Underflow
            System.out.println("Busted Min value = " + (myMinIntValue - 1));
            //BYTE OCCUPIES 8 BITS &  A WIDTH OF 8
            byte myMinByteValue = Byte.MIN_VALUE;
            byte myMaxByteValue = Byte.MAX_VALUE;
            System.out.println("Byte Minimum Value = " + myMinByteValue);
            System.out.println("Byte Maximum Value = " + myMaxByteValue);
            //Long OCCUPIES 16 BITS & A WIDTH OF 16
            short myMinShortValue = Short.MIN_VALUE;
            short myMaxShortValue = Short.MAX_VALUE;
            System.out.println("Short Minimum Value = " + myMinShortValue);
            System.out.println("Short Maximum Value = " + myMaxShortValue);
            
            //LONG HAS A WIDTH 0F 64
            long myLongValue = 100L;
            long myMinLongValue = Long.MIN_VALUE;
            long myMaxLongValue = Long.MAX_VALUE;
            System.out.println("Long Minimum Value = " + myMinLongValue);
            System.out.println("Long Maximum Value = " + myMaxLongValue);

            int myTotal = (myMinIntValue / 2);

            byte myNewByteValue = (byte) (myMinByteValue / 2);

            short myNewShortValue = (short) (myMinShortValue / 2);

            System.out.println(myNewByteValue);

            byte validByte = 10;

            short validShort = 20;

            int validInt = 50;

            long validLong = 50_000 + 10L * (validByte + validShort + validInt ) ;
            System.out.println(validLong);

        }
}
