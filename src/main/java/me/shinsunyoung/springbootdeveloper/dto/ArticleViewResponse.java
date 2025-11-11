package me.shinsunyoung.springbootdeveloper.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsunyoung.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewReponse {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createAt;

    public ArticleViewReponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createAt = article.getCreatedAt();
    }
}
