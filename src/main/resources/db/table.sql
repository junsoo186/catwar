
CREATE TABLE user_tb (
    user_id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(50) NOT NULL, 
    email VARCHAR(50) NOT NULL UNIQUE, 
    password VARCHAR(100) NOT NULL, 
    created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

-- 유저 디테일 테이블
CREATE TABLE user_detail_tb (
    detail_id INT AUTO_INCREMENT PRIMARY KEY, 
    user_id INT NOT NULL,  -- 유저 테이블과의 1:1 관계
    nick_name VARCHAR(50) NOT NULL,
    created_at TIMESTAMP  NULL DEFAULT NOW(),
    FOREIGN KEY (user_id) REFERENCES user_tb(user_id) -- 유저 테이블과의 외래키 관계
);

-- 캐릭터 테이블
CREATE TABLE character_tb (
    character_id INT AUTO_INCREMENT PRIMARY KEY, 
    detail_id INT NOT NULL,  -- 유저 디테일 테이블과의 1:다 관계
    character_name VARCHAR(50) NOT NULL,
    hp INT NOT NULL,
    sp INT NOT NULL,
    ex INT NULL,
    img_path VARCHAR(1000) NOT NULL,
    attack_img_path VARCHAR(1000) NOT NULL,
    attacked_img_path VARCHAR(1000) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),
    FOREIGN KEY (detail_id) REFERENCES user_detail_tb(detail_id) -- 유저 디테일 테이블과의 외래키 관계
);

