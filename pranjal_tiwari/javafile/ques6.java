// package pranjal_tiwari.javafile;


class overload{
    overload(){
        System.out.println("performing function overloading");
    }
    overload(int a){
        System.out.println("enrollment no. is = "+a);
    }
}

 class ques6 {
    public static void main(String[] args) {
        overload obj=new overload();
        overload obj1 =new overload(76);
    }
    
}
