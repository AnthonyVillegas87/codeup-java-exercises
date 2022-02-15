package control_flow_statements;

public class WhileStatement {

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }


    public static void main(String[] args) {
        int count = 0;
        while(count != 8) {
            System.out.println("My count is = " + count);
            count++;
        }

        count = 1;
        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("My value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while(count != 6);


        int number = 4;
        int finishNum = 22;
        while(number <= finishNum) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }



        int num = 4;
        int finishNumber = 22;
        int countNum = 0;
        while(num <= finishNumber) {
            num++;
            if(!isEvenNumber(num)) {
                continue;
            }
            System.out.println("Even number " + num);
            countNum++;
            if(countNum >= 5) break;
        }
        System.out.println("Total even numbers found = " + countNum);
    }
}
