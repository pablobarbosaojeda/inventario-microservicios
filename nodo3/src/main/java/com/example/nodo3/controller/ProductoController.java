package com.example.nodo3.controller;

import com.example.nodo3.model.Producto;
import com.example.nodo3.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> consultarProducto(@PathVariable String id) {
        Producto producto = productoService.consultarProductoPorId(id);
        return ResponseEntity.ok(producto);
    }
}
