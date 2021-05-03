/**
 * each lab will have an object by this class
 * @author Ashkan
 * @version 0.0
 */
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    //the maximum number of class's students
    private int capacity;
    //number of class's students
    private int currentSize;

    /**
     *
     * @param capacity the maximum number of class's students
     * @param day I'm not sure about its meaning :\
     */
    public Lab(int capacity, String day) {
        this.capacity=capacity;
        this.day=day;
        currentSize=0;
    }

    /**
     * this method add students to the array
     * @param std it must put in the array
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        }
        else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * print students' details
     */
    public void print() {
        System.out.println("Lab students:");
        int i;
        for(i=0;i<currentSize;i++){
            students[i].print();
        }
    }

    /**
     * get students array
     * @return students array
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     *
     * @param students
     */
    public void setStudents(Student[] students) {
        this.students=students;
    }
    public int getAvg() {
        return avg;
    }
    public void calculateAvg() {
        int i,sum=0;
        for(i=0;i<currentSize;i++){
            sum+=students[i].getGrade();
        }
        avg=sum/currentSize;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day=day;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
}