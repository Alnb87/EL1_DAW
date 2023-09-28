package com.example.demo.Productos;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    private String Nombre;
    private String Descripcion;
    private double Precio;

    // Metodos constructores
    public Producto() {
    }
    public Producto(String id,String nombre,String descripcion, double precio) {
    	Id = id;
    	Nombre = nombre;
    	Descripcion = descripcion;
    	Precio = precio;
    }
    
    
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Nombre = descripcion;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
    
}
