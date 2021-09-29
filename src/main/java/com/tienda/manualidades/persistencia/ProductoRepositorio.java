package com.tienda.manualidades.persistencia;

import com.tienda.manualidades.persistencia.crud.ProductoCrudRepositorio;
import com.tienda.manualidades.persistencia.entidades.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //le indicamos a la clase que es la encarga de interactuar con la base de datos.
public class ProductoRepositorio {

    private ProductoCrudRepositorio productoCrudRepositorio;
    //Consultar todos los productos
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepositorio.findAll();
    }

    //Consultar todos los productos por categoria ordenados ascendentemente
    public List<Producto> getAlLByCategoria(int idCategoria){
        return productoCrudRepositorio.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    //Consultar los productos escasos
    /*public Optional<List<Producto>> getProductosEscasos(int cantidad){
        return productoCrudRepositorio.findByCantidadStockLessthanAndEstado(cantidad, true);
    }*/

    //Consultar un producto por Id
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepositorio.findById(idProducto);
    }

    public Producto crearProducto(Producto producto){
        return productoCrudRepositorio.save(producto);
    }

    public void eliminarProducto(int idProducto){
        productoCrudRepositorio.deleteById(idProducto);
    }

}
