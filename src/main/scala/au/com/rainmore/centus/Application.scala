package au.com.rainmore.centus

import au.com.rainmore.centus.models.{QRegion, Region}
import au.com.rainmore.centus.modules.regions.RegionRepository
import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

import java.time.LocalDateTime
import javax.inject.Inject
import scala.compat.java8.OptionConverters._
import scala.jdk.CollectionConverters._
import scala.sys.exit

object Application extends App {
    SpringApplication.run(classOf[Application], args: _*)
}

@SpringBootApplication
@EnableMongoRepositories
class Application @Inject()
(
    regionRepository: RegionRepository
) extends CommandLineRunner {

    override def run(args: String*): Unit = {
        println("region count: %d".format(regionRepository.count()))
        println("find by id: %s".format("5ae16cbde4b0724c1e3bf739"))
        val foo = regionRepository.findById("5ae16cbde4b0724c1e3bf739")
        println("foo.id: %s".format(foo.get().getId))
        println("foo.name: %s".format(foo.get().getName))

        val bar = new Region()
        bar.setName("test")
        bar.setDisplayName("test test")
        bar.setCreatedAt(LocalDateTime.now())
        bar.setUpdatedAt(LocalDateTime.now())

        regionRepository.save(bar)

        println("bar.id: %s".format(bar.getId))

        regionRepository.findById(bar.getId).asScala.foreach { r =>
            println("r.id: %s".format(r.getId))
            println("r.name: %s".format(r.getName))
        }

        println("---------------------")
        val testRegsions = regionRepository.findAll(QRegion.region.name.endsWithIgnoreCase("test"))
        testRegsions.asScala.foreach { r =>
            println("r.id: %s".format(r.getId))
            println("r.name: %s".format(r.getName))
            println("r.createdAt: %s".format(r.getCreatedAt))
        }
        println("---------------------")


        regionRepository.deleteAll(testRegsions)

        println("exists: %s".format(regionRepository.findAll(QRegion.region.name.endsWithIgnoreCase("test")).asScala.isEmpty))
        exit()

    }
}
