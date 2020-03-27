/*
 * Shopping System Based on Block Chain.
 * Copyright 2016-2019 zhouxz.
 *
 */
package com.hsc;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author zhouxz
 */
@Configuration
@EntityScan(basePackages="com.hsc.entity")
@EnableJpaRepositories(basePackages= "com.hsc.repo")
@EnableTransactionManagement
public class HibernateJpaConfig {
    
}
