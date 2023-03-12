import ua.lviv.iot.algo.part1.Test.Lector;
import ua.lviv.iot.algo.part1.Test.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Test> testStudent = new ArrayList<>();

        testStudent.add(new Test());
        testStudent.add(new Test("Oleksii", "Strizhyk", 18));
        System.out.println(testStudent);

        List<Lector> testLector = new ArrayList<>();

        testLector.add(new Lector());
        testLector.add(new Lector("Zenoviy", "Veres", 50, "Programing"));
        System.out.println(testLector);
    }
}