package com.artemnizhnyk.tasklistjakarta.repository.impl;

import com.artemnizhnyk.config.HibernateConfig;
import com.artemnizhnyk.tasklistjakarta.domain.model.Task;
import com.artemnizhnyk.tasklistjakarta.domain.model.User;
import com.artemnizhnyk.tasklistjakarta.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;
//    private final HibernateConfig hibernateConfig = new HibernateConfig();

    @Override
    public User getUserById(Long id) {
//        Configuration configuration = new Configuration();
//        configuration.configure();
//        configuration.addAnnotatedClass(User.class);
//        configuration.addAnnotatedClass(Task.class);
//        Session session;
//        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
//            session = sessionFactory.openSession();
//            session.beginTransaction();
//            User user = session.get(User.class, id);
//            session.getTransaction().commit();
//            return user;
//        }
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, 1);
        entityManager.getTransaction().commit();
        return user;
    }
}
