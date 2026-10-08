package track.Class_Practice.OOPS;
class DownCastingParent{
    void display1(){
        System.out.println("Parent class method 1");
    }
    void display2(){
        System.out.println("Parent class method 2");
    }
}
class DownCastingChild extends DownCastingParent{
    void display1(){
        System.out.println("Child class method 1");
    }
    void display2(){
        System.out.println("Child class method 2");
    }
    void display3(){
        System.out.println("Child class method 3");
    }
}

class DownCasting {
    public static void main(String[] args) {
        //DownCastingParent p = new DownCastingChild();
        // p.display1();
        // p.display2();
        // ((DownCastingChild)p).display3();
        DownCastingChild c = new DownCastingChild();
        c.display1();
        c.display2();
        c.display3();
        
    }
}
