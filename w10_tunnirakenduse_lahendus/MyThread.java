package app;

public class MyThread {
    public class MyThread implements Runnable {

        private Thread thread;
        private String tName;
    
        private int inter;
    
        public MyThread(String tName, int inter) {
            this.tName = tName;
        }
    
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {

                    if (tName == "Jagub kolmega")
                    { 
                        if (i % 3 == 0){
                            System.out.println("");
                        }
                        else{
                            System.out.println(tName + ": " + i);
                            Thread.sleep(1000);
                        } 
                    } else if(tName == "Ei jagu kolmega"){
                        if (i % 3 != 0){
                            System.out.println("");
                        }
                        else{
                            System.out.println(tName + ": " + i);
                            Thread.sleep(1000);
                        } 
                    }else{
                        System.out.println("");
                    }
                } else if(tName == "Pole 2"){
                    if (i != 2){
                        System.out.println("");
                    }
                    else{
                        System.out.println(tName + ": " + i);
                        Thread.sleep(1000);
                    } 
                }else{
                    System.out.println("");
                }
                }
            } catch (InterruptedException e) {
                System.out.println("Thread " + tName + " dead");
            }
    
        }
    
        public void start() {
            System.out.println("Thread " + tName + " starting");
            if (thread == null) {
                thread = new Thread(this, tName);
                thread.start();
            }
        }
    
    }
}