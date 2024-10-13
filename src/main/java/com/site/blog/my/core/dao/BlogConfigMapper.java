package com.site.blog.my.core.dao;

import com.site.blog.my.core.entity.BlogConfig;

import java.util.List;

/*
系统设置相关
 */
public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}
