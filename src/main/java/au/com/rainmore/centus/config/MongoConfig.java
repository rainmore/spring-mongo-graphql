package au.com.rainmore.centus.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import javax.inject.Inject;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    private MongoProperties mongoProperties;

    @Inject
    public MongoConfig(MongoProperties mongoProperties) {
        this.mongoProperties = mongoProperties;
    }

    @Override
    protected String getDatabaseName() {
        return mongoProperties.getDatabase();
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }

}
