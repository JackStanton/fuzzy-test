package ru.dstu.fuzzytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dstu.fuzzytest.entity.FuzzyType;

public interface FuzzyTypeRepo extends JpaRepository<FuzzyType, Long> {
}
