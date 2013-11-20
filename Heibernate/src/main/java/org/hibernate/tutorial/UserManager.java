package org.hibernate.tutorial;

import org.hibernate.tutorial.domain.User;
import org.hibernate.tutorial.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-19
 * Time: 下午10:05
 * To change this template use File | Settings | File Templates.
 */
public class UserManager {
    public static void main(String[] args) {
        UserManager um = new UserManager();
       // um.createAndStoreUser("lisi", "1231231");

       um.listUsers();

        HibernateUtil.getSessionFactory().close();
    }

    public void createAndStoreUser(String name, String password) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        User user = new User();
        user.setUsername(name);
        user.setPassword(password);

        session.save(user);
        session.getTransaction().commit();
    }

    public List listUsers() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List result = session.createQuery("from User").list();
        session.getTransaction().commit();

        if (null != result && result.size() > 0) {
            for (Object obj : result) {
                User u = (User) obj;
                System.out.println(u.getUsername() + "-------&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&----");
            }
        }

        return result;
    }
}
