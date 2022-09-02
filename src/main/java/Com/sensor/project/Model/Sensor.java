package Com.sensor.project.Model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@ToString
@Entity
public class Sensor {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dataId;
    private int sensorId;
    private String dateTime;
    private String dataValue;


}
