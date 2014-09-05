package com.att.mongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Small MongoDB application that uses spring data to interact with MongoDB.
 * 
 * 
 */
public class MongoDBApp {

    static final Logger logger = LoggerFactory.getLogger(MongoDBApp.class);

    public static void main( String[] args ) {
		logger.info("Bootstrapping MongoDemo application");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

               
        DEDBeanRepository dedRepository = context.getBean(DEDBeanRepository.class);

              
        
        //cleanup dedbean collection before insertion
        dedRepository.dropDEDCollection();
        
        //create dedbean collection
        dedRepository.createDEDCollection();
        
        
        //insert to dedbean collection
        dedRepository.insertDED();
        
      
        
        
        

        logger.info("Finished writing to the mongodb");
	}
}
