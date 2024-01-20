package OOP;

    public class Main {
        public static void main(String[] args) {
            Fraction fraction = new Fraction(1, 23);
            System.out.println(fraction.toString());
            Fraction result = fraction.divideDouble(5);
            result.shortenFraction();
            System.out.println(result);
        }
    }

