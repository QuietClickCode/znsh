package com.zjj.model;

/**
 * @program: znsh
 * @description: 文章
 * @author: zjj
 * @create: 2019-05-06 01:20:06
 **/
public class Article {

    public String title;

    public String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
