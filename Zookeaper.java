import java.util.Scanner;

public class Zookeaper {
    /**
     * @param args
     */
    public static void main(String[] args) {
        menuingreso();
    }

    public static void menuingreso() {
        Scanner sn = new Scanner(System.in);
        String auxiliar;
        String contraseña;
        boolean salir = false;
        int opcion;
        int intentoContraseña=0;
        System.out.println("-----------Inicio-------------");
        System.out.println("Bienvenido al Zoo");
        System.out.println("");
        System.out.println("----------Cuenta--------------");
        do {
            System.out.println("Ingrese la contraseña para el personal");
            auxiliar = sn.nextLine();
            intentoContraseña++;
            contraseña = "pay";
            if(intentoContraseña >= 4){
                System.out.println("Ingreso erroneamente la contraseña demasiadas veces");
                salir=true;
                break;
            }
        } while (!contraseña.equals(auxiliar));
        
        do {
            if (contraseña.equals(auxiliar)) {
                System.out.println("ADMINISTRACION");
                System.out.println("BIENVENIDO AL MENU DE INICIO");
                System.out.println("Seleccione una opcion del menu");
                System.out.println("1-Novedades");
                System.out.println("2-Ingresar a su turno");
                System.out.println("3-Visitas veterinarias");
                System.out.println("4-Salir");
                System.out.println("Introduce un numero");
                opcion = sn.nextInt();
                
                switch(opcion){
                    case 1:
                        novedades();
                    break;
                    case 2:
                        turnos();
                    break;
                    case 3:
                        visitas();
                    break;    
                     case 4:
                        salir = true;
                 System.out.println("salir");
                         break;
                        default:
                System.out.println("opcion no valida");
                }
            }
        } while (salir != true);
    }

    public static void novedades(){
            System.out.println("1-Novedades");
    }
            
    public static void turnos(){
        
            System.out.println("---------Turnos-------------");
		
            System.out.println("Bienvenido a su turno");
	    System.out.println("");
	    System.out.println("Seleccione turno: ");
            System.out.println("1. Turno Matutino");
	    System.out.println("2. Turno Tarde");
	    System.out.println("3. Turno Noche");
            
            System.out.println("");
            
    }      
            
    public static void visitas(){
           System.out.println("------------Visitas Veterinarias----------");
           System.out.println("Las visitas de chequeo son organizadas de forma azarosa,la proxima vista del veterinario sera a ver a los osos");
           System.out.println("");
	   System.out.println("Para una visita de emergencia dirijase al veterinario 24 hrs en el tablero de emergencias");
	   System.out.println("");
    }



}