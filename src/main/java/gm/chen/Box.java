package gm.chen;

public class Box {
    String name;
    int length;
    int width;
    int heigth;
    int price;
    public boolean volidate(int a , int b , int c){
        if(length>=a &&width>=b && heigth>=c){
            return true;
        }else {
            return false;
        }
    }
}
