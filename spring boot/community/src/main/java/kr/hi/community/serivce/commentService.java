package kr.hi.community.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hi.community.dao.CommentDAO;

@Service
public class commentService {
	
	@Autowired
	CommentDAO commentDAO;
}
