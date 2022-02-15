package exercises;

public class SumThreeAndFive {

    public static void sum() {

        int count = 0;
        int val = 0;
        for(int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                val += i;

                System.out.println("Found number = " + i);
            }
            if(count == 5) {
                System.out.println("Exit");
                break;
            }

        }

        System.out.println("Sum = " + val);


    }
}
