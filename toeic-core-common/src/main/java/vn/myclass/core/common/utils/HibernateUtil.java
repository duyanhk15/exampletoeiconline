package vn.myclass.core.common.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        try {
            //  create sessionfactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch(Throwable e)
        {
            System.err.println("Initial session factory fail" +e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
