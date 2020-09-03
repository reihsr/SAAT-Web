package at.graz.mug.saat.controller.diagnosisRepository;

import at.graz.mug.saat.model.diagnosisRepository.Diagnosis;
import at.graz.mug.saat.service.diagnosisRepository.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DiagnosisController {

    @Autowired
    private DiagnosisService service;

    @GetMapping("getDiagnosis")
    public List<Diagnosis> getDiagnosis(Integer start, Integer limit) {
        System.out.println("Call to service get Diagnosis for " + start + " - " + limit);
        return service.getDiagnosis(start, limit);
    }

}
