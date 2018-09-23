package com.luobo.test;


import com.luobo.dao.TokenMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*spring单元测试
1.导出springTest模块
2.@ContextConfiguration指定spring配置文件的位置
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class DaoTest {

    @Autowired
    TokenMapper tokenMapper;

    @Test
    public void Test() {
//        //创建springIOC容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        //从容器中获取mapper
//        TokenMapper t = ac.getBean(TokenMapper.class);
            System.out.println(tokenMapper);
    }
}
