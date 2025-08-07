//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Primitive data type store only one value, at time;
        /*
         Tipos de datos primitivos en Java

         Tipo       | Tamaño     | Valor por defecto | Uso común
        ------------|------------|-------------------|-----------------------------------------------------
         byte       | 1 byte     | 0                 | Números pequeños (ahorro de memoria).
         short      | 2 bytes    | 0                 | Números pequeños (más grande que byte).
         int        | 4 bytes    | 0                 | Números enteros generales.
         long       | 8 bytes    | 0L                | Números enteros muy grandes.
         float      | 4 bytes    | 0.0f              | Números decimales con precisión simple.
         double     | 8 bytes    | 0.0d              | Números decimales con precisión doble.
         char       | 2 bytes    | '\u0000'          | Almacenar caracteres individuales.
         boolean    | 1 bit*     | false             | Valores lógicos (verdadero/falso).

        *Nota: Aunque el tipo boolean ocupa 1 bit conceptualmente, en la práctica puede ocupar más memoria dependiendo de la implementación de la JVM.

        Características clave de un dato primitivo
        - Unidad básica de información → No se puede descomponer en partes más simples dentro del lenguaje.

        - Soporte nativo → El compilador o intérprete sabe cómo almacenarlo y manipularlo sin que el programador tenga que definir su estructura.

        - Eficiencia → Se almacenan de forma directa en memoria, normalmente en tamaños fijos (bits o bytes).

        - Operaciones predefinidas → Tienen un conjunto de operaciones asociadas (por ejemplo, sumar números, comparar booleanos).
        */

        // Ejemplos de tipos primitivos
        long age = 23;
        System.out.println("age = " + age);
        float price = 19.99F;
        int xAxis, yAxis;
        xAxis = 10;
        yAxis = 20;
        // Reasignación de valor
        age = 30;

        // Impresiones
        System.out.println("age = " + age);
        System.out.println("price = " + price);
        System.out.println("xAxis = " + xAxis + ", yAxis = " + yAxis);
    }
}