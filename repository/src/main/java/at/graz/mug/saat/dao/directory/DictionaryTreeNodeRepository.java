package at.graz.mug.saat.dao.directory;

import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryTreeNodeRepository extends JpaRepository<DictionaryTreeNode, Integer> {
}
