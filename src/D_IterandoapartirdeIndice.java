import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class D_IterandoapartirdeIndice {
    public static ArrayList<String> arregloA = new ArrayList<String>();
    public static ArrayList<String> arregloB =new ArrayList<String>();

    public static void main(String[] args) {

        agregadatosarregloA();
        verificar();


    }

    static void agregadatosarregloA(){
        arregloA.add("juan");
        arregloA.add("andres");
        arregloA.add("rosalio");
        arregloA.add("cecilio");
        arregloA.add("manfredo");
        arregloA.add("rosalberta");
        arregloA.add("cleiversonley");
        arregloA.add("richarlinson");
        arregloA.add("luzangelyn");
        arregloA.add("miriana");
        arregloA.add("Clodomiro");
        arregloA.add("Wilianñelys");

        System.out.println("Listado A");
        for (Iterator<String> iterador = arregloA.iterator(); iterador.hasNext();) {
            String element = iterador.next();
            System.out.println(element);
        }
        System.out.println("Hay " + arregloA.size() + " elementos en la lista");
    }

    static void verificar(){

        Scanner sc = new Scanner(System.in);
        System.out.println(" \n ingrese nombre para buscar");
        String nombrebuscado = sc.nextLine();
        String opcion;

        if(arregloA.contains(nombrebuscado)){
            System.out.printf("El Nombre existe en el listado A, sera enviado al la  lista B  \n");
            arregloB.add(nombrebuscado);
            arregloA.remove(nombrebuscado);

        }
        else {
            System.out.println("el Nombre no existe en la lista, desea agregar el elemento S/N");
            opcion = sc.nextLine();
            if ( opcion == "s" || opcion =="S") {

                System.out.printf("El Elemento %s fue agregado\n",  nombrebuscado);
            }

        }

        System.out.println("Listado A completo");
        for (Iterator<String> iterador = arregloA.iterator(); iterador.hasNext();) {
            String element = iterador.next();
            System.out.println( element);
        }

        System.out.println("Listado B completo");
        for (Iterator<String> iterador = arregloB.iterator(); iterador.hasNext();) {
            String element = iterador.next();
            System.out.println( element);
        }

    }







}
