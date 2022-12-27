package HomeWork2.Task3;

public class ElectricWorkerDemo {
    public static void main(String[] args) {
//        EngineerElectric electric=new ElectricWorker();
//        EngineerMechanic mechanic=new ElectricWorker();
//        Engineer engineer =new ElectricWorker();
//
//        electric.connection();
//        electric.install();
//        System.out.println("Mechanic");
//        mechanic.deinstall();
//        mechanic.repair();
//        System.out.println("Engineer");
//        engineer.documention();
//        engineer.drawing();
//        engineer.getName();

//        Engineer engineer = new MechanicWorker();
//        EngineerElectric electric =new MechanicWorker();
//        EngineerMechanic mechanic =new MechanicWorker();
//        engineer.install();
//        engineer.drawing();
//        engineer.documention();

        Engineer enginer = new MechanicWorker();
        outgoing(enginer);

    }

    public static void outgoing (Engineer engineers){
        engineers.documention();
    }
}
