package ru.dstu.fuzzytest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.dstu.fuzzytest.entity.Interval;

public interface IntervalRepo extends JpaRepository<Interval, Long> {
}
