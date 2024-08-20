public class Methods_Speed {
    public static void main(String[] args) {
        Methods_Speed obj=new Methods_Speed();

        obj.speed_of_car(2,80);
       double topspeed= speed_of_car(4,80);
        System.out.println(topspeed);
        areaofrect(20,10);
    }
    public static void areaofrect(int length,int breadth){
        int area=length*breadth;
        System.out.println("Area :"+area);
    }
    public static double speed_of_car(double time,double distance){
        if (distance>10){
            double speed=distance/time;
            return speed;
        }else {
            return Double.NaN;
        }
    }
}
