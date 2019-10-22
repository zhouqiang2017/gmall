package cn.adacie.gmall.user.controller;

import cn.adacie.gmall.user.dao.UserDao;
import cn.adacie.gmall.user.entity.UserEntity;
import cn.adacie.gmall.user.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * @author zhou_qiang
 * @date 2019/10/19
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    /**
     * 分页用户数据(带条件)
     */
    @GetMapping("/list")
    public IPage<UserEntity> list() {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.like("username", "lion").eq("gender", 2);
        Page<UserEntity> page = new Page<>(1, 2);
        return userDao.selectPage(page, wrapper);
    }

    /*
     * 根据id查询用户
     *  @id 用户id
     */
    @GetMapping("/{id}")
    public UserEntity getUser(@PathVariable String id) {
        UserEntity userEntity = userDao.selectById(id);
        return userEntity;
    }

    /*
     * 添加用户信息
     */
    @PostMapping("")
    public Integer storeUser(UserEntity userEntity) {
        return userDao.insert(userEntity);
    }

    /**
     * 修改用户信息
     */
    @PutMapping("")
    public Integer updateUser(UserEntity userEntity) {
        return userDao.updateById(userEntity);
    }

    /**
     * 删除用户信息
     */
    @DeleteMapping("")
    public int removeUser(String id) {
        return userDao.deleteById(id);
    }

    /*
     *  查询用户 带上收货地址 不加分页  （测试 一对多）
     * */
    @GetMapping("/with")
    public List<UserEntity> getUserWithReceiveAddress() {

        return userDao.selectallwithreceiveaddress();
    }

    /*
     *  查询用户 with收货地址 加上分页 （测试 一对多加分页）
     * */
    @GetMapping("/withPage")
    public IPage<UserEntity> getUserWithReceiveAddressPage() {
        QueryWrapper<Map<String, Object>> queryWrapper = new QueryWrapper<>();
        Page<UserEntity> page = new Page<>(1, 3);
        IPage<UserEntity> userEntityIPage = userService.selectAllUserWithReceiveAddressPagenaiton(page, queryWrapper);
        return userEntityIPage;
    }

    /*
     *  根据ID查询用户 with收货地址
     * */
    @GetMapping("/oneWith/{id}")
    public UserEntity getUserWithRecevieAddressById(@PathVariable Integer id){
        return userService.selectUserWithReceiveAddress(id);
    }

}
