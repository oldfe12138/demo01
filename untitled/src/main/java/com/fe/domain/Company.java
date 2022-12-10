package com.fe.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_brand")
public class Company {
    public String id;
    public String brandName;
    public String companyName;
    public Integer ordered;
    public String description;
    public Integer status;
}
