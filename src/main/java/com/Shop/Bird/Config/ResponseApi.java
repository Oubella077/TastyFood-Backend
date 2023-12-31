package com.Shop.Bird.Config;
import java.time.LocalDateTime;

public class ResponseApi {
        private final boolean success;
        private final String message;

        public ResponseApi(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }

        public String getTimestamp() {
            return LocalDateTime.now().toString();
        }
    }