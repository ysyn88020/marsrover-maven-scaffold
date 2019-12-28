package main;

/**
 * @author f_liwen
 * @version 1.0
 * @date 2019/12/28 16:24
 */
public class ComandController {
    public String excute(String command, Rover rover) {

        String[] a = command.split(":");
        for (String b : a) {
            if ("M".equals(b)) {
                rover.move();
            } else if ("L".equals(b)) {
                rover.turnLeft();
            } else if ("R".equals(b)) {
                rover.turnRight();
            }
        }
        return String.valueOf(rover.getX()) + String.valueOf(rover.getY()) + rover.getDirection();
    }
}
