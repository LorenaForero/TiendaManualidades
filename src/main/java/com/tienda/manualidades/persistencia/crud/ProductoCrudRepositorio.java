package com.tienda.manualidades.persistencia.crud;

import com.tienda.manualidades.persistencia.entidades.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepositorio extends CrudRepository<Producto,Integer> {
    //Query methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);//Consultar todos los productos por categoria

    //Optional<List<Producto>> findByCantidadStockLessthanAndEstado(int cantidadStock, boolean estado);//LessThan = menor que
}
