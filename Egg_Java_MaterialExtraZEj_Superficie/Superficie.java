/*
 *Se quiere elaborar un software de mapeo utilizando los triangulos que pueden construir a 
partir de los datos bidimensioanles de una nube de puntos cuyo tamaño se desconoce.
se siguen los siguientes pasos intermedios
- se carga el conjunto de puntos en  (x0,y0)...(xn,yn)
  - la cantidad de puntos deberia ser mayor a 2 para mostrar algun resultado
  - No debe haber limites a la cantidad maxima mas alla de la memoria disponible
  - no se conoce previamente el numero existente sino que debe calcularse.
  - la finalizacion de la entrada de datos se indica con un punto en el origen, 
    que no existe y debe ser ignorado. 
  - se sugiere desarrollar utilizando entre 5 a 10 puntos. La cantidad total con la que se
calculan los resultados puede implicar del orden de 10° calculo que pueden demorar varios minutos
- Del total de triangulos posibles (combinacion del total de puntos tomados de a 3 )
se deben descartar los que tienen 1 o mas puntos interiores (en el ejemplo, para 4 puntos 
hay 4 triangulos posible, pero el 1° - tomado por los 3 primeros puntos-
debe descartarse pues el 4° punto interior  )
- Para saber si un punto es nterior a u triangulo puede usarse la orientacion, que se calcula
usando el siguiente metodo 
Algoritmo

			La orientación de un triángulo es la misma que la orientación de sus tres vértices, así que se puede establecer un algoritmo sencillo para decidir si un punto está o no en el interior de un triángulo.

			Considerando el triángulo A1A2A3 y el punto P, el algoritmo queda como se muestra a continuación:

			1. Calcular la orientación del triángulo A1A2A3.

			El cálculo de la orientación de un triángulo se puede realizar según la siguiente fórmula:

			(A1.x - A3.x) * (A2.y - A3.y) - (A1.y - A3.y) * (A2.x - A3.x)



			Si el resultado es mayor o igual que 0, la orientación del triángulo será positiva. En caso contrario, la orientación del triángulo será negativa.

			2. Calcular la orientación de los triángulos que forma el punto P con los vértices del triángulo A1A2A3.

			Se calcula la orientación de los triángulos A1A2P, A2A3P, A3A1P, con el método explicado en el punto 1.

			3. En el caso de que la orientación del triángulo A1A2A3 sea positiva.

			Si las orientaciones de los tres triángulos que tienen como vértice el punto P, calculadas en el punto 2, son positivas el punto está dentro del triángulo.
			En caso contrario el punto está situado fuera del triángulo

			4. En el caso de que la orientación del triángulo A1A2A3 sea negativa:

			Si las orientaciones de los tres triángulos que triángulos que tienen como vértice el punto P son negativas, el punto está dentro del triángulo
			En caso contrario el punto está situado fuera del triángulo.


Asi puede determinarse que el punto P esta dentro de ABC mientras que Q esta afuera: 
De ser necesario, la superficie de un triangulo puede calcularse usando la formula de heron 


			La fórmula de Herón halla el área de un triángulo del cual se conocen todos sus lados. El área se calcula a partir del semiperímetro del triángulo s y de la longitud de los lados (a, b y c).

			Dibujo de un triángulo cualquiera.
			Fórmula de Herón. Fórmula del área de un triángulo con los tres lados conocidos.
			Ejercicio 1

			Ejemplo de un triángulo para el cálculo de su área por la fórmula de Herón.

			Sea un triángulo de lados conocidos, siendo estos a=4 cm, b=5 cm y c=3 cm. Calcularemos su área por la fórmula de Herón.

			Primero calcularemos el semiperímetro (s). 

---- SE DESEA SABER CUAL ES EL TRIANGULO DE MENOR SUPERFICIE DE TODOS LOS TRIANGULOS FORMADOS
DE LA COMBINACION DE TODOS LOS PUNTOS TOMADOS DE A 3 QUE NO CONTIENEN OTROS PUNTOS DENTRO DEL TRIANGULO
 */
package Egg_Java_MaterialExtraZEj_Superficie;

/**
 *
 * @author WALTER GOMEZ
 */
public class Superficie {
    
    private float x,y;

    public Superficie() {
    }

    public Superficie(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Superficie{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
