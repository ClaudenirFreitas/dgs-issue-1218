# dgs-issue-1218

## Pre requisites

| Name    | Required |
|---------|----------|
| Java 17 | true     |


## Step by step to reproduce the issue
1. Clone this repo
```
git clone https://github.com/ClaudenirFreitas/dgs-issue-1218.git
```
2. Run the application:
```
./gradlew clean bootRun
```
3. Open the GraphiQL page:
```
http://localhost:8080/graphiql
```
4. Execute this query:
```
query {
  shows
}
```
