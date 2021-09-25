package prueba.final2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		String opcion2 ;
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		
		PolizaGeneral poliza1 = new PolizaGeneral();
		poliza1.setAñoVigencia("2001");
		PolizaGeneral poliza2 = new PolizaGeneral();
		poliza2.setAñoVigencia("2002");
		
		PolizaGeneral poliza3 = new PolizaGeneral();
		poliza3.setAñoVigencia("2004");
		
		PolizaGeneral poliza4 = new PolizaGeneral();
		poliza4.setAñoVigencia("2005");
		
		PolizaGeneral poliza5 = new PolizaGeneral();
		poliza5.setAñoVigencia("2006");
		
		PolizaGeneral poliza6 = new PolizaGeneral();
		poliza1.setAñoVigencia("2008");
		
		PolizaGeneral poliza7 = new PolizaGeneral();
		poliza7.setAñoVigencia("2011");
		
		PolizaGeneral poliza8 = new PolizaGeneral();
		poliza8.setAñoVigencia("2012");
		
		PolizaGeneral poliza9 = new PolizaGeneral();
		poliza9.setAñoVigencia("2014");
		
		
		PolizaGeneral listPolizas[]= new PolizaGeneral[10];
		listPolizas[0]=poliza1;
		listPolizas[1]=poliza2;
		listPolizas[2]=poliza3;
		listPolizas[3]=poliza4;
		listPolizas[4]=poliza5;
		listPolizas[5]=poliza6;
		listPolizas[6]=poliza7;
		listPolizas[7]=poliza8;
		listPolizas[8]=poliza9;
		 List<PolizaGeneral>listUni = new ArrayList<PolizaGeneral>();
		
		
	do {
		
		System.out.println("############################");
		System.out.println("Aseguradora del Sur, elija una opcion");
		System.out.println("1-Ingresar Poliza");
		System.out.println("2-Actualizar valor ");
		System.out.println("3-Consultar Poliza");
		System.out.println("Imprimir Reporte");
		System.out.println("5-Salir");
		System.out.println("#############################");
		opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Escoja el tipo de poliza que desea ingresar");
			System.out.println("a-Poliza General");
			System.out.println("b-Poliza Vip");
			opcion2 = tecladoString.nextLine();
			if(opcion2.equals("a")) {
				 
				 for (int i = 0; i<10;i++){                        
					 PolizaGeneral polizas = new PolizaGeneral();  
					 listPolizas[i] = polizas;                     
				
				
				System.out.println("Ingrese nombre");
			String nombre = tecladoString.nextLine();
			System.out.println("Descripcion");
			String descripcion = tecladoString.nextLine();
			System.out.println("Año Vigencia");
			String añoVigencia = tecladoString.nextLine();
			System.out.println("Codigo de Poliza");
			String codigoPoliza = tecladoString.nextLine();
			System.out.println("Valor de la Poliza");
			String valorPoliza = tecladoString.nextLine();
			System.out.println("Ingrese codigo de descuento");
			String codigoDescuento = tecladoString.nextLine();
			System.out.println("Ingrese codigo Numero de Seguro");
			int numeroSeguro = teclado.nextInt();
		} else if(opcion2.equals("b")) {
			String nombre = tecladoString.nextLine();
			System.out.println("Descripcion");
			String descripcion = tecladoString.nextLine();
			System.out.println("Año Vigencia");
			String añoVigencia = tecladoString.nextLine();
			System.out.println("Codigo de Poliza");
			String codigoPoliza = tecladoString.nextLine();
			System.out.println("Valor de la Poliza");
			int valorPoliza = teclado.nextInt();
			System.out.println("Beneficio");
			String beneficio = tecladoString.nextLine();
		}
				
		break;

		case 2:
		System.out.println("Ingrese el codigo de Poliza");
		String codigoDePoliza = tecladoString.nextLine();
			
		case 3:
			System.out.println("Ingrese el codigo de Poliza");
			String codigoDePoliza1 = tecladoString.nextLine();
		case 4:
			System.out.println("Reporte de todos los datos");
		
			
			
		default:
			System.out.println("No ha elegido ninguna opcion");
			break;
		}
		
		
		}while(opcion!=5);
}

}
}
