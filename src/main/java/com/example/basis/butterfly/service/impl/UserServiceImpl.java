package com.example.basis.butterfly.service.impl;

import com.example.basis.butterfly.service.UserService;
import com.example.basis.butterfly.dao.UserDao;
import com.example.basis.butterfly.model.user.UserDO;
import com.example.basis.common.entity.ManagerInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;//这里会报错，但是并不会影响

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<UserDO> selectUsers(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDO> userDOs = userDao.selectUsers();
        PageInfo result = new PageInfo(userDOs);
        return result;
    }

}
