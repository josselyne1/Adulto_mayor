/*
 *La casa del adulto mayor tiene 37 personas registradas y 
requiere un reporte de los adultos con más de 85 años. Para ello 
implementa un sistema en el que se capturan el nombre y la edad de 
cada persona e imprime los datos de quienes cumplen con la condición solicitada.
 */
package adulto_mayor;

import java.util.Scanner;

/**
 *
 * josselyne ester chilito galindez, codigo: 20201187434
 */
public class Adulto_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int  edad;
       
       String nombre;
        
        
        String [][]reporte = new String [37][2]; // DEFINIR MATRIZ 
 
       for (int c=0;c<37;c++){
           System.out.println("DIGITE EL NOMBRE #"+(c+1));
           nombre=leer.next();
           System.out.println("DIGITE SU EDAD ");
           edad=leer.nextInt();
           
           if(edad>85){
           
           reporte [c][0] = nombre;// VA A VOLVER A GUARDAR NOMBRE Y EDAD EN LA MATRIZ / REPORTE
           reporte [c][1] = String.valueOf(edad); //convierte el int a un string / MESES lo va a convertir en letras/ string
           }
           
           
       }
           
          System.out.println("LOS ADULTOS MAYORES A 85 AÑOS SON "); 
          
       for(int i=0;i<37;i++){ //i : contaodr del for
           
           if( (reporte[i][0] != null) && (reporte[i][1] != null)){
           System.out.println("*********************************");  
           System.out.println("Nombre : "+reporte[i][0]+" numero #"+(i+1));
           System.out.println("Edad: "+reporte[i][1]);
               
       }       
       }
       
        
    }
    
}
