package com.example.demo.InterfaceProceso;

import java.util.List;
import java.util.Optional;

import com.example.demo.Productos.Producto;

public class IcarritoProceso {
	public List<Producto> Listar();
	public Optional<Producto> Buscar(String Id);
	public int Grabar(Producto ObjC);
	public void Eliminar(String Id);

}
