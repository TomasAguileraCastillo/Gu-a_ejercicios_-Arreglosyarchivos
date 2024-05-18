
Guía de ejercicios glos y archivos
--

Introducción a Arrays

- Construir un programa en el cual se requiere lo siguiente:

    - Crear un método el cual retorna el promedio de sueldo en tipo de dato double.
    
      - Tenemos el siguiente arreglo como ejemplo:
  
      int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300,
700450, 442300 };
    - Se requiere promediar los sueldos que sean mayores a 500000 y retornar este valor.


Operaciones básicas en un Array dinámico

- Crear un método llamado <b>agregaElemento</b> el cual nos permite agregar 
un elemento de una casa a un ArrayList, este elemento se ingresa como un parámetro de entrada.

Se requiere validar si el elemento que se ingresará no existe en el arreglo.
- Si no existe se agregará.
- Si existe se mostrará el mensaje “Elemento ya existe”.
- Se entrega este ArrayList como base para validar el campo de entrada.

      ArrayList<String> elementos = new ArrayList<String>();

    <ul style="list-style: none;">
      <li>elementos.add("mesa");</li>
      <li>elementos.add("Refrigerador");</li>
      <li>elementos.add("Cocina");</li>
      <li>elementos.add("lavadora");</li>
    </ul>


Otros Métodos utilizados en ArrayList

- Crear un método que nos permita obtener la nota máxima y mínima 
    de un conjunto de exámenes del curso Programación Java.

- Estas notas deben ser mostradas por consola.

Se entregan las siguientes notas:
- 4.7
- 2.2
- 5.4
- 6.9
- 4.4
- 2.6


- Crear un método que permita buscar un nombre ingresado por parámetro dentro de un
Arraylist. y comparar el elemento ingresado con el ArrayList.
Las reglas son las siguientes:
    - Si el elemento existe, se debe mostrar por consola el elemento.
    - Si no, mostrar el o los elementos que no fueron encontrados y eliminar de la lista.