package main;

/**
 * @author f_liwen
 * @version 1.0
 * @date 2019/12/28 19:47
 */

public class Dot {

    private int x;
    private int y;
    private String direction;

    public Dot(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return String.valueOf(x) + y + direction;
    }

}
