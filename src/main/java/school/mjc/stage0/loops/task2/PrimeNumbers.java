package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int inclusiveNumber = 2;

        while (inclusiveNumber <= printToInclusive){
            int otherNumbers = 2;
            boolean inclusive = true;

            while (otherNumbers < inclusiveNumber){
                if (inclusiveNumber % otherNumbers == 0) {
                    inclusive = false;
                    break;
                }
                otherNumbers++;
            }

            if (inclusive)
                System.out.println(inclusiveNumber);

            inclusiveNumber++;
        }
    }
}
