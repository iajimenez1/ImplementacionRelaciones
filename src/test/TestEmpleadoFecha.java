
package test;

import dominio.Empleado;
import dominio.Fecha;
import java.util.Scanner;


public class TestEmpleadoFecha {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1;
        int anioN, mesN, diaN;
        int anioI, mesI, diaI;
        String nombre;
        System.out.print("Nombre Del empleado:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.print("Año: ");
        anioN = entrada.nextInt();
        System.out.print("Mes: ");
        mesN = entrada.nextInt();
        System.out.print("Día: ");
        diaN = entrada.nextInt();
        fNacimiento = new Fecha(anioN, mesN, diaN);
        System.out.println("Digite la fecha de Ingreso a la empresa");
        System.out.print("Año: ");
        anioI = entrada.nextInt();
        System.out.print("Mes: ");
        mesI = entrada.nextInt();
        System.out.print("Día: ");
        diaI = entrada.nextInt();
        fIngreso = new Fecha(anioI, mesI, diaI);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("||                              Datos Ingresados                                  ||");
        System.out.println("------------------------------------------------------------------------------------");
        empleado1.muestraDatosNacimiento();
        System.out.print(" Su edad actualidad es: ");
        empleado1.calculoNumAnios(diaN, mesN, anioN);    
        empleado1.calculoNumMeses(diaN, mesN, anioN);
        empleado1.calculoNumDias(diaN, mesN, anioN);
        empleado1.muestraDatosIngreso();
        System.out.print(" El tiempo en la empresa es: ");
        empleado1.calculoNumAnios(diaI, mesI, anioI);
        empleado1.calculoNumMeses(diaI, mesI, anioI);
        empleado1.calculoNumDias(diaI, mesI, anioI);
        System.out.println("------------------------------------------------------------------------------------");
    }
    
}
