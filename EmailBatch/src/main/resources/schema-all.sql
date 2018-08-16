DROP TABLE email IF EXISTS;

CREATE TABLE email (
    id IDENTITY NOT NULL PRIMARY KEY,
    email_id VARCHAR(50),
    date VARCHAR(20),
	post_name VARCHAR(50)
);