package HomeWork2.Task3;

public class MechanicWorker implements Engineer{
    @Override
    public void documention() {
        System.out.println("Writting the report of given works");

    }

    @Override
    public void drawing() {
        System.out.println("Working by given drawings");

    }

    @Override
    public String getName() {
        return "Downloading the given plan";
    }

    @Override
    public void install() {
        System.out.println("Installing the given equipments");
    }

    @Override
    public void connection() {

    }

    @Override
    public void repair() {
        System.out.println("Repair the old equipments");

    }

    @Override
    public void deinstall() {
        System.out.println("Deinstalling the broken equipments");

    }
}
