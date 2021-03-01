
package com.web.dao;

import java.util.List;

public interface AuthDao {

	ProfileEntity findByUsernamePass(String username, String password);
	void saveProfile(ProfileEntity entity);
	List<ProfileEntity> findAll();
	void deleteByUsername(String username);
	ProfileEntity findByEmail(String email);
	void updateProfile(ProfileEntity entity);

}
