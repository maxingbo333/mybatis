package cn.itcast.mybatis.first;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.itcast.mybatis.po.User;

/**
 * 
 * <p>
 * Title: MybatisFirst
 * </p>
 * <p>
 * Description: 入门程序
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2015-4-22上午10:28:44
 * @version 1.0
 */
public class MybatisFirst {

	// 根据id查询用户信息，得到一条记录结果
	@Test
	public void findUserByIdTest() throws IOException {



		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
qqqqqqq

	}

	// 添加用户信息
	@Test
	public void insertUserTest() throws IOException {
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
		

	}

	// 根据id删除 用户信息
	@Test
	public void deleteUserTest() throws IOException {
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);

		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 传入id删除 用户
		sqlSession.delete("test.deleteUser", 39);

		// 提交事务
		sqlSession.commit();

		// 关闭会话
		sqlSession.close();

	}

	// 更新用户信息
	@Test
	public void updateUserTest() throws IOException {
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);

		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 更新用户信息
		
		User user = new User();
		//必须设置id
		user.setId(41);
		user.setUsername("王大军");
		user.setBirthday(new Date());
		user.setSex("2");
		user.setAddress("河南郑州");

		sqlSession.update("test.updateUser", user);
		
		// 提交事务
		sqlSession.commit();

		// 关闭会话
		sqlSession.close();

	}

}
