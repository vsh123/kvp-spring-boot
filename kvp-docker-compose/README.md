# docker-compose 띄우기

```
1. 이 폴더 들어오기
cd kvp-docker-compose

2. 실행
docker-compose up -d

# 완전 종료 : 모든 데이터 사라짐
docker-compose down

# 일시 정지 : 데이터 유지
docker-compose stop
```

## 초기화 파일
* `mysql-init.d` : `*.sql` 파일들로 database 생성 등을 수행한다.

## mysql client
* 서비스용 계정 : `kvp-admin`
* 서비스용 비밀번호 : `kvp-admin`
* [docker localhost adminer](http://localhost:28080) 로 접속하면 [adminer](https://www.adminer.org) Web DB Client 로 DB조회 조작 가능.

## postgresql client
* 서비스용 계정 : `kvp-admin`
* 서비스용 비밀번호 : `kvp-admin`
* [docker localhost adminer](http://localhost:28080) 로 접속하면 [adminer](https://www.adminer.org) Web DB Client 로 DB조회 조작 가능.
