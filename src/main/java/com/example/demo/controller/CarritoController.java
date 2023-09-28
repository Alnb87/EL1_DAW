package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Proceso.CarritoProceso;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoProceso IcarritoProceso;

    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return IcarritoProceso.listarProductos();
    }

    @PostMapping("/agregar/{productoId}")
    public void agregarAlCarrito(@PathVariable Long productoId) {
        IcarritoProceso.agregarAlCarrito(productoId);
    }

    @GetMapping("/ver")
    public List<ItemCarrito> verCarrito() {
        return IcarritoProceso.verCarrito();
    }

    @PostMapping("/actualizar")
    public void actualizarCarrito(@RequestBody List<ItemCarrito> items) {
        IcarritoProceso.actualizarCarrito(items);
    }

    @PostMapping("/realizar-pago")
    public void realizarPago() {
        IcarritoProceso.realizarPago();
    }
}
