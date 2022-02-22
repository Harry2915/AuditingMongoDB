# MongoDB Auditing | Spring Boot

## Overview:

- Audit Model
- Implement AuditorAware
- Enable Auditing


### Audit Model:
Let's create an Audit Model that every Entity Class will extend that will be stored in the Database.
### Implement AuditorAware:
For capturing the information for these annotations, the spring data provides us with AuditorAware interface.
### Enable Auditing:
Add @EnableMongoAuditing to the Main Class
