package com.example.basis.butterfly.dao;

import com.example.basis.butterfly.model.user.UserDO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {

    List<UserDO> selectUsers();
}
