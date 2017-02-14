package com.greatcqi.testframework.service.basicInfo;

import com.greatcqi.testframework.model.basicInfo.UserInfoModel;

/**
 * Created by XieChen on 2017/2/12.
 */
public interface UserInfoService {
    void registerUser(UserInfoModel userInfoModel);

    UserInfoModel getByLoginName(String loginName);

    void delete(int id);
}
