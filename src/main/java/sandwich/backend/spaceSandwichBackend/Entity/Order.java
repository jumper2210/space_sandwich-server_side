package sandwich.backend.spaceSandwichBackend.Entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import sandwich.backend.spaceSandwichBackend.Service.BreadTypes;
import sandwich.backend.spaceSandwichBackend.Service.OrderData;
import sandwich.backend.spaceSandwichBackend.Service.Ingredients;
import sandwich.backend.spaceSandwichBackend.Service.Sauces;


@Entity(name = "spacesandwich")
@Table(name = "orders")
@TypeDef(name = "json", typeClass = JsonStringType.class)

public class Order  {

    @Id
    @GeneratedValue
    private Integer id;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Ingredients ingredients;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Sauces sauces;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private BreadTypes breadTypes;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private  OrderData orderData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public OrderData getOrderData(){
        return orderData;
    }
    public void setOrder_date(OrderData orderData){
        this.orderData = orderData;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Sauces getSauces() {
        return sauces;
    }
    public void setSauces(Sauces sauces) {
        this.sauces = sauces;
    }

    public BreadTypes getBreadTypes() {
        return breadTypes;
    }
    public void setBreadTypes(BreadTypes breadTypes) {
        this.breadTypes = breadTypes;
    }
}