/**
 * To simulate circles
 * @author Ashkan Shakiba
 * @version 2.0 (4/26/2021)
 */
public class Circle extends Shape{
    private double radius;
    private final static double pi=3.141592653589793238;

    /**
     * Constructor to make circle
     * @param radius
     */
    public Circle(double radius){
        this.radius=radius;
    }
    /**
     * @return the radius of circle
     */
    public double getRadius(){
        return radius;
    }

    @Override
    /**
     * To calculate perimeter
     * @return perimeter of circle
     */
    public double calculatePerimeter(){
        return 2*pi*radius;
    }

    @Override
    /**
     * To calculate area
     * @return area of circle
     */
    public double calculateArea(){
        return pi*radius*radius;
    }

    @Override
    /**
     * To draw the circle
     */
    public void draw(){
        System.out.println("Circle: \n\tPerimeter = "+calculatePerimeter()+"\n\tArea = "+calculateArea());
    }

    @Override
    /**
     * To return shape's details in a String
     */
    public String toString(){
        return "Circle:: radius: "+radius;
    }
}