package com.nisanth.springboot.service;

import com.nisanth.springboot.dto.CommentDto;

import java.util.List;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);

    List<CommentDto> findAllComments();

    void deleteComment(Long commentId);

    List<CommentDto> findCommentsByPost();
}