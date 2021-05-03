public class Main {
    public static void main(String[] args) {
        /*
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
        */

        int x=0,y=1;
        swapInt(x,y);
        System.out.println(x+" "+y);

        Student a=new Student("A","a","1");
        Student b=new Student("B","b","2");
        swapStudent(a,b);
        a.print();
        b.print();

    }

    public static void swapInt(int x,int y){
        int tmp;
        tmp=x;
        x=y;
        y=tmp;
    }
    public static void swapStudent(Student a,Student b){
        Student tmp;
        tmp=a;
        a=b;
        b=tmp;
    }

}
