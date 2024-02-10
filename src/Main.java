public class Main {
  public static void main(java.lang.String[] args) {
   Phone phone1 = new Phone(4676476, "Iphone", 6.98);
   phone1.printInfo();
   Phone phone2 = new Phone(47676376, "Android", 5.87);
   phone2.printInfo();
   Phone phone3 = new Phone(988646987, "Xiaomi", 2.3);
   phone3.printInfo();

   System.out.println();

   phone1.receiveCall("Jordan");
   phone1.setNumber(47568808);
   phone1.printNumber();
   phone2.receiveCall("Jaylen");
   phone2.setNumber(25467587);
   phone2.printNumber();
   phone3.receiveCall("Jeremy");
   phone3.setNumber(45767878);
   phone3.printNumber();

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
