/*
 * Se quiere elaborar un software de mapeo utilizando los triangulos que pueden construir a 
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

import com.sun.istack.internal.logging.Logger;
import java.io.*;
import java.util.logging.Level;

/**
 *
 * @author WALTER GOMEZ
 */
public class SuperficieControl {

    public static void main(String[] args) {
        
       //  float coordX[] = new float[100];
        //float coordY[] = new float[100];
        
        
        int cantDeElementos = 0;
        boolean valido = false;
        float A1x, A1y, A2x, A2y, A3x, A3y, Px, Py;

	//boolean valido=false;
	CargarYValidar();

	if (valido){
		//EvaluarTriangulos([]coordX,[]coordY,cantDeElementos);	
	}
        
    }

        //Superficie puntoxy = new Superficie();

      

        //public static void  CargarYValidar( float[]  coordX, float[] coordY, int cantDeElementos){
        public static void CargarYValidar()  {
          float coordX[] = new float[100];
            float coordY[] = new float[100];

            int cantDeElementos = 0;
            boolean valido = false;
            float A1x, A1y, A2x, A2y, A3x, A3y, Px, Py;
            float x = 0, y = 0;
            File datos = new File("datos.txt");
            FileReader leer;
            BufferedReader cargar;
            try {
                leer = new FileReader(datos);
                cargar = new BufferedReader(leer);
                while (x != 0 && y != 0) {
                    x = Float.parseFloat(cargar.readLine());
                    y = Float.parseFloat(cargar.readLine());
                    if (x == 0 && y == 0) {
                        break;
                    }
                    for (int i = 0; i < coordX.length; i++) {
                        for (int j = 0; j < coordY.length; j++) {
                            coordX[i] = x;
                            coordY[i] = y;
                        }
                    }
                    cantDeElementos++;
                }
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(SuperficieControl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(SuperficieControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    public boolean EsPuntoInterno(float A1x, float A1y, float A2x, float A2y, float A3x, float A3y, float Px, float Py) {
        float orientacion, orientacionA1A2P, orientacionA2A3P, orientacionA3A1P;

        orientacion = (A1x - A3x) * (A2y - A3y) - (A1y - A3y) * (A2x - A3x);
        orientacionA1A2P = (A1x - Px) * (A2y - Py) - (A1y - Py) * (A2x - Px);
        orientacionA2A3P = (Px - A3x) * (A2y - A3y) - (Py - A3y) * (A2x - A3x);
        orientacionA3A1P = (A1x - A3x) * (Py - A3y) - (A1y - A3y) * (Px - A3x);

        if (orientacion >= 0) {  // positiva 
            if (orientacionA1A2P >= 0 && orientacionA2A3P >= 0 && orientacionA3A1P >= 0) {
                return true;
            } else { // negativa 
                if (orientacionA1A2P < 0 && orientacionA2A3P < 0 && orientacionA3A1P < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean TienePuntosInternos(float A1x, float A1y, float A2x, float A2y, float A3x, float A3y, float Px, float Py, float[] coordX, float[] coordY, int cantDeElementos) {

        for (int i = 0; i < cantDeElementos; i++) {
            if (coordX[i] != A1x && coordX[i] != A2x && coordX[i] != A3x) {
                if (coordY[i] != A1y && coordY[i] != A2y && coordY[i] != A3y) {
                    if (EsPuntoInterno(A1x, A1y, A2x, A2y, A3x, A3y, coordX[i], coordY[i])) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public float SuperficieTriangulo(float A1x, float A1y, float A2x, float A2y, float A3x, float A3y) {
        float s = semiperimetro(A1x, A1y, A2x, A2y, A3x, A3y);
        float a = distancia(A1x, A1y, A2x, A2y);
        float b = distancia(A1x, A1y, A3x, A3y);
        float c = distancia(A3x, A3y, A2x, A2y);

        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public float semiperimetro(float A1x, float A1y, float A2x, float A2y, float A3x, float A3y) {
        return (distancia(A1x, A1y, A2x, A2y) + distancia(A1x, A1y, A3x, A3y) + distancia(A3x, A3y, A2x, A2y)) / 2;
    }

    public float distancia(float A1x, float A1y, float A2x, float A2y) {
        return (float) Math.sqrt((A1x - A2x) * (A1x - A2x) + (A1y - A2y) * (A1y - A2y));
    }

    public void EvaluarTriangulos(float[] coordX, float[] coordY, int cantDeElementos) {
        String TrianguloDeMenorSup;
        float MenorSup = 0, Sup = 0, mA1x = 0, mA1y = 0, mA2x = 0, mA2y = 0, mA3x = 0, mA3y = 0;
        int punto1 = 0, punto2 = 0, punto3 = 0;
        MenorSup = SuperficieTriangulo(coordX[0], coordY[0], coordX[1], coordY[1], coordX[2], coordY[2]);

        for (int i = 0; i < cantDeElementos; i++) {
            for (int j = 0; j < cantDeElementos; j++) {
                for (int k = 0; k < cantDeElementos; k++) {
                    if (i != j && i != k && j != k) {
                        Sup = SuperficieTriangulo(coordX[i], coordY[i], coordX[j], coordY[j], coordX[k], coordY[k]);
                        if (Sup < MenorSup) {
                            //          System.out.println ("1(" +Float.toString( coordX[i]) + ";"+ Float.toString(coordY[i]) +")" +" 2("+ Float.toString(coordX[j]) +";"+ Float.toString(coordY[j]) +")" + " 3(" + Float.toString( coordX[k]) +";" + Float.toString(coordY[k]) +") - sup: "+ Sup + " - tiene ptos interno:"+ TienePuntosInternos(coordX[i],coordY[i],coordX[j],coordY[j],coordX[k],coordY[k],  coordX, coordY, cantDeElementos ));
                            /*          if( TienePuntosInternos(coordX[i], coordY[i], coordX[j]),coordY[j],coordX[k],coordY[k], coordX,coordY, cantDeElementos ){
                            MenorSup=Sup;
                            punto1=i+1; punto2=j+1; punto3=k+1;
                            mA1x= coordX[i]; mA1y=coordY[i];    mA2x= coordX[j]; mA2y=coordY[j];    mA3x= coordX[k]; mA3y=coordY[k]; 
                            }*/
                        }
                    }
                }
            }
        }
        System.out.println(punto1 + "(" + mA1x + ";" + mA1y + ") " + punto2 + "(" + mA2x + ";" + mA2y + ") " + punto3 + "(" + mA3x + ";" + mA3y + ")");
    }

}
