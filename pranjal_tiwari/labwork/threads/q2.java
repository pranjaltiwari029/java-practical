// 2 WAP that create 3 threads table of 7,11,3
// package threads;
class tableof extends Thread{

    int num;
    tableof(int n){
        num=n;
    }
    public void show(){
        for(int i=1;i<11;i++){
            System.out.println(num+" x "+i+" ="+num*i);
            try{
                Thread.sleep(500);z
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    } 

}


public class q2 {
    public static void main(String[] args) {
        tableof t1=new tableof(3);
        t1.start();
    }
    
}
