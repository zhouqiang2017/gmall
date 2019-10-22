package cn.adacie.gmall.user.dao;

import cn.adacie.gmall.user.entity.UserEntity;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhou_qiang
 * @date 2019/10/19
 */
public interface UserDao extends BaseMapper<UserEntity> {
    /**
     * 查询所有用户带上收获地址（一对多示例）
     * @param
     * @return
     */
    List<UserEntity> selectallwithreceiveaddress();

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
