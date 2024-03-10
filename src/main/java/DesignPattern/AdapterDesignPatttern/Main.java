package DesignPattern.AdapterDesignPatttern;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyObject
{

    int IntField;

    public int getIntField() {
        return IntField;
    }

    public void setIntField(int intField) {
        IntField = intField;
    }

    public MyObject(int intField) {
        IntField = intField;
    }
}
public class Main {


    public static void main(String[] args) {
//        WeightMachineAdapter weightMachineAdapter = new
//                WeightMachineAdapterImpl(new WeightMachineForBabies());
//        System.out.println(weightMachineAdapter.getWeightInKgs());

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = list2.stream();

        Stream<Integer> concatStream = Stream.concat(stream1,stream2);

        List<Integer> list = concatStream.collect(Collectors.toList());
    }
}
