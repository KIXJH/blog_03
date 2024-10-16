package com.site.blog.my.core.service;

import com.site.blog.my.core.entity.BlogComment;
import com.site.blog.my.core.util.PageQueryUtil;
import com.site.blog.my.core.util.PageResult;

public interface CommentService {
    Boolean addComment(BlogComment blogComment);

    PageResult getCommentsPage(PageQueryUtil pageUtil);

    int getTotalComments();

    Boolean checkDone(Integer[] ids);

    Boolean deleteBatch(Integer[] ids);

    Boolean reply(Long commentId, String  replyBody);

    PageResult getCommentPageByBlogIdAndPageNum(Long blogId,int page);
}
