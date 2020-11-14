package com.github.binarylei.mybatis.dynamic;

import com.gitbub.binarylei.model.User;
import com.github.binarylei.mybatis.dynamic.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author binarylei
 * @version 2020-11-14
 */

public class DynamicDataSourceTest extends SpringBootTestFramework {

    @Autowired
    private UserService userService;

    @Test
    public void testDynamicDataSource() {
        List<User> users1 = userService.user1();
        Assert.assertEquals(1, users1.size());
        Assert.assertEquals("binarylei1", users1.get(0).getName());

        List<User> users2 = userService.user2();
        Assert.assertEquals(1, users2.size());
        Assert.assertEquals("binarylei2", users2.get(0).getName());
    }

}
