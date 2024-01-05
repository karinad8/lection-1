package tasks;

import java.util.Scanner;

public class fingerNr {

        public static int scanner(int nr) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the finger:");
            return sc.nextInt();
        }

        public static void swith (int finger) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the finger:");
            int nrFinger = sc.nextInt();
            String massage = switch (finger) {
                case 1 -> "It's thumb";
                case 2 -> "It's Index finger";
                case 3 -> "It's middle finger";
                case 4 -> "It's ring finger";
                case 5 -> "It's pinky";
                default -> "No such a finger";
            };
        }
    }

