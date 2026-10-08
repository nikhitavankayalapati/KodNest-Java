package track.Class_Practice.OOPS;

class Book1 {
    private int pageNumber;
    public void setData(int x){
        if(x>0){
            pageNumber = x;
        }
    }
    public int getpageNumber(){
        return pageNumber;  
    } 
}
public class EncapDemo2 {
    public static void main(String[] args){
        Book1 en = new Book1();
        en.setData(-1000);
        System.out.println(en.getpageNumber());
    }
}
