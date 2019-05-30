import java.nio.channels.Pipe;

public class MainProject {
    public static void main(String[] args){
        Point undef = new Point();
        //undef.info();

        Point first = new Point(67,44);
        //first.info();

        Point second = new Point(78,66);
       // second.info();

        Point third = new Point(121,180);
        //third.info();

        Point forth = new Point(110,4);
        //forth.info();

        Point[] coords = new Point[4];
        coords[0] = first;
        coords[1] = second;
        coords[2] = third;
        coords[3] = forth;

        System.out.println("All the coordinates:");
        for(int i=0; i<coords.length; i++) {
            coords[i].info();
        }

        System.out.println("\nAll even coordinates:");

        for(int i=0; i<coords.length; i++) {
            if (((coords[i].x) % 2 == 0)& ((coords[i].y) % 2 == 0)) {
                coords[i].info();
            }
        }

    }

}

class Point{
    int x,y;
    void info(){
        System.out.printf("x: %s\ty: %d\n", x,y);
    }
    Point(){};
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}