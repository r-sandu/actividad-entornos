package comentarios;

public class Y { 

/**
*la función de este código es encontrar el valor
*máximo de la lista, y decir cuantas veces se
*repite este valor máximo
*/	  

    public static void main(String[] args) { 

/**se definen los números, se inicializa el contador,
*y se inicializa el valor máximo con el primer elemento
*asumiendose que es el mas grande
 */
    	//lista de números para analizar
        int[] d = {4, 7, 2, 9, 2, 5}; 
        //contador
        int e = 0; 
        //número máximo
        int f = d[0]; 

  
/**vuelve a recorrer la lista, desde la segunda posición,
*compara cada valor con el valor máximo que tiene actualmente,
*si se encuentra uno mayor, f se actualiza
*/

        for (int i = 1; i < d.length; i++) { 

            if (d[i] > f) { 

                f = d[i]; 

            } 

        } 

  
/**recorre toda la lista, compara cada elemento con f,
 * si coincide, el contador incrementa
 * al terminar, e indica cuantas veces aparece el valor máximo
 */
        for (int i = 0; i < d.length; i++) { 

            if (d[i] == f) { 

                e++; 

            } 

        } 

  
/**muestra por pantalla el valor máximo, luego ":" y
 *luego el número de veces que aparece
 */
        System.out.println(f + ":" + e); 

    } 

} 

