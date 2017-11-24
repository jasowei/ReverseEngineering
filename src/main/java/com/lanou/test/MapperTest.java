package com.lanou.test;

import com.lanou.domain.User;
import com.lanou.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dllo on 17/11/7.
 */
public class MapperTest {

    private SqlSession session;
    private SqlSessionFactory sessionFactory;
    private UserMapper mapper;

    @Before
    public void init() throws IOException {
        InputStream inputStream =
                Resources.getResourceAsStream("mybatis-config.xml");
        sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sessionFactory.openSession(true);
        mapper = session.getMapper(UserMapper.class);

    }
    @After
    public void close(){
        session.close();
    }

    @Test
    public void test1(){
        User user = mapper.selectByPrimaryKey(11);
        System.out.println(user);
    }


}
