package cn.adacie.gmall.user.service.impl;

import cn.adacie.gmall.user.dao.UserReceiveAddressDao;
import cn.adacie.gmall.user.entity.UserReceiveAddress;
import cn.adacie.gmall.user.service.UserReceiveAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhou_qiang
 * @date 2019/10/21
 */
@Service
@Transactional
public class UserReceiveAddressServiceImpl extends ServiceImpl<UserReceiveAddressDao, UserReceiveAddress> implements UserReceiveAddressService {
}
