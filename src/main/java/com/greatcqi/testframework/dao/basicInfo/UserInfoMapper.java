package com.greatcqi.testframework.dao.basicInfo;

import com.greatcqi.testframework.model.basicInfo.UserInfoModel;
import org.springframework.stereotype.Repository;

/**
 * User information mapper.
 * Created on 2017/2/13.
 * @author XieChen
 * @version 1.0
 */
@Repository
public interface UserInfoMapper {
    int insert(UserInfoModel model);

    UserInfoModel getByLoginName(String loginName);

    void delete(int id);
}
