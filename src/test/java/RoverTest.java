import main.Rover;
import main.Zone;
import org.junit.jupiter.api.Test;
import org.mockito.internal.stubbing.answers.ThrowsException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
          rover.land(6,6,"E",zone);
          String dot=rover.getDot();
          assertEquals(dot,"66E");
    }
    @Test
    public void should_load_the_rover_notOutBound() {
          Zone zone=new Zone(10,10,"E");
          Rover rover=new Rover();
          assertThrows(RuntimeException.class,()->{rover.land(11,10,"E",zone);});
    }
    @Test
    public void should_Move() {
        Zone zone=new Zone(10,10,"E");
        Rover rover=new Rover();
        rover.land(6,6,"E",zone);
        rover.move();
        assertEquals("76E",rover.getDot());
    }
    @Test
    public void should_MoveW() {
        Zone zone=new Zone(10,10,"W");
        Rover rover=new Rover();
        rover.land(6,6,"W",zone);
        rover.move();
        assertEquals("56W",rover.getDot());
    }
}
