package at.graz.mug.saat.dao.directory;

import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DictionaryTreeNodeRepository extends JpaRepository<DictionaryTreeNode, Integer> {

    List<DictionaryTreeNode> findByRoot(Boolean root);
}
