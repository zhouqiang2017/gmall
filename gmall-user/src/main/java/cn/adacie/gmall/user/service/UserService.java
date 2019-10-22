package cn.adacie.gmall.user.service;

import cn.adacie.gmall.user.dao.UserDao;
import cn.adacie.gmall.user.entity.UserEntity;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhou_qiang
 * @date 2019/10/19
 */
public interface UserService extends IService<UserEntity> {

    /**
     * 查询所有用户 带收货地址  不加分页
     * @param
     * @return
     */
    List<UserEntity> selectAllUserWithReceiveAddress();

    /**
     * 查询所有用户 带收货地址  加上分页
     * @param page
     * @param wrapper
     * @return
     */
    IPage<UserEntity> selectAllUserWithReceiveAddressPagenaiton(Page page, @Param(Constants.WRAPPER) Wrapper wrapper);


    /**
     * 查询某个用户 带收货地址
     * @param uid
     * @return
     */
    UserEntity selectUserWithReceiveAddress(Integer uid);

}
