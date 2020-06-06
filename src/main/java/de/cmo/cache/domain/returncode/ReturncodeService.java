package de.cmo.cache.domain.returncode;

import org.springframework.stereotype.Service;

@Service
public class ReturncodeService {

    final ReturncodeRepository repository;

    public ReturncodeService(ReturncodeRepository repository) {
        this.repository = repository;
    }

    public Returncode getReturncode(long id) {
        Returncode result = repository.findById(id);
        if (result == null) {
            result = new Returncode();
        }
        return result;
    }

    public void insert() {
        repository.save(new Returncode("0000001", "NENENNENENENENENE"));
    }
}
