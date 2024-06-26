package com.example.loginapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public class NaverResponse {

    @Data
    public static class TokenDTO {
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("expires_in")
        private String expiresIn;
    }

    @Data
    public static class NaverUserDTO {
        private Response response;

        @Data
        public static class Response {
            private String id;
            private String email;
            private String name;
            private String nickname;

        }
    }
}
