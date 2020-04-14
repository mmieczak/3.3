public class Calculations {

    boolean isEven(int number) {
        return (number % 2 == 0);
    }

    boolean isOdd(int number) {
        return !isEven(number);
    }

    double circleField(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    long power(long number) {
        return number * number;
    }
}
