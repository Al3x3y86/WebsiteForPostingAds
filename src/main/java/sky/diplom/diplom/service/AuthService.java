package sky.diplom.diplom.service;

import sky.diplom.diplom.dto.RegisterReqDto;

/**
 * Service for user registration and login
 */
public interface AuthService {

    /**
     * @param userName Login (email)
     * @param password Password
     */
    boolean login(String userName, String password);

    /**
     * @param registerReqDto User req
     */
    boolean register(RegisterReqDto registerReqDto);
}
