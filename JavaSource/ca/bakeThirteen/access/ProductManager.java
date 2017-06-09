package ca.bakeThirteen.access;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ca.bakeThirteen.model.*;

/**
 * Handle CRUD actions for Product class.
 * 
 * @author blink
 * @version 1.0
 * 
 */
@Dependent
@Stateless
public class ProductManager implements Serializable {
    @PersistenceContext(unitName="bakeThirteen-persistence-unit") EntityManager em;

    /**
     * Find Product record from database.
     * 
     * @param id
     *            primary key for record.
     * @return the Product record with key = id, null if not found.
     */
    public Product find(int id) {
        return em.find(Product.class, id);
        }

    /**
     * Persist Product record into database. id must be unique.
     * 
     * @param product
     *            the record to be persisted.
     */
    public void persist(Product product) {
        em.persist(product);
    }

    /**
     * merge Product record fields into existing database record.
     * 
     * @param product
     *            the record to be merged.
     */
    public void merge(Product product) {
        em.merge(product);
    }

    /**
     * Remove product from database.
     * 
     * @param product
     *            record to be removed from database
     */
    public void remove(Product product) {
        //attach product
        product = find(product.getProduct_id());
        em.remove(product);
    }

    /**
     * Return Products table as array of Product.
     * 
     * @return Product[] of all records in Products table
     */
    public Product[] getAll() {
        TypedQuery<Product> query = em.createQuery("select p from Product p", Product.class); 
        java.util.List<Product> products = query.getResultList();
        Product[] prodarray = new Product[products.size()];
        for (int i=0; i < prodarray.length; i++) {
            prodarray[i] = products.get(i);
        }
        return prodarray;
    }
}
