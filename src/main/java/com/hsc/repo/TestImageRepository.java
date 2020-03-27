/*
 * Shopping System Based on Block Chain.
 * Copyright 2018 zhouxz.
 */
package com.hsc.repo;

import com.hsc.entity.TestImage;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestImageRepository extends JpaRepository<TestImage, Long>, JpaSpecificationExecutor<TestImage> {
     //@Query(value = "select * from user u where u.user_name = :name", nativeQuery = true)
    //@Query(value = "from User u where u.userName like %:name")
    @Query(value = "from TestImage t where t.name like %:name")
    List<TestImage> findByName(@Param("name") String name);
}
