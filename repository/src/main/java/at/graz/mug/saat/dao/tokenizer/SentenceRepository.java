package at.graz.mug.saat.dao.tokenizer;

import at.graz.mug.saat.model.tokenizer.Sentence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentenceRepository extends JpaRepository<Sentence, Integer> {
}
