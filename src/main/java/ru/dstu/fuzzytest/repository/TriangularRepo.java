package ru.dstu.fuzzytest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.dstu.fuzzytest.entity.Triangular;

public interface TriangularRepo extends JpaRepository<Triangular, Long> {
}
