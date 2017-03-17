package orders.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by jamesmsw on 17-3-17.
 */
@Configuration
@EnableMongoRepositories(basePackages = "orders.db")
public class MongoConfig extends AbstractMongoConfiguration {
    protected String getDatabaseName() {
        return "OrdersDB";
    }

    public Mongo mongo() throws Exception {
        return new MongoClient();
    }
}
