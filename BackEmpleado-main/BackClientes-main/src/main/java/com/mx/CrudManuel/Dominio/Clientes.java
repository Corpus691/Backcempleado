package com.mx.CrudManuel.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleadoo")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column (name = "iduser")
    private String clienteActivo;
    
    @Column (name = "nombre")
    private String clienteNombre;
    
    @Column (name = "puesto")
    private String clienteFechaCreacion;
    
    @Column (name = "salario")
    private String clienteFechaModificacion;

    @Column (name = "fecha_contratacion")
    private String fechacontratacion;
    
    public Clientes() {
    }

    

    @Override
    public String toString() {
        return "Clientes [idCliente=" + idCliente + ", clienteActivo=" + clienteActivo + ", clienteNombre="
                + clienteNombre + ", clienteFechaCreacion=" + clienteFechaCreacion + ", clienteFechaModificacion="
                + clienteFechaModificacion + ", fechacontratacion=" + fechacontratacion + ", toString()="
                + super.toString() + "]";
    }



    public Clientes(int idCliente, String clienteActivo, String clienteNombre, String clienteFechaCreacion,
            String clienteFechaModificacion, String fechacontratacion) {
        
        this.clienteActivo = clienteActivo;
        this.clienteNombre = clienteNombre;
        this.clienteFechaCreacion = clienteFechaCreacion;
        this.clienteFechaModificacion = clienteFechaModificacion;
        this.fechacontratacion = fechacontratacion;
    }



    public int getIdCliente() {
        return idCliente;
    }



    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }



    public String getClienteActivo() {
        return clienteActivo;
    }



    public void setClienteActivo(String clienteActivo) {
        this.clienteActivo = clienteActivo;
    }



    public String getClienteNombre() {
        return clienteNombre;
    }



    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }



    public String getClienteFechaCreacion() {
        return clienteFechaCreacion;
    }



    public void setClienteFechaCreacion(String clienteFechaCreacion) {
        this.clienteFechaCreacion = clienteFechaCreacion;
    }



    public String getClienteFechaModificacion() {
        return clienteFechaModificacion;
    }



    public void setClienteFechaModificacion(String clienteFechaModificacion) {
        this.clienteFechaModificacion = clienteFechaModificacion;
    }



    public String getFechacontratacion() {
        return fechacontratacion;
    }



    public void setFechacontratacion(String fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }

}

