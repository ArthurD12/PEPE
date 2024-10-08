/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROY;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Core i3 10ma Gen
 */
public class USER {
    public static void main(String[] args) {
        Random ran = new Random();
        
        int opcion, opcion2=0,opcion3=0;
        int piso=0;
        int hotel=0;
        
        
        String nombre="";
        String apellido="";
        int numero=0;
        int codigo=0, codigouser;
        String Contraseña="", contraseñauser;
        
        String alternativa="";
        String estado="";
        int editar=0;
        
        
        int dias=0;
        
        //validador para que vuelva cuando se cree cuenta
        do {  
            JOptionPane.showMessageDialog(null, "Bienvenido al HOTEL Cisnes Querido Usuario "+nombre);
            //validador para opciones 1 y 2
            do {            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  1. Iniciar Sesion
                                                                  2. Crear cuenta
                                                                  3. Salir
                                                         """));
                if (opcion==3) {
                    //opcion salir
                    JOptionPane.showMessageDialog(null, "¿Seguro que desea salir?");
                    do {              
                        alternativa = JOptionPane.showInputDialog("""
                                                          SI
                                                          NO
                                                          """).toUpperCase();
                    } while (!alternativa.equals("SI") && !alternativa.equals("NO"));
                    if (alternativa.equalsIgnoreCase("SI")) {
                        break;
                    }
                }
            } while (opcion!=1&&opcion!=2);
            //Ingreso de Datos
            if (opcion==2) {
                JOptionPane.showMessageDialog(null, "Hola Ingrese sus Datos");
                alternativa="";
                do {    
                    nombre = JOptionPane.showInputDialog("Ingrese sus nombres");
                    apellido = JOptionPane.showInputDialog("Ingrese sus apellidos");
                    do {                    
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
                        if (numero<=900000000 || numero>=999999999) {
                        JOptionPane.showMessageDialog(null, """
                                                            Error, Su numero debe contener 9 digitos
                                                            y Empezar en el numero nueve
                                                            """);
                        }
                    } while (numero<=900000000 || numero>=999999999);
                    do {                        
                        Contraseña = JOptionPane.showInputDialog("Ingrese su Contraseña");
                        if (Contraseña.length()<=7) {
                            JOptionPane.showMessageDialog(null, "Error,"
                                    + " la contraseña debe contener al menos 8 caracteres");
                        }
                    } while (Contraseña.length()<=7);
                
                
                codigo = ran.nextInt(111111,999999);
                
                JOptionPane.showMessageDialog(null, "SUS DATOS SON:\n"
                        + "Nombres: "+nombre+"\n"
                                + "Apellido: "+apellido+"\n"
                                        + "Numero: "+numero+"\n"
                                                + "Contraseña: "+Contraseña+"\n"
                                                        + "Codigo: "+codigo);
                alternativa = JOptionPane.showInputDialog("""
                                                           CONFIRMAR DATOS
                                                           SI 
                                                           NO
                                                           """).toUpperCase();
                } while (!alternativa.equals("SI"));
            }  
            //Inicio Sesion
            if (opcion==1) {
                JOptionPane.showMessageDialog(null, "Hola Bienvenido "+nombre);
                do {                 
                    //Ingresar Codigo y Contraseña o Regresar
                    opcion2 =Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Elija la Opcion
                                                                      1.Ingresar Datos 
                                                                      2.Regresar
                                                                      """));
                    if (opcion2!=1&&opcion2!=2) {
                        JOptionPane.showMessageDialog(null, "Error, elija otra opcion");
                    }
                } while (opcion2!=1&&opcion2!=2);
                //Ingreso de Codigo y Contraseña
                if (opcion2==1) {
                    do {     
                        codigouser =Integer.parseInt(JOptionPane.showInputDialog("codigo:"));
                        contraseñauser = JOptionPane.showInputDialog("Contraseña:");
                        if (!contraseñauser.equals(Contraseña)|| codigouser!=codigo) {
                            JOptionPane.showMessageDialog(null, "Error, Contraseña o codigo incorrectos");
                        }
                    } while (!contraseñauser.equals(Contraseña)|| codigouser!=codigo);
                    //Ventana Principal Usuario
                    do { 
                        alternativa="";
                        editar=0;
                        piso=0;
                        opcion3 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                  *** 1. USER            2.CERRAR SESION  ***
                                                  ***          Hotel Cisnes               ***  
                                                  ***          3. Reservar                 ***                             
                                                                               """));
                        if (opcion3!=1&&opcion3!=2&&opcion3!=3) {
                            JOptionPane.showMessageDialog(null, "Error, Ingrese Otra opcion");
                        }    
                        //Editar datos usuario
                        if (opcion3==1) {
                            do {  
                                editar = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n"
                                    + "1.Nombres: "+nombre+" editar"+
                                    "\n2.Apellido: "+apellido+" editar"+
                                    "\n3.Numero: "+numero+ "editar"+
                                    "\n4.Contraseña: "+Contraseña+" editar"+
                                    "\n5.Regresar"+
                                    "\n Codigo: "+codigo));
                                if (editar!=1&&editar!=2&&editar!=3&&editar!=4&&editar!=5) {
                                    JOptionPane.showMessageDialog(null, "Error, Ingrese otra opcion");
                                } else {
                                    if (editar>=1||editar<=5) {
                                        switch (editar) {
                                        case 1:
                                        nombre = JOptionPane.showInputDialog("Ingrese Nuevo nombre");
                                        break;
                                        case 2:
                                        apellido = JOptionPane.showInputDialog("Ingrese Nuevo apellido");
                                        break;
                                        case 3:
                                            do {                                                
                                                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nuevo Numero"));
                                                if (numero<=900000000 || numero>=999999999) {
                                                    JOptionPane.showMessageDialog(null, """
                                                            Error, Su numero debe contener 9 digitos
                                                            y empezar en el numero nueve
                                                            """);
                                                }
                                            } while (numero<=900000000 || numero>=999999999);
                                        break;
                                        case 4:
                                            do {                                                
                                                Contraseña = JOptionPane.showInputDialog("Ingrese Nueva Contraseña");
                                                if (Contraseña.length()<=7) {
                                                    JOptionPane.showMessageDialog(null, "Error,"
                                                         +" la contraseña debe contener al menos 8 caracteres");
                                                }
                                            } while (Contraseña.length()<=7);
                                        break;
                                        }
                                    }
                                }
                            } while (editar!=5);
                        }
                        //Ventana de seleccion de pisos
                        if (opcion3==3) {
                            do {                                    
                                piso = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                       Elija el piso en el cual desea hospedarse
                                                                       1. Primer Piso
                                                                       2. Segundo Piso
                                                                       3. Tercer Piso
                                                                       4. Cuarto Piso
                                                                       5. Quinto Piso
                                                                       6. Sexto Piso
                                                                       7. --Regresar--
                                                                       """));
                                //Se llama la clase hotel y verificar si esta ocupado o no el piso
                                //Por Mientras
                                alternativa = "";
                                switch (piso) {
                                    case 1:
                                        if (hotel==0) {
                                            JOptionPane.showMessageDialog(null, """
                                                                                Piso Desocupado
                                                                                cuenta con:
                                                                                3 cuartos
                                                                                5 camas 
                                                                                2 baños
                                                                                1 cocina
                                                                                """);
                                            //llamar y mostrar los atributos del cuarto y el precio de la clase cuarto
                                            do {                                                    
                                                alternativa = JOptionPane.showInputDialog("""
                                                                                          Desea Ocupar El cuarto
                                                                                          SI
                                                                                          NO
                                                                                          """).toUpperCase();
                                                if (!alternativa.equals("SI")&&!alternativa.equals("NO")) {
                                                    JOptionPane.showMessageDialog(null, "Error, Ingrese otra opcion");
                                                }
                                            } while (!alternativa.equals("SI")&&!alternativa.equals("NO"));
                                           
                                            if (alternativa.equalsIgnoreCase("SI")) {
                                                do {              
                                                    //cantidad de dias a hospedarse
                                                    dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dias que desea quedarse"));
                                                    if (dias<1&&dias>365) {
                                                        JOptionPane.showMessageDialog(null, "Error, Ingrese minimo 1 dia");
                                                    }
                                                    do {                                                            
                                                        alternativa = JOptionPane.showInputDialog("""
                                                                                          Desea Continuar (Pagar)
                                                                                          SI
                                                                                          NO
                                                                                          """).toUpperCase();
                                                        if (!alternativa.equals("SI")&&!alternativa.equals("NO")) {
                                                            JOptionPane.showMessageDialog(null, "Error, Ingrese otra opcion");
                                                        }
                                                    } while (!alternativa.equals("SI")&&!alternativa.equals("NO"));
                                                } while (dias<1&&dias>365);
                                            }
                                            //llamar al metodo calcular costos y mostrar el precio
                                            
                                        } else{
                                            JOptionPane.showMessageDialog(null, "Piso Ocupado");
                                        }
                                        break;
                                    case 2:    
                                }
                            } while (piso!=1&&piso!=2&&piso!=3&&piso!=4&&piso!=5&&piso!=6&&piso!=7);
                        }  
                    } while (opcion3!=1&&opcion3!=2&&opcion3!=3||piso==7||alternativa.equals("NO")||editar==5);
                }  
            }
        } while (opcion==2||opcion2==2||opcion3==2);
        JOptionPane.showMessageDialog(null, "BYE BYE");
    }
}
