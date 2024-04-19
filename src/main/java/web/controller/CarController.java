package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService cs;

    @Autowired
    public CarController(CarService cs) {
        this.cs = cs;
    }
    @GetMapping(value = "/car")
    public String getCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        List<Car> cars = cs.getAllCars(count);
        model.addAttribute("cars", cars);
        return "car";
    }
}
