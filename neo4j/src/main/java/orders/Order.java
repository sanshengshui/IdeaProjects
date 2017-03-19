package orders;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.RelationshipEntity;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by james on 17-3-19.
 */
@NodeEntity
public class Order {
    @GraphId
    private Long id;
    private String customer;
    private String type;

    @Relationship(type = "HAS_ITEMS")
    private Set<Item> items=new LinkedHashSet<Item>();

    public Long getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
