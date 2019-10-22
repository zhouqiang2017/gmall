package cn.adacie.gmall.user.service.impl;

import cn.adacie.gmall.user.dao.UserDao;
import cn.adacie.gmall.user.entity.UserEntity;
import cn.adacie.gmall.user.service.UserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhou_qiang
 * @date 2019/10/19
 */

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    private UserDao userDao;

    /**
     * 查询所有用户 不带分页
     *
     * @param
     * @return
     */
    @Override
    public List<UserEntity> selectAllUserWithReceiveAddress() {
        return userDao.selectallwithreceiveaddress();
    }

    /**
     * 查询所有用户 带收货地址  加上分页
     *
     * @param page
     * @param wrapper
     * @return
     */
    @Override
    public IPage<UserEntity> selectAllUserWithReceiveAddressPagenaiton(Page page, Wrapper wrapper) {
        // 这里就在调 dao 层的定义方法了
        return this.baseMapper.selectAllUserWithReceiveAddressPagenaiton(page, wrapper);
    }

    /**
     * 查询某个用户 带收货地址
     *
     * @param uid
     * @return
     */
    @Override
    public UserEntity selectUserWithReceiveAddress(Integer uid) {
        return this.baseMapper.selectUserWithReceiveAddress(uid);
    }


}
