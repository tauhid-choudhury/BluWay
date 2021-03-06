package com.mappers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.model.Movie;

public interface MovieMapper {

	  public List<Movie> selectAll();
	  public Movie selectById(@Param("id")Integer id);
	  public Movie selectByName(@Param("name")String name);
	  public List<Movie> selectMoviesHistoryByCustomerId(@Param("customerId")Integer customerId);
	  
	  
	  public void updateByPrimaryKey(@Param("movie")Movie movie);
	  
	  public int insertMovie(@Param("movie") Movie movie);
	  
	  public int addToQueue(@Param("movie") Movie movie);
	  
	  public int deleteFromQueue(@Param("movie") Movie movie);
	  public int deleteFromShoppingCart(@Param("movie") Movie movie);
	  
	  public int addToCart(@Param("movie") Movie movie);
	  
	  public List<Movie> selectMoviesByType(@Param("type") String type);
	  public List<Integer> selectHomeScreenMovies();
	  public List<Movie> selectMovieQueue(@Param("id") Integer id);
	  public List<Movie> selectShoppingCart(@Param("id") Integer id);
	  public List<String> selectUserFavoriteGenres(@Param("accountId") Integer accountId);
	  public List<String> selectSystemFavoriteGenres();
	  public List<Movie> selectPersonalizedList(@Param("customerId")Integer customerId);
	  public List<Movie> actorAppearedIn(@Param("actorId")Integer actorId);
	  public List<Movie> selectBestSellers();
	  public Integer selectGenreRevenue(@Param("genre")String genre, @Param("asOfDate")Date asOfDate);
	  public Integer selectGenreTotal(@Param("genre")String genre);
	  
}
