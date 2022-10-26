package com.study.docker.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    ADMIN("ROLE_ADMIN","관리자"),
    MEMBER("ROLE_MEMBER","회원"),
    GUEST("ROLE_GUEST","게스트");

    private final String key;
    private final String title;
}
