/**
 * To simulate triangles
 * @author Ashkan Shakiba
 * @version 2.0 (4/26/2021)
 */
public class Triangle extends Polygon{
    /**
     * Constructor to make triangle
     * @param side0
     * @param side1
     * @param side2
     */
    public Triangle(double side0, double side1, double side2) {
        super(side0,side1,side2);
    }

    /**
     * To check if the triangle is equilateral
     * @return true if it's equilateral, false if not
     */
    public boolean isEquilateral(){
        if(sides.get(0)==sides.get(1) && sides.get(1)==sides.get(2))
            return true;
        return false;
    }

    @Override
    /**
     * To calculate perimeter
     * @return perimeter of triangle
     */
    public double calculatePerimeter(){
        return sides.get(0)+sides.get(1)+sides.get(2);
    }

    @Override
    /**
     * To calculate area
     * @return area of triangle
     */
    public double calculateArea(){
        double p=calculatePerimeter();
        return Math.sqrt(p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2)));
    }

    @Override
    /**
     * To draw the triangle
     */
    public void draw(){
        System.out.println("Triangle: \n\tPerimeter = "+calculatePerimeter()+"\n\tArea = "+calculateArea());
    }

    @Override
    /**
     * To return shape's details in a String
     */
    public String toString(){
        return "Triangle:: "+super.toString();
    }
}