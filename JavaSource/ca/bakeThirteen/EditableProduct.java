package ca.bakeThirteen;

import ca.bakeThirteen.model.Product;

public class EditableProduct {

    /** Indicates associated product can be edited on a form.*/
    private boolean editable;
    
    /** Holds product to be displayed, edited or deleted.*/
    private Product product;
    
    /**
     * Convenience constructor.
     * @param product product to be displayed, edited or deleted.
     */
    public EditableProduct(Product product) {
        this.product = product;
    }
    
    /**
     * Returns true if associated product is editable.
     * @return the editable state
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * Set whether associated product is editable.
     * @param editable the state of editable to set
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
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

}
