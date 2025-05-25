package co.edu.poli.examen99.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.poli.examen99.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String> {
   
}
