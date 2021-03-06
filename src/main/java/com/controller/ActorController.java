package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.Actor;
import com.model.AppearedIn;
import com.model.Movie;
import com.service.ActorService;
import util.Constants.ActorErrors;

@Controller
@SessionAttributes("Actor")
public class ActorController {
		@Autowired
		private ActorService actorService;
		
		// Get a list of all Actors
		@RequestMapping(value="actor/all", method = RequestMethod.GET)
		 public @ResponseBody List<Actor> getAllActors() {
			List<Actor> actors = actorService.selectAll();
			return actors;
		}
		
		 // Get all the actor that appeared in a movie 
		@RequestMapping(value="actor/appeared/{movieId}", method = RequestMethod.GET)
		 public @ResponseBody List<Actor> actorsAppeared(@PathVariable("movieId") Integer movieId ){
			List<Actor> actors = actorService.actorsAppeared(movieId); 
			return actors;

		} 
		@RequestMapping(value="actor/{actorId}", method = RequestMethod.GET)
		 public @ResponseBody Actor actorById(@PathVariable("actorId") Integer actorId ){
			Actor actor = actorService.getActorById(actorId);
			return actor;

		} 
		@RequestMapping(value="actor/add", method = RequestMethod.POST)
		 public @ResponseBody int addActor(@RequestBody Actor newActor) {
				
			return actorService.insertActor(newActor);
			
		}
		@RequestMapping(value="actor/addAppearance", method = RequestMethod.POST)
		 public @ResponseBody List<Actor> addAppearance(@RequestBody AppearedIn appearance) {
			
			return actorService.addAppearance(appearance);
			
		}
		
		@RequestMapping(value="actor/addMultipleAppearances", method = RequestMethod.POST)
		 public @ResponseBody int addMultipleAppearance(@RequestBody List<AppearedIn> appearances) {
			
			return actorService.addAllAppearances(appearances);
			
		}
		
		@RequestMapping(value="actor/removeAppearance", method = RequestMethod.POST)
		 public @ResponseBody List<Actor> removeAppearance(@RequestBody AppearedIn appearance) {
			
			return actorService.removeAppearance(appearance);
			
		}
}
