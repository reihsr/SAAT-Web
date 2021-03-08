package at.graz.mug.saat.dao.diagnosisRepository;

import at.graz.mug.saat.model.diagnosisRepository.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Integer> {

    @Query(value = "SELECT * FROM saat.findings_materialized_view ORDER BY befund_id OFFSET :start LIMIT :limit", nativeQuery = true)
    public List<Diagnosis> getDiagnosisWithLimit(@Param("start") Integer start, @Param("limit") Integer limit);
}
