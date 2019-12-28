import main.Rover;
import main.Zone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author f_liwen
 * @version 1.0
 * @date 2019/12/28 15:27
 */
public class RoverTest {
    @Test
    public void should_load_the_rover_land() {
          Zone zone=new Zone(10,10,"E");
          Rover rover=new Rover();
          rover.land(5,5,"E",zone);
          String dot=rover.getDot();
          assertEquals(dot,"55E");
    }
}
