class Main{
    public static void main(String args[]){
        MyRunnable mr=new MyRunnable();
        Thread t=new Thread(mr);
        t.start();
    }
}

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable Thread and delay 1000ms");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("after delay");
    }
}
