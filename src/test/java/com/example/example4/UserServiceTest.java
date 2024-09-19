package com.example.example4;

import com.example.example4.dto.UserDto;
import com.example.example4.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.testng.AssertJUnit.assertEquals;

public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserDto userDto;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRegisterUser() {
        when(userDto.getUsername()).thenReturn("testuser");

        String result = userService.registerUser(userDto);
        assertEquals("User registered: testuser", result);

        verify(userDto).getUsername();
    }
}
