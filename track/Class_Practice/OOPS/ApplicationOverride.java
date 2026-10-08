package track.Class_Practice.OOPS;
class OverrideParent{
    void disp1(){
        System.out.println("Inside parent disp 1");
    }
    void disp2(){
        System.out.println("Inside parent disp 2");
    }
}

class OverrideChild extends OverrideParent{
    @Override
    void disp2(){
        System.out.println("inside child disp 2");
    }

    void disp3(){
        System.out.println("inside child disp 3");
    }
}

public class ApplicationOverride{
    
    public static void main(String[] args) {
        OverrideParent p=new OverrideParent();
        p.disp2();
        OverrideChild c=new OverrideChild();
        c.disp2();
        
    }
}
