package com.site.blog.my.core.dao;

import com.site.blog.my.core.entity.BlogCategory;
import com.site.blog.my.core.util.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface BlogCategoryMapper {

    List<BlogCategory> findCategoryList(PageQueryUtil pageQueryUtil);

    int getTotalCategories(PageQueryUtil pageUtil);

    int deleteByPrimaryKey(Integer categoryId);
    int insert(BlogCategory record);
    int insertSelective(BlogCategory record);
    BlogCategory selectByPrimaryKey(Integer categoryId);
    BlogCategory selectByCategoryName(String categoryName);
    int updateByPrimaryKeySelective(BlogCategory record);
    int updateByPrimaryKey(BlogCategory record);
    List<BlogCategory> selectByCategoryIds(@Param("categoryIds") List<Integer> categoryIds);
    int deleteBatch(Integer[] ids);
}
