package com.example.postingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postingapp.entity.Post;
import com.example.postingapp.entity.User;

public interface PostRepository extends JpaRepository<Post, Integer> {
	//引数に指定したユーザーに紐づく投稿を作成日時が新しい順に取得します（降順）
    public List<Post> findByUserOrderByCreatedAtDesc(User user);
    //引数に指定したユーザーに紐づく投稿を作成日時が古い順に取得します（昇順）
    public List<Post> findByUserOrderByCreatedAtAsc(User user);
    //更新順に取得
    List<Post> findAllByOrderByUpdatedAtAsc();
    
    
    public Post findFirstByOrderByIdDesc();
}