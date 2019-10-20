package cn.adacie.gmall.user.service;

import cn.adacie.gmall.user.dao.UserDao;
import cn.adacie.gmall.user.entity.UserEntity;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author zhou_qiang
 * @date 2019/10/19
 */
public interface UserService extends IService<UserEntity> {

    /**
     * 查询所有用户
     * @param page
     * @return
     */
    IPage<UserEntity> selectAllUser(IPage<UserEntity> page);
}
