# execute the project

mvn clean spring-boot:run

# Call to the soap service

curl --header "content-type: text/xml" -d @request.xml http://localhost:8081/ws

# Call to the rest Service

http://localhost:8081/hello
