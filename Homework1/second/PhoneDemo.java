package Homework1.second;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone huawey = new Phone();
        huawey.number = 256526554;
        System.out.println("Phone number" +" -"+huawey.number);
        huawey.model = "Huawei-2450";
        System.out.println("Model" +" -" +huawey.model);
        huawey.weight=85.5;
        System.out.println("weight of telefon" + " -"+huawey.weight);

        huawey.receiveCall();
        System.out.println(huawey.receiveCall());
        huawey.gotNumber();
        System.out.println(huawey.gotNumber());

    }
}
