public class A_promediodesueldo {
    public static void main(String[] args) {

        //Construir un programa en el cual se requiere lo siguiente:
        //● Crear un método el cual retorna el promedio de sueldo en tipo de dato double.
        //● Tenemos el siguiente arreglo como ejemplo:
        //int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300,
        //700450, 442300 };
        //Se requiere promediar los sueldos que sean mayores a 500000 y retornar este valor.

        System.out.println( " el promedio es : " + promediosueldo());

    }


    static double promediosueldo() {

        int[] sueldos = {400000, 760000, 1100000, 650000, 654980, 987300,
                700450, 442300};
        System.out.println("Sueldos");
        for (int j = 0; j < sueldos.length; j++) {
            System.out.println(sueldos[j]);
        }
        double suma = 0;
        double promedio = 0;
        int contador = 0;
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] >= 500000) {
                suma = suma + sueldos[i];
                contador++;
            }
        }
        promedio = suma / contador;
        System.out.println(contador);
        return promedio;

    }

}