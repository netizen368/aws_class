package kr.hi.auth.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.hi.auth.service.CommentService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v2/posts/{poNum}/comments")
@AllArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getComments(
            @PathVariable int poNum,
            @RequestParam(defaultValue = "1") int page) {

        Map<String, Object> result = commentService.getComments(poNum, page);

        return ResponseEntity.ok(result);
    }
}



