package com.greatcqi.testframework.serviceImpl.basicInfo;

import com.greatcqi.testframework.dao.basicInfo.UserInfoMapper;
import com.greatcqi.testframework.model.basicInfo.UserInfoModel;
import com.greatcqi.testframework.service.basicInfo.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of UserInfoService.
 * Created on 2017/2/12.
 * @author XieChen
 * @version 1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public void registerUser(UserInfoModel userInfoModel) {
        userInfoMapper.insert(userInfoModel);
    }

    public UserInfoModel getByLoginName(String loginName) {
        return userInfoMapper.getByLoginName(loginName);
    }

    public void delete(int id) {
        userInfoMapper.delete(id);
    }
}
