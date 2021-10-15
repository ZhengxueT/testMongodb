package testmongo.testmongo;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class testMongo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uri = "mongodb://127.0.0.1:27017";
	    try (MongoClient mongoClient = MongoClients.create(uri)) {
	        MongoDatabase database = mongoClient.getDatabase("aaa");
	        MongoCollection<Document> collection = database.getCollection("aaa");
	        Document doc = collection.find().first();
	        System.out.println(doc.toJson());
	    }
	}
}