package Com.sensor.project.Services;

import Com.sensor.project.Model.Sensor;

import java.util.List;

public interface SensorService {

    Sensor saveData(Sensor sensor);

    List<Sensor> getData();
}
