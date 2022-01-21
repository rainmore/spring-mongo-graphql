package au.com.rainmore.centus.modules.core;

import au.com.rainmore.centus.modules.core.domains.Model;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseMongoRepository<T extends Model, ID>
        extends MongoRepository<T, ID>, QuerydslPredicateExecutor<T> {
}
