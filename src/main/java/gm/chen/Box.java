package gm.chen;

public class Box {
    int length;
    int width;
    int heigth;
    public boolean volidate(int a , int b , int c){
        if(length>=a &&width>=b && heigth>=c){
            return true;
        }else {
            return false;
        }
    }
}
