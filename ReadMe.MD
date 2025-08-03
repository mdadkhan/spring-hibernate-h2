H2 Database HR Schema Project

Database URL: http://localhost:8090/api/h2/login.do
Credentials:

Username: sa
Password: password
Project Overview

This Spring Boot application provides a ready-to-use H2 database instance configured with the classic HR schema that was previously included with Oracle XE. As modern Oracle XE distributions no longer include this sample schema by default, we've adapted the original HR database structure to be fully compatible with H2.

Key Features

Pre-configured HR Database - Contains all tables, relationships, and sample data from Oracle's original HR schema
Oracle Compatibility Mode - Configured to emulate Oracle's SQL dialect for maximum compatibility
Zero Setup Required - Runs embedded with your Spring Boot application - no need for:
Oracle database installation
Docker containers
Additional database servers
Ideal For

Learning Spring Boot data access features
Practicing JPA/Hibernate configurations
Testing database interactions without infrastructure overhead
Quick prototyping of data-driven applications
Technical Details

Database Type: H2 in-memory (Oracle compatibility mode)
Schema: Complete HR database structure with sample data
Access: Web console available at /api/h2/login.do
Persistence: Automatically initializes on application startup
Simply start the application and begin working with a fully populated HR database - no additional setup required!

http://localhost:8090/api/empList

http://localhost:8090/api/emp/{empId}

http://localhost:8090/api/empHeader/{empId}