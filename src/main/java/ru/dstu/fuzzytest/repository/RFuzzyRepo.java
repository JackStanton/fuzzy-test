package ru.dstu.fuzzytest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.dstu.fuzzytest.entity.RFuzzy;

public interface RFuzzyRepo extends JpaRepository<RFuzzy, Long> {
}
