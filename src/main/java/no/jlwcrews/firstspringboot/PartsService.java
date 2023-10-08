package no.jlwcrews.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsService {

    private final PartsRepository partsRepository;

    @Autowired
    public PartsService(PartsRepository partsRepository) {
        this.partsRepository = partsRepository;
    }

    public List<Part> getParts(){
        return partsRepository.getParts();
    }

    public void addPart(Part part){
        partsRepository.addPart(part);
    }

    public void deletePart(Part part) {
        partsRepository.deletePart(part);
    }
}
