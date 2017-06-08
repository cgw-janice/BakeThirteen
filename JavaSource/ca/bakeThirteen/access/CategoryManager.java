package ca.bakeThirteen.access;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ca.bakeThirteen.model.*;

/**
 * Handle CRUD actions for Category class.
 * 
 * @author blink
 * @version 1.0
 * 
 */
@Dependent
@Stateless
public class CategoryManager implements Serializable {
    @PersistenceContext(unitName="inventory-jpa") EntityManager em;

    /**
     * Find Category record from database.
     * 
     * @param id
     *            primary key for record.
     * @return the Category record with key = id, null if not found.
     */
    public Category find(int id) {
        return em.find(Category.class, id);
        }

    /**
     * Persist Category record into database. id must be unique.
     * 
     * @param category
     *            the record to be persisted.
     */
    public void persist(Category category) {
        em.persist(category);
    }

    /**
     * merge Category record fields into existing database record.
     * 
     * @param category
     *            the record to be merged.
     */
    public void merge(Category category) {
        em.merge(category);
    }

    /**
     * Remove category from database.
     * 
     * @param category
     *            record to be removed from database
     */
    public void remove(Category category) {
        //attach category
        category = find(category.getCategory_id());
        em.remove(category);
    }

    /**
     * Return Categories table as array of Category.
     * 
     * @return Category[] of all records in Categories table
     */
    public Category[] getAll() {
        TypedQuery<Category> query = em.createQuery("select c from Category c", Category.class); 
        java.util.List<Category> categories = query.getResultList();
        Category[] catarray = new Category[categories.size()];
        for (int i=0; i < catarray.length; i++) {
            catarray[i] = categories.get(i);
        }
        return catarray;
    }
}
