package ch12.domain.userinfo.dao.mysql;

import ch12.domain.userinfo.UserInfo;
import ch12.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert info MySql DB userId = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update info MySql DB userId = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from info MySql DB userId = " + userInfo.getUserId());
	}

}
