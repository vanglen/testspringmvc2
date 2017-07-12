package blog.services.impl;

import blog.mapper.TUserMapper;
import blog.pojo.TUser;
import blog.pojo.TUserExample;
import blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
@Repository
public class UserServiceImpl implements UserService {

    private TUserMapper tUserMapper;

    @Autowired
    public UserServiceImpl(TUserMapper tUserMapper) {
        this.tUserMapper = tUserMapper;
    }

    public TUser getById(int id) {
        TUserExample example = new TUserExample();
        example.or().andIdGreaterThan(0);
        List<TUser> result = tUserMapper.selectByExample(example);
        return result.get(0);
    }
}
