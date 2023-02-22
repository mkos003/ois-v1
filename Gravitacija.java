import java.lang.Math;
import java.util.*;
public class Gravitacija{
    public static void main(String[]args){
        Scanner bralnik=new Scanner(System.in);
        System.out.println("Vnesite visino:");
        int visina=bralnik.nextInt();
        izpis();


    }
    public static void izpis(int nadmorskaVisina){
        System.out.println("Vnesena nadmorska visina: "+nadmorskaVisina);
        System.out.println("Gracitacijski pospesek pri tej visini: "+izracunNadmorskeVisine(nadmorskaVisina));
        
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