package ru.dstu.fuzzytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dstu.fuzzytest.entity.IsFuzzy;

public interface IsFuzzyRepo extends JpaRepository<IsFuzzy, Long> {
}
