package com.greatcqi.testframework.service.basicInfo;

import com.greatcqi.testframework.model.basicInfo.UserInfoModel;

/**
 * User information service interface.
 * Created on 2017/2/12.
 * @author XieChen
 * @version 1.0
 */
public interface UserInfoService {
    void registerUser(UserInfoModel userInfoModel);

    UserInfoModel getByLoginName(String loginName);

    void delete(int id);
}
