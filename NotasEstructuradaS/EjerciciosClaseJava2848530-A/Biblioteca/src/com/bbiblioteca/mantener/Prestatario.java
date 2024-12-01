package com.bbiblioteca.mantener;

public class Prestatario extends  General {
    private String direccion;
    private String telefono;
    private String ruc;
    private Ciudad ciudad;

    public  Prestatario () {

    }


    public Prestatario(String direccion, String  telefono, String ruc, Ciudad ciudad) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.ruc = ruc;
        this.ciudad = ciudad;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getDireccion(){
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getTelefono(){
        return telefono;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }


    public String getRuc(){
        return ruc;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }


    public Ciudad getCiudad(){
        return ciudad;
    }

    public  String toString() {
        return " Prestatario { " + super.toString() + " Direccion: " + direccion + " Telefono: " + telefono + " Ruc: " +  ruc + " Ciudad: " + ciudad + '}';
    }

}
