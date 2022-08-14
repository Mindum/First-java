package ch12.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch12.domain.userinfo.UserInfo;
import ch12.domain.userinfo.dao.UserInfoDao;
import ch12.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch12.domain.userinfo.dao.oracle.UserInfoOrackeDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		
		UserInfoDao useInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOrackeDao();
		}
		else if(dbType.equals("MYSQL	")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else {
			System.out.println("db error");
			return;
			
		}
		
		userInfoDao.
	}

}
