package OOP.PerminovS.lesson8.benchmarks;


import java.util.ArrayList;
import java.util.List;

class ArrayListAddToEnd {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        System.out.println(integers.size());

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;

        System.out.println(integers.size());
        System.out.println("Result = " + result + " ms");
    }
}
