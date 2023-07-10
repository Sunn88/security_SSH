//230621 05
package com.study.security_SSH.service.auth;

import com.study.security_SSH.web.dto.auth.UsernameCheckReqDto;

public interface AuthService {
	public boolean checkUsername(UsernameCheckReqDto usernameCheckReqDto) throws Exception;
	public boolean signup() throws Exception;

}
