import main.ComandController;
import main.Dot;
import main.Rover;
import main.Zone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author f_liwen
 * @version 1.0
 * @date 2019/12/28 15:27
 */
public class RoverTest {

    private static Zone zone;

    //初始化区域
    @BeforeEach
    void init() {
        zone = new Zone(10, 10, Rover.EAST);
    }

    @Test
    public void should_load_the_rover_land() {
        Dot dot = new Dot(6, 6, Rover.EAST);
        Rover rover = new Rover(dot, zone);
        rover.land(dot, zone);
        assertEquals(rover.getDot().toString(), "66E");
    }

    @Test
    public void should_load_the_rover_land_outbound() {
        Dot dot = new Dot(11, 10, Rover.EAST);
        Rover rover = new Rover(dot, zone);
        assertThrows(RuntimeException.class, () -> {
            rover.land(dot, zone);
        });
    }

    @Test
    public void should_load_the_rover_move() {
        Dot dot = new Dot(6, 6, Rover.EAST);
        Rover rover = new Rover(dot, zone);
        rover.land(dot, zone);
        rover.move();
        assertEquals("76E", rover.getDot().toString());
    }

    @Test
    public void should_load_the_rover_turn() {
        Dot dot = new Dot(6, 6, Rover.EAST);
        Rover rover = new Rover(dot, zone);
        rover.land(dot, zone);
        rover.turnLeft();
        assertEquals("66N", rover.getDot().toString());
        rover.turnRight();
        assertEquals("66E", rover.getDot().toString());
    }

    @Test
    public void should_load_the_rover_move_outbound() {
        Dot dot = new Dot(10, 6, Rover.EAST);
        Rover rover = new Rover(dot, zone);
        rover.land(dot, zone);
        assertThrows(RuntimeException.class, () -> {
            rover.move();
            ;
        });
    }

    @Test
    public void should_load_the_rover_excute_command() {
        String command = "R:M";
        Dot dot = new Dot(6, 6, Rover.EAST);
        Rover rover = new Rover(dot, zone);
        rover.land(dot, zone);
        ComandController comandController = new ComandController();
        assertEquals("65S", comandController.excute(command, rover));
    }

}
