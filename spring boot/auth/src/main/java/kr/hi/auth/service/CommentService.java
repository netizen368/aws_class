package kr.hi.auth.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import kr.hi.auth.dao.CommentDAO;
import kr.hi.auth.domain.CommentVO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CommentService {

    private final CommentDAO commentDAO;

    public Map<String, Object> getComments(int poNum, int page) {

        int size = 10;
        int offset = (page - 1) * size;

        List<CommentVO> list = commentDAO.selectComments(poNum, offset, size);
        int totalCount = commentDAO.countComments(poNum);

        Map<String, Object> result = new HashMap<>();
        result.put("list", list);
        result.put("totalCount", totalCount);

        return result;
    }
}


