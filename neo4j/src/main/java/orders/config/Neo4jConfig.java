package orders.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.Neo4jServer;

/**
 * Created by james on 17-3-19.
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "orders.db")
public class Neo4jConfig extends Neo4jConfiguration{
    public Neo4jServer neo4jServer() {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return null;
    }
}
