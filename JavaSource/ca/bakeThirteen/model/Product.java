package ca.bakeThirteen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product implements Serializable {

private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="product_id")
    private int product_id;

    @Column(name="product_name")
    private String product_name;
    
    @Column(name="product_description")
    private String product_description;
    
    @Column(name="product_price", precision=2, scale=11)
    private BigDecimal product_price;

    @OneToMany(mappedBy = "product")
    private Collection <Product_Category> product_categories;
    
    public Product() {
        product_categories = new ArrayList<Product_Category>();
    }

   
    public Product(int product_id, String product_name, String product_description, BigDecimal product_price,
        Collection<Product_Category> product_categories) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_price = product_price;
        this.product_categories = product_categories;
    }


    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * @param product_name the product_name to set
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * @return the product_description
     */
    public String getProduct_description() {
        return product_description;
    }

    /**
     * @param product_description the product_description to set
     */
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    /**
     * @return the product_price
     */
    public BigDecimal getProduct_price() {
        return product_price;
    }

    /**
     * @param product_price the product_price to set
     */
    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }


    /**
     * @return the product_categories
     */
    public Collection<Product_Category> getProduct_categories() {
        return product_categories;
    }


    /**
     * @param product_categories the product_categories to set
     */
    public void setProduct_categories(Collection<Product_Category> product_categories) {
        this.product_categories = product_categories;
    }
    
    




}
