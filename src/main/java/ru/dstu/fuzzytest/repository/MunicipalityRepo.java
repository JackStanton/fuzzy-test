package ru.dstu.fuzzytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dstu.fuzzytest.entity.Municipality;

@Repository
public interface MunicipalityRepo extends JpaRepository<Municipality, Long> {
}
