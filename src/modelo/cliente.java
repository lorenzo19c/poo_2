/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lorenzo Cotzojay
 */
public class cliente extends Persona {
private String nit; 
public cliente (){}
    public cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }
    
    

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
     public void agregar(){
    System.out.println("nit: "+ getNit ());
    System.out.println("nombres: "+ this.getNombres());
    System.out.println("apellidos: "+ this.getApellidos());
    System.out.println("direccion: "+ this.getDireccion() );
    System.out.println("telefono: "+ this.getTelefono() );
    System.out.println("fecha nacimineto: "+ this.getFecha_nacimiento());
    System.out.println("_________________________________________________________");
     }
    
}
