package HomeWork2.Task2;

public abstract class PredatoryAnimals {
    //Peremenie i modifikator
    private String name;
    private int age;

    // metody getter i setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PredatoryAnimals(String name, int age) {
        this.name= name;
        this.age=age;
    }


    // abstracktni method
    public abstract void Hunter();

    // pereopredelenie
    @Override
    public String toString() {
        return "PredatoryAnimals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
