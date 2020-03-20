package Repository;

import com.wysokinski.Projekt.Model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface BaseRepository<U extends BaseEntity, L extends Serializable>
        extends JpaRepository<U,L>, JpaSpecificationExecutor <U>
{
}
