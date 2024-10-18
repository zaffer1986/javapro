package OOP.PerminovS.lesson29.T2;

public class T2 extends Thread{
    @Override
    public void run(){
        long sum=0;
        int counter=((int) (Math.random()*100));
        for (int i = 0; i <counter ; i++) {
            sum+=i;
        }

        System.out.println("My name is Thread: "+getName()+" Counter "+counter+" sum "+sum);
    }
}
