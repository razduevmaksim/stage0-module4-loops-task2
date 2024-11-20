package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int multiplyValue = 0;

        if (multiplyByAndToInclusive > 0) {
            while (multiplyValue <= multiplyByAndToInclusive) {
                System.out.println(multiplyValue * multiplyByAndToInclusive);
                multiplyValue++;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (multiplyValue >= multiplyByAndToInclusive) {
                System.out.println(multiplyValue * (-multiplyByAndToInclusive));
                multiplyValue--;
            }
        }
    }
}
