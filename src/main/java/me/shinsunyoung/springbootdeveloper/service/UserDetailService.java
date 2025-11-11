package me.shinsunyoung.springbootdeveloper.service;
import me.shinsunyoung.springbootdeveloper.domain.User;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.springbootdeveloper.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailsService {
    private  final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email) {
        return  userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}
