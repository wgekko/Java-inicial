package egg_ejemplos;

/*
 * Cree un método con las siguientes características:
a. Nombre: actuar
b. Tipo de devolución: int
c. ParÃ¡metros: uno int y uno char.
d. AcciÃ³n: devuelve el int multiplicado por el ASCII del char.
e.
2. Cree un método, en el mismo archivo java anterior , con las siguientes
características:
a. Nombre: actuar
b. Tipo de devolución: int
c. Parámetros: una cadena tipo String.
d. Acción: devuelve el tamaño del parámetro recibido.
e. Ejecute el mÃ©todo en el mismo main anterior , invocándolo con una
cadena.
 */

/**
 *
 * @author WALTER GOMEZ
 */
public class MetodosIgualNombre {
    
    public static void main(String[] args) {
         int x = 10;
        char y = 'z';
        String cadena = "Hola Mundo !!!";
        actuar(x,y);
        actuar(cadena);
        
    }
    public static void actuar (int a, char b){
        System.out.println("se multiplica la variable de tipo entero  : "+ a +"  por la variable char   :  "+ b +" = " +(int)b+"  resultado   :  "+(a*b)+"\n");
    }
     public static void actuar (String a){
        System.out.println("el tamaño o longitud de la cadena es :  "+ a.length()+"\n");
    }
}
        
        
    
    

