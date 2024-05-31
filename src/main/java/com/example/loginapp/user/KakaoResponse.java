package com.example.loginapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.security.Timestamp;

public class KakaoResponse {

    @Data // getter, setter
    public static class TokenDTO {
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("expires_in")
        private Integer expiresIn;
        private String scope; // 조심하자
        @JsonProperty("refresh_token_expires_in")
        private Integer refreshTokenExpiresIn;
    }

    @Data
    public static class KakaoUserDTO {
        private Long id;
        @JsonProperty("connected_at")
        private Timestamp connectedAt;
        private Properties properties;

        @Data
        class Properties {
            private String nickname;
        }
    }
}

//    {
//    "access_token": "kxwyO4HPUILyppm02TlYO_Lw5PgnHrJEAAAAAQoqJQ0AAAGPzT3LEq-b-4epDDEo",
//    "token_type": "bearer",
//    "refresh_token": "dVyO0sKHz5pkmnZMldE9DAZgBpsGhoZMAAAAAgoqJQ0AAAGPzT3LD6-b-4epDDEo",
//    "expires_in": 21599,
//    "scope": "profile_nickname",
//    "refresh_token_expires_in": 5183999
//}


//    {
//    "id": 3506331339,
//    "connected_at": "2024-05-31T06:02:10Z",
//    "properties": {
//        "nickname": "장유진"
//    },
//    "kakao_account": {
//        "profile_nickname_needs_agreement": false,
//        "profile": {
//            "nickname": "장유진",
//            "is_default_nickname": false
//        }
//    }
//}
// }