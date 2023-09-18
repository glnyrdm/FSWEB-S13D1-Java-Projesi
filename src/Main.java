public class Main {

    public static boolean shouldWakeUp(boolean hav, int time) {
        if (!hav || time<0 || time>23){
            return false;
        }
        if (time <8 || time >= 20) {
            return  true;
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if (num1>14 && num1<20 || num2>14 && num2<20 || num3>14 && num3<20){
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean yaz, int isi){
        if (yaz){
            return isi>25 && isi<46;
        }
        return isi>25 && isi<36;
    }

    public static double area(double no1, double no2){
        if (no1<0 || no2<0){
            System.out.println("0 dan küçük bir değer veremezsiniz.");
            return -1;
        }
        return no1 * no2;
    }

    public static double area(double radius){
        if (radius<0){
            System.out.println("0 dan küçük bir değer giremezsiniz");
            return -1;
        }
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {

        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

        System.out.println("-----------------------");

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("-----------------------");

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("-----------------------");

        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println("-----------------------");

        System.out.println(area(5.0));
        System.out.println(area(-1));
    }
}