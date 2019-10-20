package cn.adacie.gmall.user.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhou_qiang
 * @date 2019/10/19
 */
@Configuration
public class MybatisPlusConfig {
    /**
    *  mybatis-plus SQL 执行效率插件『生产环境可以关掉』
    * */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }


    /* *
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor () {
        return new PaginationInterceptor();
    }

}
