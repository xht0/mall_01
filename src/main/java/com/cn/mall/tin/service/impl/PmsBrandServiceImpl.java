package com.cn.mall.tin.service.impl;

import com.cn.mall.tin.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import com.cn.mall.tin.mbg.mapper.PmsBrandMapper;
import com.cn.mall.tin.mbg.model.PmsBrand;
import com.cn.mall.tin.mbg.model.PmsBrandExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * ClassName: PmsBrandServiceImpl
 * Description:
 * date: 2020/3/8 12:45
 *
 * @author XuHongTao
 * @since JDK 1.8
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
