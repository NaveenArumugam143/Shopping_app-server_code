package Guna.movies.DBConnection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Document(collection = "restaurents")
@Data
public class DBConnectionPojo {
	
	    @Id
	    private String id;
	    
	    private String name;
	    
	    private String cuisine;
}
