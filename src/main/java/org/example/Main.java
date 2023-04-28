package org.example;

import org.example.config.PropertiesSessionFactoryProvider;
import org.example.config.SessionFactoryProvider;
import org.example.config.XMLSessionFactoryProvider;
import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        SessionFactoryProvider sessionFactoryProvider = new PropertiesSessionFactoryProvider();
//        SessionFactory sessionFactory = sessionFactoryProvider.getSessionFactory();

        SessionFactoryProvider sessionFactoryProviderXML = new XMLSessionFactoryProvider();
        SessionFactory sessionFactoryOnXML = sessionFactoryProviderXML.getSessionFactory();

//        for (Map.Entry<String, Object> stringObjectEntry : sessionFactory.getProperties().entrySet()) {
//            System.out.println(stringObjectEntry.getKey() + " = " + stringObjectEntry.getValue());
//        }

        // ДОБАВЛЕНИЕ
        User yura = new User(99, 987, "Yura");
//
//        try (Session session = sessionFactory.openSession()){
//            Transaction transaction = session.beginTransaction();
//            session.persist(yura);
//            transaction.commit();
//        }

        // ПОЛУЧЕНИЕ
        try (Session session = sessionFactoryOnXML.openSession()){
            User user = session.get(User.class, 1);
            System.out.println(user);
        }

        // УДАЛЕНИЕ
//        try (Session session = sessionFactory.openSession()){
//            Transaction transaction = session.beginTransaction();
//            session.remove(yura);
//            transaction.commit();
//        }


    }
}