package com.greatfarmer.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatfarmer.blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer>{

}
