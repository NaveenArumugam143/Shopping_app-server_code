package Guna.movies.DBConnection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBConnectionService {
	
	@Autowired
	private DBConnectionInterface DBConnectRepo;
	

	public List<DBConnectionPojo> getData() {
		return DBConnectRepo.findAll();
	}
	
}
