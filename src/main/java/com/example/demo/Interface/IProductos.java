package com.example.demo.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Productos.Producto;

@Repository
public interface IProductos extends JpaRepository<Producto, String>{

}
