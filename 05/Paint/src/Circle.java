/**
 * To simulate circles
 * @author Ashkan Shakiba
 * @version 1.0 (4/25/2021)
 */
public class Circle {
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

    /**
     * To calculate perimeter
     * @return perimeter of circle
     */
    public double calculatePerimeter(){
        return 2*pi*radius;
    }

    /**
     * To calculate area
     * @return area of circle
     */
    public double calculateArea(){
        return pi*radius*radius;
    }

    /**
     * To draw the circle
     */
    public void draw(){
        System.out.println("Circle: \n\tPerimeter = "+calculatePerimeter()+"\n\tArea = "+calculateArea());
    }

    /**
     * To check if two circles are same
     * @param circle another circle to compare
     * @return true if same, false if not
     */
    public boolean equals(Circle circle){
        if(this.hashCode()==circle.hashCode())
            return true;
        return false;
    }

    @Override
    /**
     * To return circle's details in a String
     */
    public String toString(){
        return "Circle: \n\tRadius = "+radius+"\n";
    }
}