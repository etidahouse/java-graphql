# java-graphql

## Requirements
[Docker](https://www.docker.com/)

## Technologies 
[Java 11 (openjdk)](https://openjdk.org/projects/jdk/11/), [Maven](https://maven.apache.org/), [Payara Community Server](https://www.payara.fish/downloads/payara-platform-community-edition/)

## GraphQL

[GraphQL documentation](https://graphql.org/learn/) 

[Java GraphQL](https://www.graphql-java.com/)

## Build project
```bash
sh build
```

## Run project
```bash
sh deploy
```

The service is deployed at http://localhost:8085/java-graphql/

## Request API

### Query

Get all books :
```json
query {
  allBooks {
    title,
    author {name}
  }
}
```

Get one book :
```json
query {
   getBook(title: "mon titre") {
    title,
    author {name}
  }
}
```

Search books by title :
```json
query {
searchBooksByTitle(title: "Title") {
    title,
  	author {
      name,
      surname
    }
  }
}
```

### Mutation

Create Book :
```json
mutation {
createBook(title: "mon titre", name: "mon name", 
  surname: "mon surname") {
    title
  }
}
```
