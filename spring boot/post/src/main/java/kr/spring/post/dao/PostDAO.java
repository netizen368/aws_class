package kr.spring.post.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.spring.post.model.vo.PostVO;

public interface PostDAO {

	List<PostVO> selectPosts();

	PostVO selectPost(@Param("num")int num);

	boolean insertPost(@Param("post")PostVO post);



}
