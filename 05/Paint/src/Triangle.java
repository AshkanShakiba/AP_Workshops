/**
 * To simulate triangles
 * @author Ashkan Shakiba
 * @version 1.0 (4/25/2021)
 */
public class Triangle {
    private double[] sides;

    /**
     * Constructor to make triangle
     * @param side0
     * @param side1
     * @param side2
     */
    public Triangle(double side0,double side1,double side2){
        sides=new double[3];
        sides[0]=side0;
        sides[1]=side1;
        sides[2]=side2;
    }

    /**
     * @return sides of triangle
     */
    public double[] getSides(){
        return sides;
    }

    /**
     * To check if the triangle is equilateral
     * @return true if it's equilateral, false if not
     */
    public boolean isEquilateral(){
        if(sides[0]==sides[1] && sides[1]==sides[2])
            return true;
        return false;
    }

    /**
     * To calculate perimeter
     * @return perimeter of triangle
     */
    public double calculatePerimeter(){
        return sides[0]+sides[1]+sides[2];
    }

    /**
     * To calculate area
     * @return area of triangle
     */
    public double calculateArea(){
        double p=calculatePerimeter();
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }

    /**
     * To draw the triangle
     */
    public void draw(){
        System.out.println("Triangle: \n\tPerimeter = "+calculatePerimeter()+"\n\tArea = "+calculateArea());
    }

    /**
     * To check if two triangles are same
     * @param triangle another triangle to compare
     * @return true if same, false if not
     */
    public boolean equals(Triangle triangle){
        if(this.hashCode()==triangle.hashCode())
            return true;
        return false;
    }

    /**
     * To return triangle's details in a String
     */
    @Override
    public String toString(){
        return "Triangle: \n\tSides: "+sides[0]+", "+sides[1]+", "+sides[2]+"\n";
    }
}