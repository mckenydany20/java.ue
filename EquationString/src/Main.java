import java.util.Objects;
import java.util.Scanner;
class Main  {
    public static void main(String [] args){
        double x,x1;
        Scanner clavier=new Scanner(System.in);
        String polynome=args[0];
        polynome=polynome.toUpperCase();
        args = polynome.split("XX");
        String[]entier=args[1].split("X");
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(entier[0]);
        double c=Double.parseDouble(entier[1]);
        double delta=(b*b)-(4*a*c);
        if(delta>0){
            x=(-b-Math.sqrt(delta))/(2*a);
            x1=(-b+Math.sqrt(delta))/(2*a);
            System.out.print("\nl'equation entree admet deux solutions qui sont "+x+" et "+x1+"\n");
        }
        else if (delta==0){
            x=-b/2*a;
            System.out.print("l'equation admet une solution double qui est "+x+"\n");
        }
        else System.out.print("l'equation n'admet aucune solution\n");
    }
}