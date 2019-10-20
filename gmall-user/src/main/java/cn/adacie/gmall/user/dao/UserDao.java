package cn.adacie.gmall.user.dao;

import cn.adacie.gmall.user.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author zhou_qiang
 * @date 2019/10/19
 */
public interface UserDao extends BaseMapper<UserEntity> {
    /**
     * 查询所有用户
     * @param page
     * @return
     */
    IPage<UserEntity> selectAllUser(IPage<UserEntity> page);

}
