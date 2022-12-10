package com.fe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fe.domain.Company;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyDao extends BaseMapper<Company>{
}
