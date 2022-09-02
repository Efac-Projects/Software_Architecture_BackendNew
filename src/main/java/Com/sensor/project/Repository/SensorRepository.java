package Com.sensor.project.Repository;

import Com.sensor.project.Model.Sensor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends MongoRepository<Sensor,Long> {
}
