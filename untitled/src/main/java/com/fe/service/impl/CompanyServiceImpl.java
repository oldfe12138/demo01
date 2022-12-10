package com.fe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fe.domain.Company;
import com.fe.mapper.CompanyDao;
import com.fe.service.CompanyService;
import org.springframework.stereotype.Service;


@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyDao, Company> implements CompanyService{
}
