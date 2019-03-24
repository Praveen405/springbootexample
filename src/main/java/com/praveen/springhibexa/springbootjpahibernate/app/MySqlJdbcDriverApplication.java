package com.praveen.springhibexa.springbootjpahibernate.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.praveen.springhibexa.springbootjpahibernate.dao.SystemRepository;
@SpringBootApplication
@EnableJpaRepositories("com.praveen.springhibexa.springbootjpahibernate.dao")
@EntityScan("com.praveen.springhibexa.springbootjpahibernate.model")
public class MySqlJdbcDriverApplication implements CommandLineRunner {

	 @Autowired
	    DataSource dataSource;
	 
	    @Autowired
	    SystemRepository systemRepository;
	    public static void main(String[] args) {
	        SpringApplication.run(MySqlJdbcDriverApplication.class, args);
	    }
	    
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  System.out.println("Our DataSource is = " + dataSource);
	        Iterable<com.praveen.springhibexa.springbootjpahibernate.model.System> systemlist = systemRepository.findAll();
	        for(com.praveen.springhibexa.springbootjpahibernate.model.System systemmodel:systemlist){
	            System.out.println("Here is a system: " + systemmodel.toString());
		
	}
	}
}
