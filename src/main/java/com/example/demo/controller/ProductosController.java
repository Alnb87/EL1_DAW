package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.InterfaceProceso.IProductosProceso;
import com.example.demo.Productos.Producto;

@Controller
@RequestMapping
public class ProductosController {
	
	@Autowired
	private IProductosProceso proceso;
	
	//Metodo listar
	@GetMapping("/listar") // http://localhost:8080/listar
	public String Listado(Model m) {
		List<Producto> lista = proceso.Listar();
		m.addAttribute("Productos",lista);
		return "listado"; //listado.html
	}

}
