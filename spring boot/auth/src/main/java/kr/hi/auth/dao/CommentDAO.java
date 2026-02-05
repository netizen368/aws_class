package kr.hi.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.hi.auth.domain.CommentVO;

public interface CommentDAO {

    List<CommentVO> selectComments(
            @Param("poNum") int poNum,
            @Param("offset") int offset,
            @Param("size") int size
    );

    int countComments(@Param("poNum") int poNum);
}