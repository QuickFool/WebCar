package web.Service;

import java.util.List;
import web.models.Car;

public interface CarService {
    List<Car> getCarList(int count);
}