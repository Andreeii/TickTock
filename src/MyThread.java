public class MyThread implements Runnable  {
    Thread thrd;
    TickTock ttOb;
    MyThread(String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    public static MyThread createandStart(String name,TickTock tt){
        MyThread myThrd = new MyThread(name,tt);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run(){
        if(thrd.getName().compareTo("Tick") == 0){
            for(int i =0 ; i < 5;i++)ttOb.tick(true);
                ttOb.tock(false);

            }else {
            for (int i = 0; i<5;i++)ttOb.tock(true);
                ttOb.tick(false);

        }
    }
}
