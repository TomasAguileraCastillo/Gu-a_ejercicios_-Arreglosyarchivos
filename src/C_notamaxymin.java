import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C_notamaxymin {
    public static ArrayList<Float> notascurso = new ArrayList<Float>();
    public static void main(String[] args) {
        //Crear un método que nos permita obtener la nota máxima y mínima de un conjunto de
        //exámenes del curso Programación Java.
        //Estas notas deben ser mostradas por consola.
        //Se entregan las siguientes notas:
        //● 4.7
        //● 2.2
        //● 5.4
        //● 6.9
        //● 4.4
        //● 2.6

        minmax();


    }

    static void minmax(){

        notascurso.add(4.7F);
        notascurso.add(2.2F);
        notascurso.add(5.4F);
        notascurso.add(6.9F);
        notascurso.add(4.4F);
        notascurso.add(2.6F);
        System.out.println("Listado completo de Notas es ");
        for (Iterator<Float> iterador = notascurso.iterator(); iterador.hasNext();) {
            float element = iterador.next();
            System.out.println(element);
        }

        System.out.println( "la nota minimadel curso es : "+ Collections.min(notascurso));
        System.out.println("la nota maxima del curso es : "+ Collections.max(notascurso));







    }




}
