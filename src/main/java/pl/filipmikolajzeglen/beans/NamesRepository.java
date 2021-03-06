package pl.filipmikolajzeglen.beans;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.filipmikolajzeglen.config.DatabaseDatasource;

@Component
public class NamesRepository {

    private DatabaseDatasource ds;

    @Autowired
    public NamesRepository(DatabaseDatasource ds) {
        this.ds = ds;
    }

    public List<String> getAll() {
        return ds.getDatabase();
    }
}