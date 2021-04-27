package gm.chen;

public class Taster {
    public static void main(String[] args) {
//        Box1 box1 = new Box1();

        Box[] boxes = {new Box1(),new Box2(),new Box3(),new Box4()};
        int leight=12;
        int width=5;
        int height=13;
        for(Box box: boxes){
            if(box.volidate(leight,width,height)){
                System.out.println(box.name +" it is. $ "+ box.price);
                break;
            }
        }

    }
}
