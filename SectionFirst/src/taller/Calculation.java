package taller;

public class Calculation {
	/*public static int findMax(int arr[]){
	    int max = 0;
	    for(int i=1; i<arr.length; i++) {
	        if(max < arr[i])
	            max = arr[i];
	    }
	    return max;
	}*/
	
	/*El problema es que se inicia la variable max con 0. 
	Esto funciona bien si todos los números en el arreglo son positivos, 
	pero si el arreglo contiene números negativos, max nunca será menor que cualquier número negativo, l
	o que resultará en un valor incorrecto.

	SOLUTION>
	Para corregir esto, deberías inicializar max con el primer valor del arreglo en lugar de 0.
	Para que max comience con un valor que está realmente en el arreglo, sea positivo o negativo.*/
	
	public static int findMax(int arr[]){
	    if (arr.length == 0) {
	        throw new IllegalArgumentException("El arreglo no puede estar vacío");
	    }
	    
	    int max = arr[0]; // Inicializa max con el primer valor del arreglo
	    for(int i=1; i<arr.length; i++) {
	        if(max < arr[i]) {
	            max = arr[i];
	        }
	    }
	    return max;
	}

	
	
	



}
