package kr.hi.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import kr.hi.community.serivce.commentService;

@RestController //@ResponseBody + @Controller
public class CommentController {
	
	@Autowired
	commentService commentService;
}
