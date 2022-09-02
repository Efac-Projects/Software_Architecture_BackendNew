package Com.sensor.project.Controller;

import Com.sensor.project.Model.Sensor;
import Com.sensor.project.Services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SensorController {

    // sensor controller

    @Autowired
    private SensorService sensorService;

    @PostMapping("/sensor")
    public Sensor saveData(@RequestBody Sensor sensor) {
        return sensorService.saveData(sensor);
    }

    @GetMapping("/sensor")
    public List<Sensor> getData() {
        return sensorService.getData();
    }



}
