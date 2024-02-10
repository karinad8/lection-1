public class Phone {
    private long number;
    private java.lang.String model;
    private double weight;

    public Phone(long number, java.lang.String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void printInfo() {
        System.out.println("Phone:" + "\n" + "number: " + number + "\n" + "model: " + model + "\n" + "weight: " + weight);
    }

    public void receiveCall(java.lang.String name) {
        System.out.println(name + " calls");
    }

    public void printNumber() {
        System.out.println(number);
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public void receiveCall(java.lang.String name, long number) {
        System.out.println(name + "\n" + number);
    }


    public void sendMessage(long number1, long number2) {
        System.out.println("Do you want to send a massage to " + number1 + ", " + number2 + " " + "?");
    }

}