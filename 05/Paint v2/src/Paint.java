import java.util.ArrayList;
import java.util.Iterator;

/**
 * To have a painting system
 * @author Ashkan Shakiba
 * @version 2.0 (4/26/2021)
 */
public class Paint {
    private ArrayList<Shape> shapes;

    /**
     * Constructor to make paint system
     */
    public Paint(){
        shapes=new ArrayList<>();
    }

    /**
     * To add a new shape
     * @param shape
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * To draw all shapes
     */
    public void drawAll(){
        Iterator<Shape> iterator=shapes.iterator();
        while (iterator.hasNext()){
            iterator.next().draw();
        }
    }

    /**
     * To print all shapes
     */
    public void printAll(){
        Iterator<Shape> iterator=shapes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    /**
     * To print add equal sides shapes
     */
    public void describeEqualSides(){
        Shape shape;
        Iterator<Shape> iterator=shapes.iterator();
        while (iterator.hasNext()){
            shape=iterator.next();
            if(shape instanceof Rectangle && ((Rectangle) shape).isSquare()){
                System.out.println(shape.toString());
            }
            if(shape instanceof Triangle && ((Triangle) shape).isEquilateral()){
                System.out.println(shape.toString());
            }
        }
    }
}