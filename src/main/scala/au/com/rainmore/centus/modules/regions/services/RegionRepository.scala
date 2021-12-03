package au.com.rainmore.centus.modules.regions.services

import au.com.rainmore.centus.models.Region
import au.com.rainmore.centus.modules.core.BaseMongoRepository

trait RegionRepository extends BaseMongoRepository[Region, String]
