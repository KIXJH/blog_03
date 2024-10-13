package com.site.blog.my.core.service;

import com.site.blog.my.core.controller.vo.BlogDetailVO;
import com.site.blog.my.core.controller.vo.SimpleBlogListVO;
import com.site.blog.my.core.entity.Blog;
import com.site.blog.my.core.util.PageQueryUtil;
import com.site.blog.my.core.util.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BlogService {
    String saveBlog(Blog blog);
    PageResult getBlogsPage(PageQueryUtil pageUtil);
    Boolean deleteBatch(Integer[] ids);
    int getTotalBlogs();
    Blog getBlogById(Long blogId);
    String updateBlog(Blog blog);
    PageResult getBlogsForIndexPage(int page);

    List<SimpleBlogListVO> getBlogListForIndexPage(int type);

    BlogDetailVO getBlogDetail(Long blogId);

//    Object getBlogListForIndexPage(Integer type);

    PageResult getBlogsPageByTag(String tagName, int page);

    PageResult getBlogsPageByCategory(String categoryName, int page);

    PageResult getBlogsPageBySearch(String keyword, int page);

    BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}
