package com.example.basis.butterfly.service;

import com.example.basis.butterfly.model.user.UserDO;
import com.example.basis.common.entity.ManagerInfo;
import com.github.pagehelper.PageInfo;

public interface UserService {

    PageInfo<UserDO> selectUsers(int pageNum, int pageSize);

}
