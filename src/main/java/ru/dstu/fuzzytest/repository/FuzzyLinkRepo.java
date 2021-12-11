package ru.dstu.fuzzytest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.dstu.fuzzytest.entity.FuzzyLink;

public interface FuzzyLinkRepo extends JpaRepository<FuzzyLink, Long> {


}
