package com.example.demo.Proceso;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Interface.IProductos;
import com.example.demo.InterfaceProceso.IProductosProceso;
import com.example.demo.Productos.Producto;

@Service
public class ProductosProceso implements IProductosProceso{

	@Autowired
	private IProductos data;
	@Override
	public List<Producto> Listar() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> Buscar(String Id) {
		return data.findById(Id);
	}

	@Override
	public int Grabar(Producto ObjC) {
		int rpta = 0;
		Producto Obj = data.save(ObjC);
		if(!Obj.equals(null)) rpta = 1;
		return rpta;
	}

	@Override
	public void Eliminar(String Id) {
		data.deleteById(Id);
		
	}
	

}
