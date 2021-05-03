/**
 * each student will have an object by this class
 * @author Ashkan
 * @version 0.0
 */
public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;

    /**
     * a simple constructor, with simple parameters
     * @param firstName
     * @param lastName
     * @param id
     */
    public Student(String firstName,String lastName,String id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        grade=20;
    }

    /**
     * it just set the first name
     * @param firstName
     */
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    /**
     * it just get the first name
     * @return first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * it just set the grade
     * @param grade
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * it just get the grade
     * @return grade
     */
    public int getGrade(){
        return grade;
    }

    /**
     * it prints students' details
     */
    public void print(){
        System.out.println("("+id+") "+firstName+" "+lastName+": "+grade);
    }
}
