package com.cn.mall.tin.service;
import com.cn.mall.tin.mbg.model.PmsBrand;

import java.util.List;
/**
 * ClassName: PmsBrandService
 * Description:
 * date: 2020/3/8 12:45
 *
 * @author XuHongTao
 * @since JDK 1.8
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
