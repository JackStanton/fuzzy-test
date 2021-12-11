package ru.dstu.fuzzytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dstu.fuzzytest.entity.LFuzzy;

public interface LFuzzyRepo extends JpaRepository<LFuzzy, Long> {
}
