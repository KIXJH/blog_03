package com.site.blog.my.core.service;

import com.site.blog.my.core.entity.BlogCategory;
import com.site.blog.my.core.util.PageQueryUtil;
import com.site.blog.my.core.util.PageResult;

import java.util.List;

public interface CategoryService {
    PageResult getBlogCategoryPage(PageQueryUtil pageQueryUtil);

    int getTotalCategories();
    Boolean saveCategory(String categoryName, String categoryIcon);
    Boolean updateCategory(Integer categroyId, String categoryName, String categoryIcon);
    Boolean deleteBatch(Integer[] ids);
    List<BlogCategory> getAllCategories();
}
