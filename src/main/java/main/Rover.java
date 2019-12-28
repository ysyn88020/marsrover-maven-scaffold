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

    private Zone zone;
    private Dot dot;

    public Rover(Dot dot, Zone zone) {
        this.dot = dot;
        this.zone = zone;
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    /**
     * 构造函数
     *
     * @param dot
     * @param zone
     */
    public void land(Dot dot, Zone zone) {
        if (dot.getX() > zone.getX() || dot.getY() > zone.getY()) {
            throw new RuntimeException("探测车越界了");
        }
    }

    public void action() {

    }

    /**
     * 获取当前位置
     *
     * @return
     */
    public String getDot() {
        return dot.toString();

    }

    /**
     * 向前移动
     */
    public void move() {
        if ("E".equals(dot.getDirection())) {
            dot.setX(dot.getX() + 1);
        } else if ("W".equals(dot.getDirection())) {
            dot.setX(dot.getX() - 1);
        } else if ("S".equals(dot.getDirection())) {
            dot.setY(dot.getY() - 1);
        } else if ("N".equals(dot.getDirection())) {
            dot.setY(dot.getY() - 1);
        }
        if (dot.getX() > zone.getX() || dot.getY() > zone.getY()) {
            throw new RuntimeException("探测机器人越界");
        }
    }

    /**
     * 左转动
     * *@param
     */
    public void turnLeft() {
        if ("E".equals(dot.getDirection())) {
            dot.setDirection(NORTH);
        } else if ("W".equals(dot.getDirection())) {
            dot.setDirection(SOUTH);
        } else if ("S".equals(dot.getDirection())) {
            dot.setDirection(WEST);
        } else if ("N".equals(dot.getDirection())) {
            dot.setDirection(EAST);
        }
    }

    /**
     * 右转
     */
    public void turnRight() {

        if ("E".equals(dot.getDirection())) {
            dot.setDirection(SOUTH);
        } else if ("W".equals(dot.getDirection())) {
            dot.setDirection(NORTH);
        } else if ("S".equals(dot.getDirection())) {
            dot.setDirection(WEST);
        } else if ("N".equals(dot.getDirection())) {
            dot.setDirection(EAST);
        }
    }


}



