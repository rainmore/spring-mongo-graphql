package au.com.rainmore.centus.modules.regions

import au.com.rainmore.centus.models.Region
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor

trait RegionRepository extends MongoRepository[Region, String]
    with QuerydslPredicateExecutor[Region]
