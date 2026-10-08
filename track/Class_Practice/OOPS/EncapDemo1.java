package track.Class_Practice.OOPS;

class Book {
    private int pageNumber;
    public void setData(int x){
        pageNumber = x;
    }
    public int getpageNumber(){
        return pageNumber;
    }  
}
public class EncapDemo1 {
    public static void main(String[] args){
        Book en = new Book();
        en.setData(10);
        System.out.println(en.getpageNumber());
    }
}
