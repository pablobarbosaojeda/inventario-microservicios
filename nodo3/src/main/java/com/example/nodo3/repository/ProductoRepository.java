package com.example.nodo3.repository;

import com.example.nodo3.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {
    // Aquí puedes agregar consultas personalizadas si las necesitas
}
