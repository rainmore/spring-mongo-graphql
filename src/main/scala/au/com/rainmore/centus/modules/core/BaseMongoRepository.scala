package au.com.rainmore.centus.modules.core

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
trait BaseMongoRepository[T, ID]
    extends MongoRepository[T, ID]
    with QuerydslPredicateExecutor[T]
