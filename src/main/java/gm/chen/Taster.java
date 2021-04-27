package gm.chen;

import java.util.Scanner;

public class Taster {
    public static void main(String[] args) {
//        Box1 box1 = new Box1();
        Scanner scan = new Scanner(System.in);

        Box[] boxes = {new Box1(),new Box2(),new Box3(),new Box4()};
        System.out.println("enter leight");
        int leight=scan.nextInt();
        System.out.println("enter width");
        int width=scan.nextInt();
        System.out.println("enter height");
        int height=scan.nextInt();
        for(Box box: boxes){
            if(box.volidate(leight,width,height)){
                System.out.println(box.name +" it is. $ "+ box.price);
                break;
            }
        }

    }
}
