public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClockDisplay myClock;
        //myClock=new ClockDisplay();
        myClock=new ClockDisplay(21,59,50);
        while(true){
            Thread.sleep(1000);
            myClock.timeTick();
            System.out.println(myClock.getTime());
        }
    }
}