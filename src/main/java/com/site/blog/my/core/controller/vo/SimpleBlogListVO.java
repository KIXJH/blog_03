package com.site.blog.my.core.controller.vo;

import java.io.Serializable;

public class SimpleBlogListVO implements Serializable {
    private Long blogId;

    private String blogTitLe;

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitLe;
    }

    public void setBlogTitle(String blogTitLe) {
        this.blogTitLe = blogTitLe;
    }
}
