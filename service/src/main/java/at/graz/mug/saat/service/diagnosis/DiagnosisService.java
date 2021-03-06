package at.graz.mug.saat.service.diagnosis;

import at.graz.mug.saat.dao.diagnosisRepository.DiagnosisRepository;
import at.graz.mug.saat.model.diagnosisRepository.Diagnosis;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosisService {
    private final DiagnosisRepository diagnosis_repository;

    public DiagnosisService(DiagnosisRepository diagnosis_repository) {
        this.diagnosis_repository = diagnosis_repository;
    }

    public List<Diagnosis> getDiagnosis() {
        return diagnosis_repository.findAll();
    }

    public List<Diagnosis> getDiagnosis(Integer start, Integer limit) {
        return diagnosis_repository.getDiagnosisWithLimit(start, limit);
    }
}
