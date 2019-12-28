package main;

/**
 * @author f_liwen
 * @version 1.0
 * @date 2019/12/28 15:33
 */
public class Rover {

    public static final String EAST = "E";
    public static final String WEST = "W";
    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    private int x;
    private int y;
    private String direction;
    private Zone zone;
    public void land(int x, int y, String direction,Zone zone) {
        this.x=x;
        this.y=y;
        this.direction=direction;
        this.zone=zone;
        if(x>zone.getX()||y>zone.getY())
        {
            throw new RuntimeException("探测车越界了");
        }
    }

    public String getDot() {
        return String.valueOf(x)+String.valueOf(y)+direction;

    }

    public void move() {
        if("E".equals(direction)){
            this.x=x+1;
        }else if("W".equals(direction)){
            this.x=x-1;
        }else if("S".equals(direction)){
            this.y=y-1;
        }else if("N".equals(direction)){
            this.y=y+1;
        }
    }

    public void turnLeft() {
        if("E".equals(direction)){
            this.direction=NORTH;
        }else if("W".equals(direction)){
            this.direction=SOUTH;
        }else if("S".equals(direction)){
            this.direction=EAST;
        }else if("N".equals(direction)){
            this.direction=WEST;
        }

    }
}
