CREATE USER 'root123'@'localhost' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON *.* TO 'root123'@'localhost';
FLUSH PRIVILEGES;

REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'root123'@'localhost';
FLUSH PRIVILEGES;

create database test;
GRANT ALL PRIVILEGES ON test.* TO 'root123'@'localhost';
