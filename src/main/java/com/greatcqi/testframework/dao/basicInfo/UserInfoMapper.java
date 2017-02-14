package com.greatcqi.testframework.dao.basicInfo;

import com.greatcqi.testframework.model.basicInfo.UserInfoModel;
import org.springframework.stereotype.Repository;

/**
 * Created by XieChen on 2017/2/13.
 */
@Repository
public interface UserInfoMapper {
    int insert(UserInfoModel model);

    UserInfoModel getByLoginName(String loginName);

    void delete(int id);
}
