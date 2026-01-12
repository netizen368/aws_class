package kr.hi.community.dao;

import org.apache.ibatis.annotations.Param;

import kr.hi.community.model.dto.CommentDTO;

public interface CommentDAO {

	void insertCommnet(@Param("coDto")CommentDTO dto);

}
