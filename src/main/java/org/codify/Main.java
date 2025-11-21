package org.codify;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    record Employee(Integer id, String add1, String add2){
        public List<String> sum(String add1, String add2){
            return Arrays.asList(add1,add2);
        }
    };

    public static void main(String[] args) {

        List<Employee> le = Arrays.asList(new Employee(1, "address test-1", "address test2"), new Employee(2, "address test-2", "address test2"));

        Map<Integer, List<String>> op = le.stream().collect(Collectors.groupingBy(Employee::id, Collectors.mapping((e)-> e.add1 + "," + e.add2, Collectors.toList())));
        System.out.println(op);
    }
}