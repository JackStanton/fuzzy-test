package ru.dstu.fuzzytest.service;

import org.springframework.stereotype.Service;
import ru.dstu.fuzzytest.entity.Building;
import ru.dstu.fuzzytest.repository.BuildingRepo;

import java.util.List;

@Service
public class BuildingService {

    private final BuildingRepo repo;

    public BuildingService(BuildingRepo repo) {
        this.repo = repo;
    }

    public List<Building> getAll(){
        return repo.findAll();
    }
}
