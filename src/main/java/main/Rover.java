package main;

/**
 * @author f_liwen
 * @version 1.0
 * @date 2019/12/28 15:33
 */
public class Rover {
    private int x;
    private int y;
    private String direction;
    private Zone zone;
    public void land(int x, int y, String direction,Zone zone) {
        this.x=x;
        this.y=y;
        this.direction=direction;
        this.zone=zone;
    }

    public String getDot() {
        return String.valueOf(x)+String.valueOf(y)+direction;

    }
}
