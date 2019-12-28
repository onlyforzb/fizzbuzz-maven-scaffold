import java.awt.image.DirectColorModel;

public class Rover {
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    public static final String NORTH = "N";
    private int x;
    private int y;
    private String direction;
    public void land(Area area, int x, int y, String direction){
        if(!area.containsPointWithX(x)){
            throw new IllegalArgumentException(String.format("x=%d is out of area width %d", x, area.width));
        }
        if(!area.containsPointWithY(y)){
            throw new IllegalArgumentException(String.format("y=%d is out of area width %d", y, area.height));
        }
        this.x=x;
        this.y=y;
        this.direction=direction;
    }

    public String getPosition() {
        return String.format("%d%d%s", x, y, direction);
    }

    public void move() {
        if(direction.equals(EAST)){
            x+=1;
        }
        if(direction.equals(SOUTH)){
            y-=1;
        }
        if(direction.equals(WEST)){
            x-=1;
        }
        if(direction.equals(NORTH)){
            y+=1;
        }
    }

    public void turLeft() {
        if(direction.equals(NORTH)){
            this.direction= WEST;
            return;
        }
        if(direction.equals(WEST)){
            this.direction= SOUTH;
            return;
        }
        if(direction.equals(SOUTH)){
            this.direction= EAST;
            return;
        }
        if(direction.equals(EAST)){
            this.direction= NORTH;
            return;
        }
    }

    public void turRight() {
        if(direction.equals(NORTH)){
            this.direction= EAST;
            return;
        }
        if(direction.equals(EAST)){
            this.direction= SOUTH;
            return;
        }
        if(direction.equals(SOUTH)){
            this.direction= WEST;
            return;
        }
        if(direction.equals(WEST)){
            this.direction= NORTH;
            return;
        }
    }
}
