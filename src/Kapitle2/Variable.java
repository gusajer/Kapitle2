package Kapitle2;

public class Variable {
    static int RPM;
    public static void start(int omd){
        RPM = omd;
    }
    public static void stop(){
        RPM = 0;
    }
    public static void acc(){
        RPM = RPM + 100;
    }
    public static void main(String[] args) {
        int x = 5;
        double y = 9;

        start(1000);
        stop();
        acc();

        System.out.println(x+y);
    }

}
