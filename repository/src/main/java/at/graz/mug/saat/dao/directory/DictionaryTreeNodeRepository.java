package at.graz.mug.saat.dao.directory;

import at.graz.mug.saat.model.dictionary.DictionaryTreeNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DictionaryTreeNodeRepository extends JpaRepository<DictionaryTreeNode, Integer> {

    @Query("SELECT dictionary_id, after_synonym, before_synonym, code_typ, code_value, ending, foreword, iscode, negation, occur, pattern, priority, priority_node, root, sentence, synonym FROM saat.dictionary d where d.root = true")
    List<DictionaryTreeNode> findRootNodes();
}
