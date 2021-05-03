import java.util.ArrayList;

/**
 * To simulate polygons
 * @author Ashkan Shakiba
 * @version 2.0 (4/26/2021)
 */
abstract public class Polygon extends Shape{
    protected ArrayList<Double> sides;

    public Polygon(double... sides){
        this.sides=new ArrayList<>();
        for(double side:sides){
            this.sides.add(side);
        }
    }
    /**
     * @return sides of polygon
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    /**
     * To return shape's details in a String
     */
    public String toString(){
        int index=0;
        String res="";
        for(double side:sides){
            if(index>0){
                res+=", ";
            }
            res+="side"+index+": "+side;
            index++;
        }
        return res;
    }
}