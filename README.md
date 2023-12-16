# Interview Demo

## What Am I For?

In many interviews it's difficult to find time to cover all the technologies a developer may
have listed on their resume which prevents a real understand of what they know. This basic Spring Boot application 
touches on some of the more common technologies used in creating a basic microservice, REST application

## Interesting Project Points

- Setup 
  - Configured to perform integration testing in gradle
  - Jacoco - perform project code coverage metrics
  - PMD - static analysis of project adherence to  
    - coding standards 
    - performance issues
    - error prone practices...

- Technologies
  - Spring Boot
    - REST 
    - Spring Data/JPA
      - Setup to create SQL schemas and load data for development testing
    - Different yml configurations modeling promotion from local PC to development to production
      using different types of database (H2, MySQL, Postgres)
  - Lombok & Mapstruct - Substantially reduce boilerplate code 
  - Swagger
    - Provides API documentation for external consumption
    - Documentation is internal to the code
    - USAA used it extensively for other scenarios (deployment management, API access)