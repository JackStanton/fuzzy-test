package ru.dstu.fuzzytest.service;

import org.springframework.stereotype.Service;
import ru.dstu.fuzzytest.entity.Municipality;
import ru.dstu.fuzzytest.repository.MunicipalityRepo;

import java.util.List;

@Service
public class MunicipalityService {

    private final MunicipalityRepo repo;

    public MunicipalityService(MunicipalityRepo repo) {
        this.repo = repo;
    }

    public List<Municipality> getAll(){
        return repo.findAll();
    }
}
