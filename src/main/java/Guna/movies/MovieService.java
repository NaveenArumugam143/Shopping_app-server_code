package Guna.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
    
    public String postData() {
    	return "Data Added";
    }
    public String deleteData() {
    	movieRepository.deleteById("650b2fe03ae0ee1085fec36f");
    	return "Data Delted";
    }
}
