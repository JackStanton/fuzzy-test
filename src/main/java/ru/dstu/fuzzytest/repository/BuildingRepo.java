package ru.dstu.fuzzytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dstu.fuzzytest.entity.Building;

@Repository
public interface BuildingRepo extends JpaRepository<Building, Long> {
}
