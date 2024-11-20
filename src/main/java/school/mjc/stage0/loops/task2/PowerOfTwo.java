package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        int valuePow = 1;

        if (power < 0)
            System.out.println("too much power");

        while (counter <= power){
            System.out.println(valuePow);
            valuePow *= 2;
            counter++;
        }
    }
}
