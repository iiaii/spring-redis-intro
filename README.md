# spring-redis-intro

docker redis 는 기본적으로 6379 포트를 통해 밖으로 보내므로 `-p 6379:6379` (localhost):(docker img) 와 같은 형태로 포트 매핑 시킨다.
 
- docker redis 구동

 `docker run -p 6379:6379 --name redis -d redis`
 
- docker client 접속

`docker run -it --link redis:redis --rm redis redis-cli -h redis -p 6379`
 

모든 키 가져오기 : `keys *`
키에 해당하는 모든 value 가져오기 : `hget [key] *`


 