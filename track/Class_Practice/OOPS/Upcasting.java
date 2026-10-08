package track.Class_Practice.OOPS;
class Developper{
    void work(){
        System.out.println("Devlopper working");
    }
    void project(){
        System.out.println("Developper doing project");
    }

}
class javaDevelopper extends Developper{
    void work(){
        System.out.println("Java developper working");
    }
    void project(){
        System.out.println("Java developper doing project");
    }
}
class pythonDeveloper extends Developper{
    void work(){
        System.out.println("Python developper working");
    }
    void project(){
        System.out.println("Python developper doing project");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        javaDevelopper jd = new javaDevelopper();
        accessmethods(jd);
        pythonDeveloper pd = new pythonDeveloper();
        accessmethods(pd);  
    }
    public static void accessmethods(Developper dev){
        dev.work();
        dev.project();  
    }    
}
    

