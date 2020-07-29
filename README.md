# spring-redis-intro

docker redis 는 기본적으로 6379 포트를 통해 밖으로 보내므로 `-p 6379:6379` (localhost):(docker img) 와 같은 형태로 포트 매핑 시킨다.
 
- docker redis 구동

 `docker run -p 6379:6379 --name redis -d redis`
 
- docker client 접속

`docker run -it --link redis:redis --rm redis redis-cli -h redis -p 6379`
 

- 모든 키 가져오기 : `keys *`
- 키에 해당하는 모든 속성 가져오기 : `hgetall [key]`
- 키에 해당하는 value 속성 가져오기 : `hget [key] [attr]`


##### Spring

- `@RedisHash("ContentProvider")` 를 엔티티 위에 붙인다.
- `@Id` 는 String 타입으로 한다.
- Spring Data Jpa 처럼 하되 CrudRepository 를 구현한다. 
- findBy ... 가 작동하려면 엔티티에서 해당 속성 값 위에 `@Indexed` 를 붙인다. (`@Index` 주석은 Redis {@literal SET}을 사용하여 일치하는 값을 가진 객체를 추적하는 인덱싱과 같은 속성을 표시함)

값을 찾고 없으면 저장하는 로직 간단하게 
```java
ContentProvider findContentProvider = contentProviderRepository
                    .findByTitle(cp.getTitle())
                    .orElseGet(() -> contentProviderRepository.save(cp));
```


 