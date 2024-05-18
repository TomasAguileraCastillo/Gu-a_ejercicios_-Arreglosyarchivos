import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class B_agregaElemento {
    public static ArrayList<String> elementos = new ArrayList<String>();

    public static void main(String[] args) {
        //Crear un método llamado agregaElemento el cual nos permite agregar un elemento de una
        //casa a un ArrayList , este elemento se ingresa como un parámetro de entrada.
        //Se requiere validar si el elemento que se ingresará no existe en el arreglo.
        //● Si no existe se agregará.
        //● Si existe se mostrará el mensaje “Elemento ya existe”.
        //Se entrega este ArrayList como base para validar el campo de entrada.
        //ArrayList<String> elementos = new ArrayList<String>();
        //elementos.add("mesa");
        //elementos.add("Refrigerador");
        //elementos.add("Cocina");
        //elementos.add("lavadora");
        elementos.add("mesa");
        elementos.add("Refrigerador");
        elementos.add("Cocina");
        elementos.add("lavadora");


        System.out.println("Ingrese un nuevo elemento");
        verificar();


    }


    static void verificar(){

        Scanner sc = new Scanner(System.in);
        String librobuscado = sc.nextLine();
        String opcion;

        if(elementos.contains(librobuscado)){
            System.out.printf("El Elemento ya existe \n");
        }
        else {
            System.out.println("el Elemento no existe en la lista, desea agregar el elemento S/N");
            opcion = sc.nextLine();
            if ( opcion == "s" || opcion =="S") {
                elementos.add(librobuscado);
                System.out.printf("El Elemento %s fue agregado\n",  librobuscado);
            }

        }

        System.out.println("Listado completo");
        for (Iterator<String> iterador = elementos.iterator(); iterador.hasNext();) {
            String element = iterador.next();
            System.out.println(element);
        }

    }








}

