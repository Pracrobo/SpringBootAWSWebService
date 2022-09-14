package com.springboot.practice.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    //Enum 클래스 Role 생성
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반사용자");
//권한코드에 항상 ROLE_ 존재해야 한다.
    private final String key;
    private final String title;

}
