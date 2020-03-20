package Services;

import Repository.BaseRepository;
import com.wysokinski.Projekt.Model.BaseEntity;

import java.io.Serializable;
import java.util.Collection;

public interface BaseService <U extends BaseEntity, T extends Serializable, I extends BaseRepository<U,T>> {


    I getRepository();
   U save (U entity);
   U delete (T id);
   Collection <U> getAll();
   U getOne (T id);


}
