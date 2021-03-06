package cn.name168.anonym.blog.service.mapper;


import cn.name168.anonym.blog.bean.entity.SysMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 菜单管理 Mapper 接口
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Repository
public interface SysMenuMapper {
    /**
     * 根据用户id查询菜单
     * @param userId
     * @return
     */
     List<SysMenu> selectByUserId(Long userId);

    /**
     * 查询所有资源
     * @return
     */
    List<SysMenu> selectAll();
}
