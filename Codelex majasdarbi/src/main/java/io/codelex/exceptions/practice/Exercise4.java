package main.java.io.codelex.exceptions.practice;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            double d = getInput("-6");
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be an imaginary number.");
        }
    }

    public static double getInput(String s) {
        double d =  Double.parseDouble(s);
        if (d < 0) {
            throw new NonPositiveNumberException();
        }
        return d;
    }
}

