
# Capitole Test | Ugo Guazelli 

Hi, thank you for taking the time to review my Test. If you have any question, feel free in contact me. 

guazelli.ugo@gmail.com | +1 438 226-5956


## Run Locally

Clone the project

```bash
  git clone https://github.com/uguazelli/capitole-ugo.git
```

Go to the project directory

```bash
  cd capitole-ugo
```

Install dependencies

```bash
    ./gradlew build   # Linux/macOS
    gradlew build     # Windows
```

Run the application

```bash
    ./gradlew bootRun   # Linux/macOS
    gradlew bootRun     # Windows

```
Once the application starts, you can  access it in your web browser at http://localhost:8080. If you cannot use this port due a conflict with another app running in the same port, you can choose aother port changing the application.properties file

```bash
    # Configuración del servidor
    server.port = 8080
```
If you're using an IDE like IntelliJ IDEA or Eclipse, import the project as a Gradle project to benefit from features like code completion, debugging, and testing.


## Usage/Examples

To run tests, run the following command

```bash
curl "http://localhost:8080/api/prices?date=2020-06-14T10:00:00&productId=35455&brandId=1"
curl "http://localhost:8080/api/prices?date=2020-06-14T16:00:00&productId=35455&brandId=1"
curl "http://localhost:8080/api/prices?date=2020-06-14T21:00:00&productId=35455&brandId=1"
curl "http://localhost:8080/api/prices?date=2020-06-15T10:00:00&productId=35455&brandId=1"
curl "http://localhost:8080/api/prices?date=2020-06-16T21:00:00&productId=35455&brandId=1"
```

Alternative, you can use tools like Postman or Imnsonia to test it as well.

As all tests are pointing to a Get method, you can directly type the url in your browser as well.


## Running the tests
```bash
./gradlew clean test
```
