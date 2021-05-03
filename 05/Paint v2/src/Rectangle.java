/**
 * To simulate rectangles
 * @author Ashkan Shakiba
 * @version 2.0 (4/26/2021)
 */
public class Rectangle extends Polygon{
    /**
     * Constructor to make rectangle
     * @param side0
     * @param side1
     * @param side2
     * @param side3
     */
    public Rectangle(double side0, double side1, double side2, double side3) {
        super(side0,side1,side2,side3);
    }

    /**
     * To check if the rectangle is square
     * @return true if it's square, false if not
     */
    public boolean isSquare(){
        if(sides.get(0)==sides.get(1) && sides.get(1)==sides.get(2))
            return true;
        return false;
    }

    @Override
    /**
     * To calculate perimeter
     * @return perimeter of rectangle
     */
    public double calculatePerimeter(){
        return sides.get(0)+sides.get(1)+sides.get(2)+sides.get(3);
    }

    @Override
    /**
     * To calculate area
     * @return area of rectangle
     */
    public double calculateArea(){
        if(isSquare()){
            return sides.get(0)*sides.get(1);
        }
        else{
            if(sides.get(0)!=sides.get(1)){
                return sides.get(0)*sides.get(1);
            }
            else{
                return sides.get(0)*sides.get(2);
            }
        }
    }

    @Override
    /**
     * To draw the rectangle
     */
    public void draw(){
        System.out.println("Rectangle: \n\tPerimeter = "+calculatePerimeter()+"\n\tArea = "+calculateArea());
    }

    @Override
    /**
     * To return shape's details in a String
     */
    public String toString(){
        return "Rectangle:: "+super.toString();
    }
}