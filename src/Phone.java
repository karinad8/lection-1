public class Phone {
    private long number;
    private String model;
    private double weight;

    public void printInfo(long number, String model, double weight) {
        System.out.println("Phone:" + "\n" + "number: " + number + "\n" + "model: " + model + "\n" + "weight: " + weight);
    }

    public void receiveCall(String name) { System.out.println(name + " calls"); }

    public void getNumber() {
        System.out.println(number);
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public void receiveCall(String name, long number) {
        System.out.println(name + "\n" + number);
    }


    public void sendMessage(long number1,long number2) {
        System.out.println("Do you want to send a massage to " + number1 + ", " + number2 + " " + "?");
    }

}
