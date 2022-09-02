package Com.sensor.project.Services.Impl;

import Com.sensor.project.Model.Sensor;
import Com.sensor.project.Repository.SensorRepository;
import Com.sensor.project.Services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorServiceImpl implements SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    @Override
    public Sensor saveData(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    @Override
    public List<Sensor> getData() {
        return sensorRepository.findAll();
    }
}
