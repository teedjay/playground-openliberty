# playground-openliberty
Playing around with IBM's OpenLiberty.io (JEE8 and MicroProfile 1.3 compliant)


## To build and run
Use this to compile and run on a local liberty server
```
mvn clean
mvn package liberty:run-server
```

Started application will be available here.
```
http://localhost:9080/openliberty/

curl -i http://localhost:9080/openliberty/rest/ping
curl -i http://localhost:9080/openliberty/rest/ping/SomeTextHere

curl -i http://localhost:9080/openliberty/rest/pong
curl -i http://localhost:9080/openliberty/rest/pong/OtherTextHere

```

You can access health info and a UI for interactive testing by using url's below.
```
http://localhost:9080/health

http://localhost:9080/openapi
http://localhost:9080/openapi/ui/

See the main/liberty/server.xml for how to enable HTTPS and basic security
curl -i -k -u admin:adminpwd https://localhost:9443/metrics
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

## Debugging
To start with debugging activated run the command below and then use "Attach to Local Process" from IDEA :    
```
mvn package liberty:debug-server
```