// WAP to create two threads ones print even and another prints odd
// package threads;
class thread extends Thread{
    
    public void run(){
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
    }
}
class runnable implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

public class q1 {
    public static void main(String[] args) {
        thread o1=new thread();
        runnable o2=new runnable();
        Thread A =new Thread(o1);
        Thread B=new Thread(o2);
        A.start();
        B.start();
    
        
    }

    
}
