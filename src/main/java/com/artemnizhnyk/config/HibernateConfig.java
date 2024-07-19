package com.artemnizhnyk.config;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private Configuration configuration;

    private void configure() {
        configuration = new Configuration();
        configuration.configure();
        }

    public Session getSession() {
        if (configuration == null) {
            configure();
        }
        try (var sessionFactory = configuration.buildSessionFactory();
        var session = sessionFactory.openSession()){
            return session;
        }
    }
    }