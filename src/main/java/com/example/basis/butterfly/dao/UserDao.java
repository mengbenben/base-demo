package com.example.basis.butterfly.dao;

import com.example.basis.butterfly.model.user.UserDO;
import com.example.basis.common.entity.ManagerInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {

    List<UserDO> selectUsers();

    ManagerInfo findByUsername(String userName);
}
