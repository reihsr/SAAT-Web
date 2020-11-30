package at.graz.mug.saat.service.tokenizer;

import at.graz.mug.saat.dao.tokenizer.SentenceRepository;
import org.springframework.stereotype.Service;

@Service
public class SentenceService {
    private final SentenceRepository sentenceRepository;

    public SentenceService(SentenceRepository sentenceRepository) {
        this.sentenceRepository = sentenceRepository;
    }
}
