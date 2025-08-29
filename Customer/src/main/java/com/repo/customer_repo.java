package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.customer_entity;

public interface customer_repo extends JpaRepository<customer_entity,Integer> {

}
