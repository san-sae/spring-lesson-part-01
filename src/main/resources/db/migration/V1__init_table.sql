-- flyway 에서 정한 파일명 규칙: V + 번호 + __ + 원하는 클래스 파일명 + .sql
-- application.yml 파일에서 flyway 설정이 되어 있음(classpath는 resources/ 를 의미)

-- DB 설정 시, Host(localhost), Port(5432), Username(postgres), Password(postgres)는 설정하되,
-- Database는 빈 칸으로 놔눌 것(특정 이름으로 두면, 해당 db에만 연결 가능)
-- 또한 intelliJ 또는 DBeaver에서 Show all databases 체크와 현재 사용할 sparta db 체크할 것
-- 그 결과 데이터베이스 sparta  > 스키마 public 를 볼 수 있다.

-- ISSP의 최소권한 원칙과 직무 분리에 따라, DB 계정별로 스키마마다 서로 다른 CRUD 권한 부여
CREATE TABLE example(
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(255),
    PRIMARY KEY (id)
)