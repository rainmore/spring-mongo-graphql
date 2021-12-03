package au.com.rainmore.centus

import au.com.rainmore.centus.models.{QRegion, Region}
import au.com.rainmore.centus.modules.regions.services.RegionRepository
import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

import java.time.LocalDateTime
import javax.inject.Inject
import scala.compat.java8.OptionConverters._
import scala.jdk.CollectionConverters._

object Application extends App {
    SpringApplication.run(classOf[Application], args: _*)
}

@SpringBootApplication
@EnableMongoRepositories
class Application {}