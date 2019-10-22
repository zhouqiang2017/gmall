package cn.adacie.gmall.user.controller;

import cn.adacie.gmall.user.dao.UserReceiveAddressDao;
import cn.adacie.gmall.user.entity.UserReceiveAddress;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhou_qiang
 * @date 2019/10/20
 */
@RestController
@RequestMapping("/receiveAddress")
public class UserReceiveAddressController {

    @Autowired
    private UserReceiveAddressDao userReceiveAddressDao;

    @GetMapping("")
    public IPage<UserReceiveAddress> list() {
        QueryWrapper<UserReceiveAddress> wrapper = new QueryWrapper<>();
        wrapper.like("name", "大梨").eq("province", "广东省");
        Page<UserReceiveAddress> page = new Page<>(1, 5);
        return userReceiveAddressDao.selectPage(page, wrapper);
    }

    @GetMapping("/{id}")
    public UserReceiveAddress show(@PathVariable String id) {
        return userReceiveAddressDao.selectById(id);
    }

    @PostMapping("")
    public UserReceiveAddress store(UserReceiveAddress userReceiveAddress) {
        // mapper 层的insert方法 会回写id到实例对象中
        userReceiveAddressDao.insert(userReceiveAddress);
        return userReceiveAddress;
    }

    @PutMapping("")
    public UserReceiveAddress update(UserReceiveAddress userReceiveAddress){

        // mapper 层的update方法 会回写修改的信息到实例对象中
        userReceiveAddressDao.updateById(userReceiveAddress);
        return userReceiveAddress;
    }

    @DeleteMapping("")
    public int destroy(String id){

        return userReceiveAddressDao.deleteById(id);
    }

}
