package com.artfactory.project01.todayart.repository;

import com.artfactory.project01.todayart.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {

    //게시판 아이디가 ?인게시물만 가져오기기
   @Query(value = "SELECT * FROM article WHERE board_id = ?1 AND is_deleted = 0 ORDER BY write_dated DESC ", nativeQuery = true)
   Page<Article> findByBoard_id(Integer boardId , Pageable pageable);

   @Query(value = "SELECT * FROM article WHERE board_id = ?2 AND is_deleted = 0 AND ?3 LIKE %?1% ORDER BY write_dated DESC", nativeQuery = true)
   Page<Article> findByTitleAndBoardId(String value, Integer boardId , String where, Pageable pageable);

//    @Query(value = "SELECT * FROM article WHERE board_id = ?2 AND is_deleted = 0 AND content LIKE %?1% ORDER BY write_dated DESC ", nativeQuery = true)
//    Page<Article> findByContentAndBoardId(String content, Integer boardId , Pageable pageable);

}
