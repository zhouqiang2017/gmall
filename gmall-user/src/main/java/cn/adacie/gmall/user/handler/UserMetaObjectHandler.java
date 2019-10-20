package cn.adacie.gmall.user.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * 用户表插入数据自动填充数据 （create_time）
 *  需要在实体类属性加入注解->@TableField(fill = FieldFill.INSERT)
 * @author zhou_qiang
 * @date 2019/10/20
 */
@Component
public class UserMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        Object createTime = getFieldValByName("createTime", metaObject);
        if(null == createTime) {
            setFieldValByName("createTime", new Date(), metaObject);
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
