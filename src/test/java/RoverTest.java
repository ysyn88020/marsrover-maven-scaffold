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
          Zone zone=new Zone(10,10, Rover.EAST);
          Rover rover=new Rover();
          rover.land(6,6, Rover.EAST,zone);
          String dot=rover.getDot();
          assertEquals(dot,"66E");
    }
    @Test
    public void should_load_the_rover_notOutBound() {
          Zone zone=new Zone(10,10, Rover.EAST);
          Rover rover=new Rover();
          assertThrows(RuntimeException.class,()->{rover.land(11,10, Rover.EAST,zone);});
    }
    @Test
    public void should_Move() {
        Zone zone=new Zone(10,10, Rover.EAST);
        Rover rover=new Rover();
        rover.land(6,6, Rover.EAST,zone);
        rover.move();
        assertEquals("76E",rover.getDot());
    }
    @Test
    public void should_MoveW() {
        Zone zone=new Zone(10,10, Rover.SOUTH);
        Rover rover=new Rover();
        rover.land(6,6, Rover.SOUTH,zone);
        rover.move();
        assertEquals("65S",rover.getDot());
    }
    @Test
    public void should_TurnLeft() {
        Zone zone=new Zone(10,10, Rover.EAST);
        Rover rover=new Rover();
        rover.land(6,6, Rover.EAST,zone);
        rover.turnLeft();
        assertEquals("66N",rover.getDot());
    }
    @Test
    public void should_TurnRight() {
        Zone zone=new Zone(10,10, Rover.EAST);
        Rover rover=new Rover();
        rover.land(6,6, Rover.EAST,zone);
        rover.turnRight();
        assertEquals("66S",rover.getDot());
    }
    @Test
    public void should_Move_Out_Bound() {
        Zone zone=new Zone(10,10, Rover.EAST);
        Rover rover=new Rover();
        rover.land(10,6, Rover.EAST,zone);
        assertThrows(RuntimeException.class,()->{ rover.move();;});
    }
}
