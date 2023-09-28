package com.tienda.deportes.repository;

import com.tienda.deportes.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductos extends JpaRepository<Producto,Long> {
}
