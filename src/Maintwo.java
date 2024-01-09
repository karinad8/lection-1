public class Maintwo {
    public static void main(String[] args) {
        returnUnluckyNumbers();
        System.out.println(returnUnluckyNumbers());
    }

    public static int returnUnluckyNumbers() {
        int unluckyNumbers = 0;
        for (int i = 1; i < 100000; i++) {
            String strI = String.valueOf(i);
            if (strI.contains("4")|| strI.contains("13")) { // содержит
                unluckyNumbers++;
            }
        }
        return unluckyNumbers;
    }
}
