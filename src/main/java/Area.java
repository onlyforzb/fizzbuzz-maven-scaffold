public class Area {
    public int width;
    public int height;
    public Area(int x, int y) {
        this.width=x;
        this.height=y;
    }

    public boolean containsPointWithX(int x) {
        if(this.width<x){
            return false;
        }
        return true;
    }

    public boolean containsPointWithY(int y) {
        if(this.height<y){
            return false;
        }
        return true;
    }
}
