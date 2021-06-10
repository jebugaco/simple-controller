#### Сборка docker-образа
* `docker build -t jebugaco/simple-controller .`

#### Создание контейнера
* `docker run -p 8080:8081 jebugaco/simple-controller`

#### Публикация образа на docker hub
* `docker login` - вводим login/pass для docker hub
* `docker push jebugaco/simple-controller`

#### Запуск curl внутри контейнера
* `docker exec -it <hash> sh`
* `curl -X GET "http://localhost:8081/hello/anon"`
