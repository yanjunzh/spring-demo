# spring-demo
 spring playground
## Database: postgres
    ```sql
    CREATE USER postgres WITH ENCRYPTED PASSWORD 'postgres';

    CREATE DATABASE "spring_demo" WITH OWNER postgres;
    CREATE DATABASE "spring_demo_test" WITH OWNER postgres;

