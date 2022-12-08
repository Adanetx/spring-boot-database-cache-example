package com.javadeveloperzone.another;

import com.fasterxml.jackson.core.JsonProcessingException;


import java.util.*;

public class Main1 {
    public static void main(String[] args) throws JsonProcessingException {
        List<Car> cars = new ArrayList(){{
            add(new Car(1, "Toyota", "camry"));
            add(new Car(2, "Nissan", "rodge"));
            add(new Car(3, "Ford", "escape"));
            add(new Car(4, "Honda", "civic"));
            add(new Car(5, "Bmw", "bw"));
            add(new Car(6, "Toyota", "highlander"));

        }};
 List<Integer> list = List.of(23, 78, 90, 515, 14, 1, 5, 79, 51, 5, 80, 98, 6);

 List<Double> doubleList = List.of(67.5, 80.0, 51.1, 72.61, 89.989, 552.5);
 double d = doubleList.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println(d);

    double reslt =     doubleList.stream().reduce(0.0, (x , y) -> x + y);
        System.out.println(" the result "+reslt);


 int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("the sum is "+sum);
int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("the minimum is "+min);
    Optional<Car> car = cars.stream().max((c1, c2) -> {

        if(c1.getId() > c2.getId()){
            return 1;
        }
        else if(c1.getId() < c2.getId()){
            return -1;
        }
        else return 0;
    }
    );

    Collections.sort(cars, (car1, car2)->car1.getName().compareTo(car2.getName()));
        System.out.println(cars);


     OptionalInt max =  list.stream().mapToInt(Integer:: intValue).max();
     int thisMax = max.getAsInt();
        System.out.println("the maximum is "+thisMax);


        System.out.println(car.get());
    }

}
