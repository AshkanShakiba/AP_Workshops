import java.util.ArrayList;
import java.util.Iterator;

/**
 * To have a painting system
 * @author Ashkan Shakiba
 * @version 1.0 (4/25/2021)
 */
public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Triangle> triangles;

    /**
     * Constructor to make paint system
     */
    public Paint(){
        circles=new ArrayList<>();
        rectangles=new ArrayList<>();
        triangles=new ArrayList<>();
    }

    /**
     * To add a new circle
     * @param circle
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }

    /**
     * To add a new rectangle
     * @param rectangle
     */
    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     * To add a new triangle
     * @param triangle
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * To draw all shapes
     */
    public void drawAll(){
        Iterator<Circle> circleIterator=circles.iterator();
        while (circleIterator.hasNext()){
            circleIterator.next().draw();
        }
        Iterator<Rectangle> rectangleIterator=rectangles.iterator();
        while (rectangleIterator.hasNext()){
            rectangleIterator.next().draw();
        }
        Iterator<Triangle> triangleIterator=triangles.iterator();
        while (triangleIterator.hasNext()){
            triangleIterator.next().draw();
        }
    }

    /**
     * To print all shapes
     */
    public void printAll(){
        Iterator<Circle> circleIterator=circles.iterator();
        while (circleIterator.hasNext()){
            System.out.print(circleIterator.next().toString());
        }
        Iterator<Rectangle> rectangleIterator=rectangles.iterator();
        while (rectangleIterator.hasNext()){
            System.out.print(rectangleIterator.next().toString());
        }
        Iterator<Triangle> triangleIterator=triangles.iterator();
        while (triangleIterator.hasNext()){
            System.out.print(triangleIterator.next().toString());
        }
    }
}