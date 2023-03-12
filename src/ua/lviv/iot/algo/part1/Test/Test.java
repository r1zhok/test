package ua.lviv.iot.algo.part1.Test;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Test {
    private String name;
    private String surname;
    private int age;

    public static void main(String[] args){
        List<Test> testStudent = new ArrayList<>();

        testStudent.add(new Test());
        testStudent.add(new Test("Oleksii", "Strizhyk", 18));

        System.out.println();
    }
}
