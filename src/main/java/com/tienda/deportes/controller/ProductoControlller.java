package com.tienda.deportes.controller;


import com.tienda.deportes.model.Producto;
import com.tienda.deportes.repository.IProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductoControlller {

    @Autowired
    private IProductos producto;



    @GetMapping("/productos")
    public List<Producto> productos() {

        return producto.findAll();

    }

    @GetMapping("/productos/{id}")
    public Optional<Producto> productos(@PathVariable Long id) {

        return producto.findById(id);

    }

    @PostMapping("/crear")
    public Producto crear(@RequestBody Producto product) {
        return producto.save(product);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        producto.deleteById(id);
    }


    @PutMapping("/actualizar/{id}")
    public void actualizar(@RequestBody Producto producto, @PathVariable Long id) {

        Optional<Producto> productoActual = this.producto.findById(id);
        Producto product = productoActual.get();
        product.setNombre(producto.getNombre());
        product.setPrecio(producto.getPrecio());
        this.producto.save(producto);


    }
}
