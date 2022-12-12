package Homework1.first;

public class PersonDemo {
    public static void main(String[] args) {
        Person human= new Person("White");
        System.out.println(human);
        human.move();
        System.out.println(human.move());
        Person human1=new Person("Blue", 42);
        System.out.println(human1);
        human1.talk();
        System.out.println(human1.talk());

    }
}
