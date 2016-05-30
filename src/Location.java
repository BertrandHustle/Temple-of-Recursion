/**
 * This gets/sets coordinate locations for enemies and player (and items etc.)
 */

public class Location <Xcoord,Ycoord>{

    private Xcoord x;
    private Ycoord y;

    public Location(Xcoord x, Ycoord y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return (Integer)x;
    }

    public void setX(Xcoord x) {
        this.x = x;
    }

    public int getY() {
        return (Integer)y;
    }

    public void setY(Ycoord y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
