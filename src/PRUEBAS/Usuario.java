/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRUEBAS;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Core i3 10ma Gen
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private int numero;
    private String Contraseña;
    private int codigo;

    public Usuario(String nombre, String apellido, int numero, String Contraseña, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.Contraseña = Contraseña;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void IngresoDatos(Random ran){
        String alternativa;
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
    public void editarNombre(){
        nombre = JOptionPane.showInputDialog("Ingrese sus nombres");
    }
    public void editarApellido(){
        apellido = JOptionPane.showInputDialog("Ingrese sus apellidos");
    }
    public void editarNumero(){
        do {                    
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
            if (numero<=900000000 || numero>=999999999) {
                JOptionPane.showMessageDialog(null, """
                                              Error, Su numero debe contener 9 digitos
                                              y Empezar en el numero nueve
                                              """);
            }
        } while (numero<=900000000 || numero>=999999999);
    }
    public void editarContraseña(){
        do {                        
            Contraseña = JOptionPane.showInputDialog("Ingrese su Contraseña");
            if (Contraseña.length()<=7) {
                JOptionPane.showMessageDialog(null, "Error,"
                    + " la contraseña debe contener al menos 8 caracteres");
            }
        } while (Contraseña.length()<=7);
    }
    
}
