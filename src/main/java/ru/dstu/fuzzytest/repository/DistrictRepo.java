package ru.dstu.fuzzytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dstu.fuzzytest.entity.District;

@Repository
public interface DistrictRepo extends JpaRepository<District, Long> {
}
