package com.enginesApi;

public class ProjectsAuthorizationPojo {

        public String clientID;
        public String clientSecret;
        public String password;
        public String userName;


        /**
         * No args constructor for use in serialization
         *
         */
        public ProjectsAuthorizationPojo() {
        }

        /**
         *
         * @param password
         * @param userName
         */
        public ProjectsAuthorizationPojo(String clientID , String clientSecret, String password, String userName) {
            super();
            this.clientID=clientID;
            this.clientSecret=clientSecret;
            this.userName = userName;
            this.password = password;
        }
}
