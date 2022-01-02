package com.example.exercises;

import java.util.List;

import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise7 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the list of movies having the genres "Drama" and "Comedy" only
		var listOfGenreName = List.of("Drama","Comedy");
		var listOfGenre = listOfGenreName.stream().map(movieService::findGenreByName).toList();
		var moviesDramaAndComedy =
		movieService.findAllMovies()
					.stream().filter(movie -> movie.getGenres().size()==2)
					.filter(movie -> movie.getGenres().contains(listOfGenre))
					.toList();
		moviesDramaAndComedy.forEach(movie->System.out.printf("%s %s\n",movie,movie.getGenres()));
	}

}
