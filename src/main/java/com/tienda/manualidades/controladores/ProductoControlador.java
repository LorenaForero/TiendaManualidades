package com.tienda.manualidades.controladores;

import com.tienda.manualidades.persistencia.entidades.Producto;
import com.tienda.manualidades.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/todos")
    public List<Producto> getAll(){
        return productoServicio.getAll();
    }

    public Optional<Producto> getProducto(int productoId){
        return productoServicio.getProduct(productoId);
    }

    public List<Producto> getByCategory(int categoriaId){
        return productoServicio.getByCategory(categoriaId);
    }

    public Producto save(Producto producto){
        return productoServicio.save(producto);
    }

    public boolean delete(int productoId){
        return productoServicio.delete(productoId);
    }

}
