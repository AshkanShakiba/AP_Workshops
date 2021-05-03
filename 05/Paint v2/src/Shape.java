/**
 * To simulate shapes
 * @author Ashkan Shakiba
 * @version 2.0 (4/26/2021)
 */
abstract public class Shape {
    public Shape(double... sides){
        if(sides.length==1){
            new Circle(sides[0]);
        }
        if(sides.length==3){
            new Triangle(sides[0],sides[1],sides[2]);
        }
        if(sides.length==4){
            new Rectangle(sides[0],sides[1],sides[2],sides[3]);
        }
    }
    /**
     * To calculate perimeter
     * @return perimeter of shape
     */
    abstract public double calculatePerimeter();

    /**
     * To calculate area
     * @return area of shape
     */
    abstract public double calculateArea();

    /**
     * To draw the shape
     */
    abstract public void draw();

    /**
     * To check if two shapes are same
     * @param shape another shape to compare
     * @return true if same, false if not
     */
    public boolean equals(Shape shape){
        if(this.hashCode()==shape.hashCode())
            return true;
        return false;
    }

    @Override
    /**
     * To return shape's details in a String
     */
    abstract public String toString();
}