import java.lang.Math;
public class Gravitacija{
    public static void main(String[]args){
        
    }
    public static double izracunNadmorskeVisine(int nadmorskaVisina){
        double C = 6.673e-11;
        double M = 5.98e24;
        double r= 6.371e6;
        double R=r+nadmorskaVisina;
        R=Math.pow(R,2);
        return (C*M)/R;
    }
}