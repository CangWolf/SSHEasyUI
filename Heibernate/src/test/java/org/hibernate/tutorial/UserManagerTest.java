package org.hibernate.tutorial;


import org.hibernate.tutorial.util.HibernateUtil;
import org.junit.Test;

/**
 * Created by Sun on 13-11-20.
 */
public class UserManagerTest {
    @Test
    public void testCreate(){

        UserManager um = new UserManager();
        um.createAndStoreUser("zhangsna", "78979");

        um.listUsers();

        HibernateUtil.getSessionFactory().close();
    }



}
