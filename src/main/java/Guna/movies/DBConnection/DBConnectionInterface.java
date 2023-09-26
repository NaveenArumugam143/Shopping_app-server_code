package Guna.movies.DBConnection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBConnectionInterface extends  MongoRepository<DBConnectionPojo, String> {
	
}
