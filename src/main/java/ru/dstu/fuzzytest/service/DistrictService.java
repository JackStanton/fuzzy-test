package ru.dstu.fuzzytest.service;

import org.springframework.stereotype.Service;
import ru.dstu.fuzzytest.entity.District;
import ru.dstu.fuzzytest.repository.DistrictRepo;

import java.util.List;

@Service
public class DistrictService {

    private final DistrictRepo repo;

    public DistrictService(DistrictRepo repo) {
        this.repo = repo;
    }

    public List<District> getAll(){
        return repo.findAll();
    }
}
