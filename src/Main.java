/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Cameron To
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {




            int sum2 = add(3, 8);
            System.out.println("Sum of 3 and 8: " + sum2);


            int sum4 = add(3, 8, 4, 9);
            System.out.println("Sum of 3, 8, 4, and 9: " + sum4);


            String morningGreetingMessage = morningGreeting("Toby Fox");
            System.out.println(morningGreetingMessage);


            String afternoonGreetingMessage = afternoonGreeting("Mac Miller");
            System.out.println(afternoonGreetingMessage);


            String tripledString = triple("oohbaby");
            System.out.println("Tripled string: " + tripledString);


            double halfValue1 = half(8);
            System.out.println("Half of 8: " + halfValue1);
            double halfValue2 = half(17);
            System.out.println("Half of 17: " + halfValue2);


            int roundedPositive1 = roundPositiveValueToNearestInteger(8.5);
            System.out.println("Rounded 8.5: " + roundedPositive1);
            int roundedPositive2 = roundPositiveValueToNearestInteger(8.49);
            System.out.println("Rounded 8.49: " + roundedPositive2);


            int roundedNegative1 = roundNegativeValueToNearestInteger(-8.5);
            System.out.println("Rounded -8.5: " + roundedNegative1);
            int roundedNegative2 = roundNegativeValueToNearestInteger(-8.49);
            System.out.println("Rounded -8.49: " + roundedNegative2);
        }

        public static int add(int a, int b) {
            return a + b;
        }

        public static int add(int a, int b, int c, int d) {
            return add(a, b) + add(c, d);
        }

        public static String morningGreeting(String name) {
            return "早上好, " + name + "!";
        }

        public static String afternoonGreeting(String name) {
            return "下午好, " + name + "!";
        }

        public static String triple(String str) {
            return str + str + str;
        }

        public static double half(int value) {
            return value / 2.0;
        }

        public static int roundPositiveValueToNearestInteger(double value) {
            return (int) Math.round(value);
        }

        public static int roundNegativeValueToNearestInteger(double value) {
            return (int) Math.round(value);
        }
    }


