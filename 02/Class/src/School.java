public class School {
    int code;
    int classCount;
    Professor [] professors=new Professor[50];
    Student [][] bachelor=new Student[5][200];
    Student [][] master=new Student[3][200];
    Student [][] PhD=new Student[3][200];

    public School(int code,int classCount){
        this.code=code;
        this.classCount=classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }
    public int getClassCount(){
        return classCount;
    }
    public void increaseClassCount(){
        classCount++;
    }
    public void decreaseClassCount(){
        classCount--;
    }
    public void setProfessors(Professor[] professors){
        this.professors=professors;
    }
    public Professor[] getProfessors(){
        return professors;
    }
    public void setBachelor(Student[][] bachelor){
        this.bachelor=bachelor;
    }
    public Student[][] getBachelor(){
        return bachelor;
    }
    public void setMaster(Student[][] master){
        this.master=master;
    }
    public Student[][] getMaster(){
        return master;
    }
    public void setPhD(Student[][] PhD){
        this.PhD=PhD;
    }
    public Student[][] getPhD(){
        return PhD;
    }
}