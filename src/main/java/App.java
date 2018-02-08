
import entityManager.EntityManager;

/**
 * Created by MalindaK on 12/9/2017.
 */
public class App {
    public static void main( String[] args )
    {
//        listEmployees();
//        addStock();
//        delete(1);
//
//        Student student = new Student();
//        student.setFirstName("Malinda");
//        student.setLastName("Kumarasinghe");
//        EntityManager.add(student);
//
//
//
//        student.setFatherMobile("Premasiri");
//        EntityManager.update(student);
//
//
//        EntityManager.getEntities(Student.class);
    }

    public static void addStock(){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        session.beginTransaction();
//        Stock stock = new Stock();
//
//        stock.setStockCode("22");
//        stock.setStockName("Wasdasd");
//
//        for (Field field : stock.getClass().getDeclaredFields()) {
//            field.setAccessible(true); // You might want to set modifier to public first.
//            Object value = null;
//            try {
//                value = field.get(stock);
//                if (value != null) {
//                    System.out.println(field.getName() + "=" + value);
//                }
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//
//        }
//        session.save(stock);
//        session.getTransaction().commit();
    }

    /* Method to DELETE an employee from the records */
    public static void delete(Integer stockID){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            Stock stock = (Stock)session.get(Stock.class, stockID);
//            session.delete(stock);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
    }

    public static void updateEmployee(int id, String name ){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            Stock stock = (Stock)session.get(Stock.class, id);
//            stock.setStockName( name );
//            session.update(stock);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
    }

    /* Method to  READ all the employees */
    public static void listEmployees(){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            List employees = session.createQuery("FROM Stock ").list();
//            for (Iterator iterator = employees.iterator(); iterator.hasNext();){
//                Stock stock = (Stock) iterator.next();
//
//                System.out.print("First Name: " + stock.getStockCode());
//                System.out.print("  Last Name: " + stock.getStockName());
//                System.out.println("----------");
//            }
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
    }

}
