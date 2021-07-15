
package dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Empleado {
    
    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Fecha getFechaN() {
        return fechaN;
    }
    
    public Fecha getFechaI() {
        return fechaI;
    }
    
    public void muestraDatosNacimiento() {
        System.out.println("Nombre: " + this.nombre.toUpperCase());
        System.out.print("Fecha de Nacimiento: " + fechaN.getAnio() + "-" + fechaN.getMes() + "-" + fechaN.getDia());
    }
    
    public void muestraDatosIngreso() {
        System.out.print("Fecha de Ingreso: " + fechaI.getAnio() + "-" + fechaI.getMes() + "-" + fechaI.getDia());
    }
    
    public void calculoNumDias(int anio, int mes, int dia) {
        
        int diatotal = 0;
        int cont = 0;
        GregorianCalendar fech = new GregorianCalendar(dia, mes-1, anio);
        GregorianCalendar fecAct = new GregorianCalendar();
        while (true){
            if ((fech.get(Calendar.DAY_OF_MONTH) == fecAct.get(Calendar.DAY_OF_MONTH)) && (fech.get(Calendar.MONTH)
                    == fecAct.get(Calendar.MONTH)) && (fech.get(Calendar.YEAR) == fecAct.get(Calendar.YEAR)))
            {
                break;
            }
            fech.add(Calendar.DAY_OF_MONTH, 1);
            cont++;
        }
        diatotal = cont % 365;
        System.out.print(diatotal + " días\n");
    }
    
    public void calculoNumMeses(int anio, int mes, int dia) {
        
        int mestotal = 0;
        int cont = 0;
        GregorianCalendar fech = new GregorianCalendar(dia, mes-1, anio);
        GregorianCalendar fecAct = new GregorianCalendar();
        while (true){
            if ((fech.get(Calendar.MONTH) == fecAct.get(Calendar.MONTH))&& (fech.get(Calendar.YEAR)
                    == fecAct.get(Calendar.YEAR)))
            {
                break;
            }
            fech.add(Calendar.MONTH, 1);
            cont++;
        }
        mestotal = cont % 12;
        System.out.print(mestotal + " meses, ");
    }
    
    public void calculoNumAnios(int anio, int mes, int dia) {
        
        int aniototal = 0;
        int cont = 0;
        GregorianCalendar fech = new GregorianCalendar(dia, mes-1, anio );
        GregorianCalendar fecAct = new GregorianCalendar();
        while ((fech.get(Calendar.YEAR) != fecAct.get(Calendar.YEAR))){
            fech.add(Calendar.YEAR, 1);
            cont++;
        }
        aniototal = cont;
        System.out.print(aniototal +" años, ");
    }
    
    @Override
    public String toString() {
        return this.nombre + "\n" + this.getFechaN() + "\n" + this.fechaI;
    }
}


