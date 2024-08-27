package web.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("Model 1", "Series 1", 100));
        carList.add(new Car("Model 2", "Series 2", 200));
        carList.add(new Car("Model 3", "Series 1", 100));
        carList.add(new Car("Model 4", "Series 4", 400));
        carList.add(new Car("Model 5", "Series 2", 150));
    }

    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
