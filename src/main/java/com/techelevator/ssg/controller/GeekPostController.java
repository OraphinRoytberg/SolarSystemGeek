package com.techelevator.ssg.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class GeekPostController {

	private ForumDao forumDao;

    @Autowired
    public void ForumController(ForumDao forumDao) {
        this.forumDao = forumDao;
    }
	
	@RequestMapping(path="/geekPostInput", method=RequestMethod.GET)
	public String showGeekPostInput() {
		return "geekPostInput";
	}
	
	@RequestMapping(path="/geekPostInput", method=RequestMethod.POST)
	public String processGeekPostSubmission(@RequestParam String username, @RequestParam String subject, @RequestParam String message) {
		ForumPost newPost = new ForumPost();
		newPost.setUsername(username);
		newPost.setSubject(subject);
		newPost.setMessage(message);
		newPost.setDatePosted(LocalDateTime.now());
		
		forumDao.save(newPost);
		
		return "redirect:/geekPostResult";
	}

	@RequestMapping(path="/geekPostResult", method=RequestMethod.GET)
	public String showGeekPostResult(HttpServletRequest request) {
		
		List<ForumPost> allPosts = forumDao.getAllPosts();
		
		
		request.setAttribute("allPosts", allPosts);
		
		return "geekPostResult";
	}
	
}
