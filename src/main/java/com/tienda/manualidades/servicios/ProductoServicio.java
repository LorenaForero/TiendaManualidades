package com.tienda.manualidades.servicios;

import com.tienda.manualidades.persistencia.ProductoRepositorio;
import com.tienda.manualidades.persistencia.entidades.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;


    public List<Producto> getAll(){
        return productoRepositorio.getAll();
    }

    public Optional<Producto> getProduct(int idProducto){
        return productoRepositorio.getProducto(idProducto);
    }

    public List<Producto> getByCategory(int idCategoria){
    return productoRepositorio.getAlLByCategoria(idCategoria);
    }

    public Producto save(Producto producto){
        return productoRepositorio.crearProducto(producto);
    }

    public boolean delete(int idProducto){
        productoRepositorio.eliminarProducto(idProducto);
        if (productoRepositorio.getProducto(idProducto).isPresent()){
            return true;
        }
       return false;
    }
}
