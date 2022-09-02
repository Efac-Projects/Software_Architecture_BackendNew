package Com.sensor.project.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Getter
@Setter
@ToString

@Document(collection = "Sensor")
public class Sensor {

    @Id
    private Long dataId;
    private int sensorId;
    private String dateTime;
    private String dataValue;


}
