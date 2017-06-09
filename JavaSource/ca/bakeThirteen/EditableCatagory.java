package ca.bakeThirteen;

import ca.bakeThirteen.model.Category;

public class EditableCatagory {

    /** Indicates associated product can be edited on a form.*/
    private boolean editable;
    
    /** Holds product to be displayed, edited or deleted.*/
    private Category category;
    
    /**
     * Convenience constructor.
     * @param product product to be displayed, edited or deleted.
     */
    public EditableCatagory(Category category) {
        this.category = category;
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
    public Category getCategory() {
        return category;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Category category) {
        this.category = category;
    }

}
