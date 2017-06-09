package ca.bakeThirteen;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ca.bakeThirteen.access.ProductManager;
import ca.bakeThirteen.model.Product;

@Named("selectedProduct")
@ConversationScoped
public class SelectedProduct  implements Serializable{
    /** Hold ID used to reference product record. */
    private int productID;
    /** Manager for product objects.*/
    @Inject private ProductManager productManager;
    /** mechanism for starting conversation. */
    @Inject private Conversation conversation;
    /**
     * Construct list of SelectItems for all products from database.
     * @return array of all products.
     */
    public Product[] getProductItems() {
   //TESTProduct[] products = {new Product(1,"One"), new Product(2,"two")};
        Product[] products = productManager.getAll();
        return products;
    }
    /**
     * Action method for index form.
     * @return next page selector.
     */
    public String action() {
        //start conversation to handle products for one product
        conversation.begin();
        return "";
    }

    /**
     * productID access.
     * @return the productID
     */
    public int getProductID() {
        return productID;
    }
    
    public String getName() {
        Product c = productManager.find(productID);
        if (c != null) {
            return c.getProduct_name();
        } else {
            return "Not Found";
        }
    }

    /**
     * productID mutator.
     * @param productID the productID to set
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }
}
