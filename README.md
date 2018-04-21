# playground-openliberty
Playing around with IBM's OpenLiberty.io (JEE8 and MicroProfile 1.3 compliant)


## To build and run
Use this to compile and run on a local liberty server
```
mvn clean
mvn package liberty:run-server
```

Started application will be available here
```
http://localhost:9080/openliberty/rest/ping
```

## Fast development, hot redeploy
Make some code changes to PingResouce.java and recompile from your IDE or maven
```
mvn compile
```

The new version will be hot deployed immediately, check the console log :
```
[INFO] [AUDIT   ] CWWKZ0003I: The application openliberty updated in 0,017 seconds.
```
