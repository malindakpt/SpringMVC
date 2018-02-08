package entityManager;

import AppConfig.HibernateUtil;
import entity.Entity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

/**
 * Created by MalindaK on 12/9/2017.
 */
public class EntityManager {
    public static void add(Entity entity){
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    /* Method to DELETE an employee from the records */
    public static void delete(Entity entity, int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
//            Student student = (Student)session.get(Entity.class, id);
//            session.delete(student);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void update(Entity entity){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(entity);
            tx.commit();

        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static Session createSession(){
        return HibernateUtil.getSessionFactory().openSession();
    }

    public static Entity getEntity(Session session, Class entity,String idCol, String id){
        List<Entity> entities;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            String hql = "FROM "+entity.getSimpleName()+" WHERE "+idCol+"= :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", Integer.parseInt(id));

            entities = query.list();

            tx.commit();

            if(entities.size()>0){
                return entities.get(0);
            }else{
                return null;
            }

        } catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
//            session.close();
        }
        return null;
    }

    public static Entity getEntity(Class entity,String idCol, String id){
        List<Entity> entities;
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "FROM "+entity.getSimpleName()+" WHERE "+idCol+"= :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", Integer.parseInt(id));

            entities = query.list();

            tx.commit();

            if(entities.size()>0){
                return entities.get(0);
            }else{
                return null;
            }

        } catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public static Entity getEntity1(Class entity,String col1, String val1){
        List<Entity> entities;// = new ArrayList<Entity>();
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "FROM "+entity.getSimpleName()+" WHERE "+col1+"= :val1";
            Query query = session.createQuery(hql);
            query.setParameter("val1", val1);
            entities = query.list();

            tx.commit();

            if(entities.size()>0){
                return entities.get(0);
            }else{
                return null;
            }

        } catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public static Entity getEntity2(Class entity,String col1, String val1, String col2, String val2){
        List<Entity> entities;// = new ArrayList<Entity>();
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "FROM "+entity.getSimpleName()+" WHERE "+col1+"= :val1 AND " +col2+"= :val2";
            Query query = session.createQuery(hql);
            query.setParameter("val1", val1);
            query.setParameter("val2", val2);
            entities = query.list();

            tx.commit();

            if(entities.size()>0){
                return entities.get(0);
            }else{
                return null;
            }

        } catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
    /* Method to  READ all the employees */
    public static List<Entity> getEntities(Class entity){
        List<Entity> entities;// = new ArrayList<Entity>();
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            entities = session.createQuery("FROM "+entity.getSimpleName()).list();

            tx.commit();
            return entities;
        } catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

}
