import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Juan Esteban Villegas Jimenez
public class Main {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        List<Object>figuras = new ArrayList<>();

        System.out.println(" MENÚ "+"\n"+"Seleccione una opción"+"\n"+"\n" + "1) Rectangulo" +"\n" + "2) Triangulo"+"\n"+ "3) Circulo"+"\n");
        i= scanner.nextInt();
        do {

       switch (i) {
           case 1:
               Rectangulo rectangulo = new Rectangulo();
               System.out.println("ingrese la base: ");
               rectangulo.setBase(scanner.nextDouble());
               System.out.println("ingrese la altura");
               rectangulo.setAltura(scanner.nextDouble());
               figuras.add(rectangulo);

               rectangulo.mostrarInfo();
               break;

           case 2:
               Triangulo triangulo1 = new Triangulo();
               System.out.println("ingrese la base: ");
               triangulo1.setBase(scanner.nextDouble());
               System.out.println("ingrese la altura");
               triangulo1.setAultura(scanner.nextDouble());
               figuras.add(triangulo1);

               triangulo1.mostrarInfo();
               break;

           case 3:
               Circulo circulo1 = new Circulo();
               System.out.println("ingrese la base: ");
               circulo1.setRadio(scanner.nextDouble());
               figuras.add(circulo1);

               circulo1.mostrarInfo();
               break;
           default:
               System.out.println("Ingrese una opcion valida");
       }

    }while (i!=4);
        }
    }
