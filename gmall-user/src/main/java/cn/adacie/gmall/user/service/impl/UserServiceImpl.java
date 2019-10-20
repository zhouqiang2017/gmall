package cn.adacie.gmall.user.service.impl;

import cn.adacie.gmall.user.dao.UserDao;
import cn.adacie.gmall.user.entity.UserEntity;
import cn.adacie.gmall.user.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author zhou_qiang
 * @date 2019/10/19
 */

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {


    /**
     * 查询所有用户
     *
     * @param page
     * @return
     */
    @Override
    public IPage<UserEntity> selectAllUser(IPage<UserEntity> page) {
        return this.baseMapper.selectAllUser(page);
    }
}
