/**
 * To simulate rectangles
 * @author Ashkan Shakiba
 * @version 1.0 (4/25/2021)
 */
public class Rectangle {
    private double[] sides;

    /**
     * Constructor to make rectangle
     * @param side0
     * @param side1
     * @param side2
     * @param side3
     */
    public Rectangle(double side0,double side1,double side2,double side3){
        sides=new double[4];
        sides[0]=side0;
        sides[1]=side1;
        sides[2]=side2;
        sides[3]=side3;
    }

    /**
     * @return sides of rectangle
     */
    public double[] getSides(){
        return sides;
    }

    /**
     * To check if the rectangle is square
     * @return true if it's square, false if not
     */
    public boolean isSquare(){
        if(sides[0]==sides[1] && sides[1]==sides[2])
            return true;
        return false;
    }

    /**
     * To calculate perimeter
     * @return perimeter of rectangle
     */
    public double calculatePerimeter(){
        return sides[0]+sides[1]+sides[2]+sides[3];
    }

    /**
     * To calculate area
     * @return area of rectangle
     */
    public double calculateArea(){
        if(isSquare()){
            return sides[0]*sides[1];
        }
        else{
            if(sides[0]!=sides[1]){
                return sides[0]*sides[1];
            }
            else{
                return sides[0]*sides[2];
            }
        }
    }

    /**
     * To draw the rectangle
     */
    public void draw(){
        System.out.println("Rectangle: \n\tPerimeter = "+calculatePerimeter()+"\n\tArea = "+calculateArea());
    }

    /**
     * To check if two rectangles are same
     * @param rectangle another rectangle to compare
     * @return true if same, false if not
     */
    public boolean equals(Rectangle rectangle){
        if(this.hashCode()==rectangle.hashCode())
            return true;
        return false;
    }

    /**
     * To return rectangle's details in a String
     */
    @Override
    public String toString(){
        return "Rectangle: \n\tSides: "+sides[0]+", "+sides[1]+", "+sides[2]+", "+sides[3]+"\n";
    }
}