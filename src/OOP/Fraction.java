package OOP;

    public class Fraction {
        // Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
        public int numerator;

        public int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        private void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        private void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        public String getFractionString() {
            return this.numerator + " / " + this.denominator;
        }

        public Fraction multiplyDouble(double number) {
            int numbersAfterDot = this.numbersAfterDot(number);
            int multiplier = (int) Math.pow(10, numbersAfterDot);
            int numberInt = (int) (number * multiplier);

            this.numerator *= numberInt;
            this.denominator *= multiplier;

            Fraction resultFraction = new Fraction(this.numerator, this.denominator);
            resultFraction.shortenFraction();

            return resultFraction;

        }

        public void shortenFraction() {
            int resultNumerator = this.numerator / this.getLCD(this.numerator, this.denominator);
            int resultDenominator = this.denominator / this.getLCD(this.numerator, this.denominator);
            this.numerator = resultNumerator;
            this.denominator = resultDenominator;
        }

        // LCD - Largest Common Divisor
        private int getLCD(int number1, int number2) {
            int divisor = Math.max(number1, number2);
            int divisible = Math.min(number1, number2);
            int remainder = divisor % divisible;

            while (remainder != 0) {
                divisor = divisible;
                divisible = remainder;
                remainder = divisor % divisible;
            }

            return divisible;
        }

        private int numbersAfterDot(double number) {
            String numberStr = String.valueOf(number);// 101.503
            int indexDot = numberStr.indexOf('.');
            return numberStr.length() - indexDot - 1;

            //метод, делящий (деление) текущую дробь на число типа double,
            // переданное ему в параметре и возвращающий дробь - результат деления.
        }

        public Fraction divideDouble(double number) {
           // Fraction numberFraction = doubleToFraction(number);
           /* int numinator2 = this.numerator * numberFraction.getDenominator();
            int denominator2 = this.denominator * numberFraction.getNumerator();
           return new Fraction(numinator2,denominator2);*/
            Fraction fraction = multiplyDouble(1/number);
            return fraction;
        }
        public Fraction doubleToFraction (double number){
            int numbersAfterDot = numbersAfterDot(number);
            int multiply = (int) Math.pow(10, numbersAfterDot);
            int newNuminator = (int) (multiply * number);
            int newDenominator = multiply;
            return new Fraction(newNuminator,newDenominator);
        }


    }

