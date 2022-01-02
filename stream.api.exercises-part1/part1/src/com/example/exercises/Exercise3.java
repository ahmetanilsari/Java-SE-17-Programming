package com.example.exercises;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise3 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		final Collection<Movie> genre = movieService.findAllMovies();
		Map<String, Long> genreDirCount =
				genre.stream().map(Movie::getGenres)
							  .flatMap(Collection::stream)
							  .collect(Collectors.groupingBy(Genre::getName, Collectors.counting())
									  );
		genreDirCount.forEach(
        		(name,count) -> System.out.printf("%20s: %3d\n",name,count));
				

	}

}