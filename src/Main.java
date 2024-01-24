public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.printInfo(4676476, "Iphone", 6.98);
        Phone phone2 = new Phone();
        phone2.printInfo(47676376, "Android", 5.87);
        Phone phone3 = new Phone();
        phone3.printInfo(988646987, "Xiaomi", 2.3);

        System.out.println();

        phone1.receiveCall("Jordan");
        phone1.setNumber(47568808);
        phone1.getNumber();
        phone2.receiveCall("Jaylen");
        phone2.setNumber(25467587);
        phone2.getNumber();
        phone3.receiveCall("Jeremy");
        phone3.setNumber(45767878);
        phone3.getNumber();

        System.out.println();

        phone1.receiveCall("Jamel", 457478790);
        phone2.receiveCall("Niya", 667787879);
        phone3.receiveCall("Maya", 868786487);

        System.out.println();

        phone1.sendMessage(54367689, 45798809);
        phone2.sendMessage(57647647, 136578998);
        phone3.sendMessage(356465877, 74768979);
    }
}
