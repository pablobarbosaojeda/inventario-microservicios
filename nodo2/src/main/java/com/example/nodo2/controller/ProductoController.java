package com.example.nodo2.controller;

import com.example.nodo2.service.ProductoService;
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

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<String> actualizarCantidad(@PathVariable String id, @RequestParam int cantidad) {
        try {
            productoService.actualizarCantidad(id, cantidad);
            return ResponseEntity.ok("Cantidad actualizada correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
