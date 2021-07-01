package com.enginesApi;

public class AuthorizationPojo {

        public String userName;
        public String password;

        /**
         * No args constructor for use in serialization
         *
         */
        public AuthorizationPojo() {
        }

        /**
         *
         * @param password
         * @param userName
         */
        public AuthorizationPojo(String userName, String password) {
            super();
            this.userName = userName;
            this.password = password;
        }
}
