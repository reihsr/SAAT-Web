package at.graz.mug.saat.controller.diagnosis;

import at.graz.mug.saat.model.diagnosisRepository.Diagnosis;
import at.graz.mug.saat.service.diagnosis.DiagnosisService;
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

    @GetMapping("getDiagnosisWithLimit")
    public List<Diagnosis> getDiagnosisWithLimit(Integer start, Integer limit) {
        System.out.println("Call to service get Diagnosis for " + start + " - " + limit);
        return service.getDiagnosis(start, limit);
    }

    @GetMapping("getDiagnosis")
    public List<Diagnosis> getDiagnosis() {
        System.out.println("Call to service get all Diagnosis");
        return service.getDiagnosis();
    }

}
