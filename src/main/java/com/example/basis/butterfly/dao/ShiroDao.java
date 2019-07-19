package com.example.basis.butterfly.dao;

import com.example.basis.common.entity.ManagerInfo;
import org.springframework.stereotype.Component;

@Component
public interface ShiroDao {

    ManagerInfo findByUsername(String username);
}
