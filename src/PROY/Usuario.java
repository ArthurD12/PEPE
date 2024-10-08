/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROY;

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
    
 
}
