package HomeWork2.Task3;

public class ElectricWorker implements Engineer{
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
        return "Finish work ontime";
    }

    @Override
    public void install() {
        System.out.println("Installing cables to equipments");
    }

    @Override
    public void connection() {
        System.out.println("Checking all connection of electric equipments");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the old electric equipments");
    }

    @Override
    public void deinstall() {
        System.out.println("Deinstalling the old cables and electric equipments");
    }
}
