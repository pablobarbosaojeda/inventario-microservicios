package com.example.nodo1.service;

import com.example.nodo1.model.Producto;
import com.example.nodo1.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
}
