package com.example.basis.butterfly.service.impl;

import com.example.basis.butterfly.dao.ShiroDao;
import com.example.basis.butterfly.service.ShiroService;
import com.example.basis.common.entity.ManagerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "shiroService")
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private ShiroDao shiroDao;

    @Override
    public ManagerInfo findByUsername(String userName) {
        return shiroDao.findByUsername(userName);
    }
}
