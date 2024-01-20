package OOP;

public class Main2 {
        public static void main(String[] args) {
            Figure rectangle = new Rectangle(2, 3);
            Figure square = new Square(2);

            printFigureSquare(rectangle);
            printFigureSquare(square);
        }

        private static void printFigureSquare(Figure figure) {
            System.out.println("Figure " + figure.getClass() + " square is " + figure.getSquare());
        }
    }

