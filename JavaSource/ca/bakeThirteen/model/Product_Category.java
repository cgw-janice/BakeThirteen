package ca.bakeThirteen.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="products_categories")
public class Product_Category implements Serializable{

    @Id
    @Column(name="prod_cat_id")
    private int prod_cat_id;

    @OneToOne
    @JoinColumn(name="product_id")
    private Product product;
    
    @OneToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Product_Category() {
    }

    public Product_Category(int prod_cat_id, Product product, Category category) {
        this.prod_cat_id = prod_cat_id;
        this.product = product;
        this.category = category;
    }

    /**
     * @return the prod_cat_id
     */
    public int getProd_cat_id() {
        return prod_cat_id;
    }

    /**
     * @param prod_cat_id the prod_cat_id to set
     */
    public void setProd_cat_id(int prod_cat_id) {
        this.prod_cat_id = prod_cat_id;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }
    
    
    

}
