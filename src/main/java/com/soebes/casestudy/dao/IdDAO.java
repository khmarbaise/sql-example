/**
 * (c) 2008, 2009 T-Mobile Deutschland GmbH
 */
package com.soebes.casestudy.dao;

import java.util.List;

import com.soebes.casestudy.bo.BaseBO;

/**
 * This class will define the interface for all operations which
 * can be done on the Database. This will define the primary key
 * as a Long object.
 *
 * @author Karl Heinz Marbaise
 *
 * @param <T> The parameter type which is used.
 */
public class IdDAO<T extends BaseBO> extends HibernateDAO<T, Long> {

    public IdDAO(Class<T> c) {
        super(c);
    }

    /* (non-Javadoc)
     * @see de.tmobile.cwb.soa.dao.hibernate.HibernateDAO#get()
     */
    public List<T> get() {
        return super.get();
    }

    /* (non-Javadoc)
     * @see de.tmobile.cwb.soa.dao.hibernate.HibernateDAO#get(java.io.Serializable)
     */
    public T get(Long id) {
        return super.get(id);
    }

    /* (non-Javadoc)
     * @see de.tmobile.cwb.soa.dao.hibernate.HibernateDAO#getByExample(java.lang.Object, java.lang.String[])
     */
    public List<T> getByExample(T example, String[] excludeProperties) {
        //FIXME: Implement Exception handling
        return super.getByExample(example, excludeProperties);
    }

    /* (non-Javadoc)
     * @see de.tmobile.cwb.soa.dao.hibernate.HibernateDAO#remove(java.io.Serializable)
     */
    public void remove(Long id) {
        //FIXME: Implement Exception handling
        super.remove(id);
    }

    public void remove(T entity) {
        //FIXME: Implement Exception handling
        super.remove(entity);
    }

    /* (non-Javadoc)
     * @see de.tmobile.cwb.soa.dao.hibernate.HibernateDAO#save(de.tmobile.cwb.soa.bo.SUIParamIdBase)
     */
    public T save(T entity) {
        //FIXME: Implement Exception handling
        return super.save(entity);
    }

    /* (non-Javadoc)
     * @see de.tmobile.cwb.soa.dao.hibernate.HibernateDAO#saveWithoutTransaction(de.tmobile.cwb.soa.bo.SUIParamIdBase)
     */
    public T saveWithoutTransaction(T item) {
        return super.saveWithoutTransaction(item);
    }

}
