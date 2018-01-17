package kim.yongtae.ums.dao;

import java.util.List;

import kim.yongtae.ums.domain.User;

public interface UserDao {
	List<User> getUsers();
	User getUser(int userNo);
	boolean addUser(String userName);
	boolean modifyUser(User user);
	boolean delUser(int userNo);

}
