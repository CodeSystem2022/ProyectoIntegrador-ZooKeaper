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
            contraseña = "contraseña";
            if(intentoContraseña >= 4){
                System.out.println("Ingreso erroneamente la contraseña demasiadas veces");
                salir=true;
                break;
            }
        } while (!contraseña.equals(auxiliar));
        
        do {
             //comentario ejemplo
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
                try {
                    switch (opcion) {
                        case 1:
                            System.out.println("opcion 1");
                            break;
                        case 2:
                            System.out.println("opcion 2");
                            break;
                        case 3:
                            System.out.println("opcion 3");
                            break;
                        case 4:
                            salir = true;
                            System.out.println("salir");
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    sn.next();
                }
            }
        } while (salir != true);
    }

}