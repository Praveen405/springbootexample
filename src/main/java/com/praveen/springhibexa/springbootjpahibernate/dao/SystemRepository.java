package com.praveen.springhibexa.springbootjpahibernate.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.praveen.springhibexa.springbootjpahibernate.model.System;

@Repository
public interface SystemRepository extends CrudRepository<System,Long> {

}
