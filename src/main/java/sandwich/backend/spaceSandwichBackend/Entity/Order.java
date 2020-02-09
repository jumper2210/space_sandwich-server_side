package sandwich.backend.spaceSandwichBackend.Entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import sandwich.backend.spaceSandwichBackend.Service.Order_date;
import sandwich.backend.spaceSandwichBackend.Service.Ingredients;


@Data
@Entity(name = "spacesandiwch")
@TypeDef(name = "json", typeClass = JsonStringType.class)
@Table(name = "orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id_order;

    @Type(type = "json")
    @Column(columnDefinition = "json", nullable = false )
    private Ingredients ingredients;

    @Type(type = "json")
    @Column(columnDefinition = "json", nullable = false )
    private Order_date order_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Order_date getOrder_date(){
        return order_date;
    }
    public void setOrder_date(Order_date order_date){
        this.order_date = order_date;
    }
    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }
}