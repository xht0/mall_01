package com.cn.mall.tin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
/**
 * ClassName: MyBatisConfig
 * Description:
 * date: 2020/3/8 12:07
 *
 * @author XuHongTao
 * @since JDK 1.8
 */

@Configuration
@MapperScan("com.macro.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
