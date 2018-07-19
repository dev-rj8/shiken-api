package com.devrj.shiken.db;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtil {

	public static void main( String args[] ) {  
	      
		// Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "ds131531.mlab.com" , 31531); 
	     
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("devrj", "shiken", 
	         "devrj@38".toCharArray()); 
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("shiken"); 
	      System.out.println("Credentials ::"+ credential);     
	      
	   } 
	
	public static void getQuestionPapers() {
		// Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "ds131531.mlab.com" , 31531); 
	     
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("devrj", "shiken", 
	         "devrj@38".toCharArray()); 
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("shiken");  
	      
	      // Retrieving a collection 
	      MongoCollection<Document> collection = database.getCollection("question_papers");
	      System.out.println("Collection question_papers selected successfully"); 

	      // Getting the iterable object 
	      FindIterable<Document> iterDoc = collection.find(); 
	      int i = 1; 

	      // Getting the iterator 
	      Iterator it = iterDoc.iterator(); 
	    
	      while (it.hasNext()) {  
	         System.out.println(it.next());  
	      i++; 
	      }
	}
}
