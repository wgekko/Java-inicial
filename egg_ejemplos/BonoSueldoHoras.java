package egg_ejemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author WALTER GOMEZ
 */

/*
Laboratorio Computacion I 
consigna
6)- Cree las funciones necesarias para Calcular el sueldo de los trabajadores dependiendo las horas trabajadas.
El valor de la hora en horario diurnos (8:00 a 20:00) es de $10/hora, si el horario es nocturno (20:00 a 8:00)
se incrementa en un 50%. El programa debe pedir al usuario en que horario trabajo el empleado (hora ingreso, minuto ingreso, hora salida, minuto salida),
validar que la hora/minuto de ingreso no sea mayor a la hora/minuto de salida, validar que la cantidad de horas trabajadas no supere las 8 horas,
calcular cuantas horas trabajo en total y cuanto corresponde pagarle. Nota: Se recomienda calcular el tiempo laboral en minutos.
*/


public class BonoSueldoHoras {

    public static void main(String[] args) {
		
            //declaracion de variables  
		String turno = "";

                String horarioentrada = ""; 
		int horaentrada = 0;  
		String[] horaMinEntrada = null; //se define un array para luego trabajar y llevar todo a minutos

		String horariosalida = ""; 
		int horasalida = 0;  
		String[] horaMinSalida = null; 
	
                //calculo de tiempo de trabajo 
		double totalhorastrabajadas = 0;
		double mindetotalhorastrabajadas = 0;
		String horastrabajadas = "";
		double minutosentrada = 0;
		double minutossalida = 0;

		int pagomanana = 0;						
                 
		System.out.println("Trabajo turno Mañana o turno noche? ");
		turno = new Scanner(System.in).nextLine();
		
		
		if (turno.toLowerCase().contentEquals("mañana")) {
                

			while (true) {
  
				System.out.println("Hora de ingreso a trabajar en la mañana? (HH:MM)");
				horarioentrada = new Scanner(System.in).nextLine();

                        //	se busca determinar la hora  			    	
				horaMinEntrada = horarioentrada.split(":");
				horaentrada = Integer.parseInt(horaMinEntrada[0]);

                        // se valida hora de entrada 
				if (horaentrada >= 8) {
					break;
				} else {
					System.out.println("ingreso un valor invalido");
				}
			}

			while (true) {
				System.out.println("Hora de salida de trabajar? (de 8:00 a 20:00 solamente)");
				horariosalida = new Scanner(System.in).nextLine();

                    //	 se busca determinar la hora de salida  
				horaMinSalida = horariosalida.split(":");
				horasalida = Integer.parseInt(horaMinSalida[0]); 

                    // se busca validar la salida es antes de la 20 hs 
				if (horasalida <= 20) {
					break;
				} else {
					System.out.println("ingreso un valor invalido");
				}
			}      

                    // se busca conocer los minutos de entreda y salida 
			minutosentrada = Double.parseDouble(horaMinEntrada[1]);
			minutossalida = Double.parseDouble(horaMinSalida[1]);
			
                    // calculo de total de horas trabajadas   

				totalhorastrabajadas = Math.abs(horasalida -horaentrada);
				mindetotalhorastrabajadas = totalhorastrabajadas *60;
			
			mindetotalhorastrabajadas = mindetotalhorastrabajadas + minutosentrada + minutossalida;		
                    //  se busca validar si no han trabajado mas de 8 hs  
			if (mindetotalhorastrabajadas>480) {
				System.out.println("Usted ha trabajado mas de 8 horas. no es incorrecto");
				System.exit(0);
			}
			
			totalhorastrabajadas = mindetotalhorastrabajadas/60;
			

                     // se busca calcular el importe a pagar 
			pagomanana = (int) Math.floor(totalhorastrabajadas);
			pagomanana = pagomanana * 10; 

			
			horastrabajadas = Double.toString(totalhorastrabajadas);
			horastrabajadas = new DecimalFormat("#").format(totalhorastrabajadas);
			
			System.out.println(" ");
			System.out.println("Usted trabajo de " + horaMinEntrada[0] + ":" + horaMinEntrada[1] + " hasta "+ horaMinSalida[0] + ":" + horaMinSalida[1]);
			System.out.println(" Le correstponde $" + pagomanana +" por un total de " + horastrabajadas + " horas trabajadas." );
			
                        //	termino de la mañana
			    	 			
		} else if(turno.toLowerCase().contentEquals("noche")) {  // turno noche


				while (true) {  // entrada al turno noche
  
					System.out.println("Hora que entro a trabajar en la noche? (HH:MM)");
					horarioentrada = new Scanner(System.in).nextLine();

                            //	se determina la hora  			    	
					horaMinEntrada = horarioentrada.split(":");
					horaentrada = Integer.parseInt(horaMinEntrada[0]);

                            // se valida el horario de entrada 
					if (horaentrada <= 24 || horaentrada >= 20) {
						break;
					}
					else if (horaentrada < 8 ) {
						break; 
					}
					else{
						System.out.println("ingreso un valor invalido");
					}
				}
                            //salida del turno   
 
				while (true) {
					System.out.println("hora que salio de trabajar? ( 20:00 a 8:00 solamente)");
					horariosalida = new Scanner(System.in).nextLine();

                            //	se busca determinar la hora  
					horaMinSalida = horariosalida.split(":");
					horasalida = Integer.parseInt(horaMinSalida[0]); 

                            //	validar si salio antes de la 20 hs  
					if (horasalida <= 24 || horasalida >= 20) {
						break;
					}
					else if (horasalida < 8 ) {
						break; 
					}
					else{
						System.out.println("ingreso un valor invalido");
					}
				}					       

		     	horaentrada = formatoentrada(horaentrada);
		     	horasalida = formatosalida(horasalida);
		     
				
                            // validacion de horas trabajadas 
					totalhorastrabajadas = Math.abs(horasalida -horaentrada);
					mindetotalhorastrabajadas = totalhorastrabajadas *60;

                            // obtener los minutos de entreda y salida  
					minutosentrada = Double.parseDouble(horaMinEntrada[1]);
					minutossalida = Double.parseDouble(horaMinSalida[1]);
					
					mindetotalhorastrabajadas = mindetotalhorastrabajadas + minutosentrada + minutossalida;		
                            // se valida que no se haya trabajado mas de 8 horas  
					if (mindetotalhorastrabajadas>480) {
						System.out.println("Usted ha trabajado mas de 8 horas. no es incorrecto");
						System.exit(0);
					}
					
					totalhorastrabajadas = mindetotalhorastrabajadas/60;
					

                            // calculo de importe a pagar 
					pagomanana = (int) Math.floor(totalhorastrabajadas);
					pagomanana = pagomanana * 15; 

					
					horastrabajadas = Double.toString(totalhorastrabajadas);
					horastrabajadas = new DecimalFormat("#").format(totalhorastrabajadas);
					
					System.out.println(" ");
					System.out.println("Usted trabajo de " + horaMinEntrada[0] + ":" + horaMinEntrada[1] + " hasta "+ horaMinSalida[0] + ":" + horaMinSalida[1]);
					System.out.println(" Le correstponde $" + pagomanana +" por un total de " + horastrabajadas + " horas trabajadas." );
					
					
		     }
	
                        // finaliza el desarrollo del  turno noche 
				
				
                        //	validacion del turno 
		else {
			System.out.println("Por favor ingrese un turno correcto.");
			System.exit(0);
		}
	}



                // desarrollo de los metodos  
                // formato de 24 hs  

        private static int formatoentrada(int entrada) {

        //    calculo total para las horas trabajadas   

        
                        switch (entrada) {
                        case 20:
                                entrada = 8;
                                break;
                        case 21:
                                entrada = 9;
                                break;
                        case 22:
                                entrada = 10;
                                break;
                        case 23:
                                entrada = 11;
                                break;
                        case 24:
                                entrada = 12;
                                break;
                        case 00:
                                entrada = 12;
                                break;
                            }
                return entrada;

        }

        public static int formatosalida(int salida) {
                 
                        switch (salida) {
                        case 20:
                                salida = 8;
                                break;
                        case 21:
                                salida = 9;
                                break;
                        case 22:
                                salida = 10;
                                break;
                        case 23:
                                salida = 11;
                                break;
                        case 24:
                                salida = 12;
                                break;
                        case 00:
                                salida = 12;
                                break;
                        }

                        switch (salida) {
                        case 1:
                                salida = 13;
                                break;
                        case 2:
                                salida = 14;
                                break;
                        case 3:
                                salida = 15;
                                break;
                        case 4:
                                salida = 16;
                                break;
                        case 5:
                                salida = 17;
                                break;
                        case 6:
                                salida = 18;
                                break;
                        case 7:
                                salida = 19;
                                break;
                        case 8:
                                salida = 20;
                                break;
                        case 20:
                                salida = 8;
                                break;
                        case 21:
                                salida = 9;
                                break;
                        case 22:
                                salida = 10;
                                break;
                        case 23:
                                salida = 11;
                                break;
                        case 24:
                                salida = 12;
                                break;
                        case 00:
                                salida = 12;
                                break;
                                }

                        return salida;	

        }
  
    }
