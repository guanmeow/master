package fju.edu.racing;

public class Race {
    public static void main(String[] args) {
        String name1 = "h1";
        HorseRunnable hr = new HorseRunnable();
        Thread t = new Thread(hr) ;
        t.start();
        Horse h = new Horse();
        h.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println(name1 +" " +i);

        }
    }

}
