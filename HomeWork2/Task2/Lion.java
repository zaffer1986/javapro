package HomeWork2.Task2;

public class Lion extends PredatoryAnimals {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void Hunter() {
        System.out.println("Lion hunting in Buffalo!");
    }
}
