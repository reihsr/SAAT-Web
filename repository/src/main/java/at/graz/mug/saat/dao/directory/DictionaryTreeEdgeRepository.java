package at.graz.mug.saat.dao.directory;

import at.graz.mug.saat.model.dictionary.DictionaryTreeEdge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DictionaryTreeEdgeRepository extends JpaRepository<DictionaryTreeEdge, Integer> {
    public List<DictionaryTreeEdge> findByDictionaryid(Integer dictionary_id);
}
