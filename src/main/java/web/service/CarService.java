package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public List<Car> getAllCars(Integer count) {
        List<Car> cars= new ArrayList<>();
        cars.add(new Car("RangeRover", "White", 777));
        cars.add(new Car("Mercedes", "Black", 171));
        cars.add(new Car("BMW", "Grey", 234));
        cars.add(new Car("Porsche", "Красный", 456));
        cars.add(new Car("Porsche", " й", 456));
        return  cars.stream().limit(count).collect(Collectors.toList());
    }

}
