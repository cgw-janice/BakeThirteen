package ca.bakeThirteen.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ca.bakeThirteen.EditableProduct;
import ca.bakeThirteen.SelectedCategory;
import ca.bakeThirteen.access.ProductManager;
import ca.bakeThirteen.model.Product;




/**
 * Helper class for display Product page.
 * @author Janice Chan
 *@version 1
 */
 @Named
 @ConversationScoped
public class ProductListForm implements Serializable {
     
     /** selected category for product list.*/
     @Inject private SelectedCategory selectedCategory;
     
     /** Manager from Product objects.*/
     @Inject private ProductManager productManager;
     
  
     @Inject Conversation conversation;
     
     List<EditableProduct> list;
     
     
     /**
      * Returns array of EditableProducts that match the selected category.
      * @return list of editable products
      */
     public List<EditableProduct> getList() {
         if (list == null) {
             refreshList();
         }
         return list;
     }
    
     /**
    private void refreshList() {
        Product[] products = productManager.getAll();
        //  System.out.println(selectedCategory.getCategoryID());
        list = new ArrayList<EditableProduct>();
        for (int i = 0; i < products.length; i++) {
            list.add(new EditableProduct(products[i]));
        }  
    }
    **/
    
     private void refreshList() {
         
         Product[] products = productManager.getByCategory(selectedCategory.getCategoryID());
         //System.out.println(selectedCategory.getCategoryID());
         
         list = new ArrayList<EditableProduct>();
         
         for (int i = 0; i < products.length; i++) {
             list.add(new EditableProduct(products[i]));
         }
         
   
     }
     
    public  void setList(List<EditableProduct> ep) {
        list = ep;
    }

     /**
      * Delete the product and return to the same page.
      * @param e the product to be deleted
      * @return Navigation string
      */
     public String deleteRow(EditableProduct e) {
         productManager.remove(e.getProduct());
         list.remove(e);
         return null;
     }
     
     public String save() {
         for (EditableProduct e : list) {
             if (e.isEditable()) {
                 productManager.merge(e.getProduct());
                 e.setEditable(false);
             }
         }
         return null;
     }
     
     public String selectCategory() {
         conversation.end();
         return "index";
     }
}
