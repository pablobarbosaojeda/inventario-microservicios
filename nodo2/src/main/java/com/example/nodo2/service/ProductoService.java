package com.example.nodo2.service;

import com.example.nodo2.model.Producto;
import com.example.nodo2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto actualizarCantidad(String id, int cantidad) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        if (producto.getCantidad() - cantidad < 0) {
            throw new RuntimeException("No se puede retirar más de la cantidad disponible");
        }
        producto.setCantidad(producto.getCantidad() - cantidad);
        return productoRepository.save(producto);
    }
}
