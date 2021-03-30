
package taller6;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Taller6 {

    
    public static void main(String[] args)
    {
        lista();
     
    }
    
      public static void lista()
    { 
        
        Scanner leer= new Scanner(System.in);
       Paciente p[] = new Paciente[2]; 
       
       
     double codigo=0;
     String apellidos="";
     String nombres="";
     String sexo="";
     String direccion="";
     String lugarAtendido="";
     String motivo="";
     String medico="";
     double fecha=0;
      
       for(int i=0; i<p.length;i++)
       {
           System.out.println("ingrese los apellidos");
           apellidos= leer.nextLine();
           System.out.println("ingrese los nombres");
           nombres= leer.nextLine();
           System.out.println("ingrese el sexo");
           sexo= leer.nextLine();
           System.out.println("ingrese la direccion de residencia");
           direccion= leer.next();
           System.out.println("ingrese el lugar donde fue atemdido");
           lugarAtendido= leer.nextLine();
           System.out.println("ingrese el motivo de la cita");
           motivo= leer.nextLine();
           System.out.println("ingrese el medico que atendio");
           medico= leer.nextLine();
           System.out.println("ingrese la fecha de cita");
           fecha= leer.nextDouble();
           System.out.println("ingrese el codigo");
           codigo = leer.nextDouble();
           leer.nextLine();
           
       }
       
    }
     
  
}
