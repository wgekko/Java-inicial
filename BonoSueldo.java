package egg_ejemplos;


import java.util.List;
import java.util.*;
        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walter
 */
public class BonoSueldo {

    public static void mostrarOrdenado(int[] a) {
        // se muestra  por consola el arreglo ordenado
        System.out.println("el arreglo ordenado ");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + "\t");
        }
        System.out.println("");
    }

    private String nombreEmpleado;
    private long cuil;
    private int anioIngreso;
    private double sueldoBasico;
    private int mesLiquidacion;
    private int anioLiquidacion;
    private double montoAntiguedad;
        String [][] haberes= {{"100","Presentismo","9"},{"101","Titulo Prodesional","9"},{"102","Horas Extras","M"},{"103","Horas nocturnas","M"},{"104","Oros haberes ","M"}};
        String [][] deducciones= {{"200"," Obra Social", "3"}, {"201","Jubilacion", "11"},{"202","Sindicato", "2"},{"203","Seguro","1.5"},{"204","Otros", "M"}};
        List<Integer> codigosIngresados;

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getMesLiquidacion() {
        return mesLiquidacion;
    }

    public void setMesLiquidacion(int mesLiquidacion) {
        this.mesLiquidacion = mesLiquidacion;
    }

    public int getAnioLiquidacion() {
        return anioLiquidacion;
    }

    public void setAnioLiquidacion(int anioLiquidacion) {
        this.anioLiquidacion = anioLiquidacion;
    }

    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setMontoAntiguedad(double montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
    }

    public String[][] getHaberes() {
        return haberes;
    }

    public void setHaberes(String[][] haberes) {
        this.haberes = haberes;
    }

    public String[][] getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(String[][] deducciones) {
        this.deducciones = deducciones;
    }

    public List<Integer> getCodigosIngresados() {
        return codigosIngresados;
    }

    public void setCodigosIngresados(List<Integer> codigosIngresados) {
        this.codigosIngresados = codigosIngresados;
    }
       
                
    
    
    
}
