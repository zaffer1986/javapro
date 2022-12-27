package HomeWork2.Task2;

public class TestDemo {
    public static void main(String[] args) {
        Tiger tiger=new Tiger("Sherhan",5);
        Lion lion=new Lion("Simba", 6);
        System.out.println(tiger);
        System.out.println(lion);
        tiger.setName("Amur Tiger");
        System.out.println(tiger);
        lion.setName("Shram");
        System.out.println(lion);
        tiger.Hunter();
        lion.Hunter();

    }
}
