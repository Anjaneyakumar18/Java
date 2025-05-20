class Main{
    public static void main(String args[]){
        //Create a thread Object
        MyThread mt1=new MyThread();
        // class start method where run() starts executing
        mt1.start();
        
    }
    
}

//Create a thread by extending Thread class

class MyThread extends Thread{
    // override run method and implement it with your bussines logic
    public void run(){
        System.out.println("My thread delay 1000ms");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("After depaly");
    }
}
