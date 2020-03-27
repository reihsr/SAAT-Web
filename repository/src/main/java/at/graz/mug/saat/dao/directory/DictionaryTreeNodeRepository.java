package at.graz.mug.saat.dao.directory;

import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DictionaryTreeNodeRepository extends JpaRepository<DictionaryTreeNode, Integer> {

    List<DictionaryTreeNode> findByRoot(Boolean root);

    @Query(value = "SELECT * FROM saat.dictionary WHERE dictionary_id = :dictionary_id", nativeQuery = true)
    List<DictionaryTreeNode> findByDictionaryId(@Param("dictionary_id") Integer dictionary_id);
}
