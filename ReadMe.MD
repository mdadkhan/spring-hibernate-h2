Database url: http://localhost:8090/api/h2/login.do 
(sa/password)

Spring Boot project with H2 database with Oracle flavor. This project creates an h2 database based on HR database what Oracle XE used to provide.

Earlier they Oracle XE used to come up with pre-installed HR schema. Not Anymore.
So I converted that DDL and data into H2 schema compatible. 

This is a sample Spring Boot project who needs a decent database where they can play with SB, Hibernate and JPA without worrying about installing Oracle or docker desktop. 

http://localhost:8090/api/empList

http://localhost:8090/api/emp/{empId}

http://localhost:8090/api/empHeader/{empId}