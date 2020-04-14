public class CalculationsTest {
    public static void main(String[] args) {

        Calculations cal = new Calculations();
        int testNumber = 3;

        System.out.println(testNumber + " is even:" + cal.isEven(testNumber));
        System.out.println(testNumber + " is odd:" + cal.isOdd(testNumber));
        System.out.println("Circle field of r=" + testNumber + " equals " + cal.circleField(testNumber));
        System.out.println("power of " + testNumber + " equals " + cal.power(testNumber));

        System.out.println(">>>>>>");

        testNumber = 2;
        System.out.println(testNumber + " is even:" + cal.isEven(testNumber));
        System.out.println(testNumber + " is odd:" + cal.isOdd(testNumber));
        System.out.println("Circle field of r=" + testNumber + " equals " + cal.circleField(testNumber));
        System.out.println("power of " + testNumber + " equals " + cal.power(testNumber));

        System.out.println("Circle field of r=" + 2.2 + " equals " + cal.circleField(2.2));

    }
}
