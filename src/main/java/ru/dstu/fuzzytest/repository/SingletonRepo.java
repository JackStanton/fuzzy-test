package ru.dstu.fuzzytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dstu.fuzzytest.entity.Singleton;

public interface SingletonRepo extends JpaRepository<Singleton, Long> {
}
