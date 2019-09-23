package com.example.springdatajpaspecification.repository;

import com.example.springdatajpaspecification.bean.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClazzRepository extends JpaRepository<Clazz, Integer>, JpaSpecificationExecutor<Clazz> {
}
