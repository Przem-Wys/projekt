package Services;

import Repository.BaseRepository;
import com.wysokinski.Projekt.Model.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class BaseServiceImplem<K extends BaseEntity ,J extends Serializable, L extends BaseRepository<K,J>>
        implements BaseService <K,J,L> {

    public abstract L getRepository();

    @Override
    public K save(K entity) {
        return getRepository().save(entity);
    }

    @Override
    public K delete(J id) {
        K entity = getOne(id);
        entity.setActive(false);
        return save(entity);
    }

    @Override
    public Collection<K> getAll() {
        return getRepository().findAll()
                .stream()
                .filter(BaseEntity::getActive)
                .collect(Collectors.toList() );
    }

    @Override
    public K getOne(J id) {
       K k = getRepository().getOne(id);
        if (k.getActive()){
            return k;
        }else return null;

    }
}
