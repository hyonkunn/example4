package com.example.example4.service;

import com.example.example4.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String registerUser(UserDto userDto) {
        // 고정값 확인
        if ("test".equals(userDto.getUsername()) && "1234".equals(userDto.getPassword())) {
            return "회원가입 성공!";
        }
        return "회원가입 실패";
    }
}
