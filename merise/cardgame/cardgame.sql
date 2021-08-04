DROP DATABASE IF EXISTS db_cardgame;


CREATE DATABASE IF NOT EXISTS db_cardgame;

USE db_cardgame;

/* String player_nickname; */

CREATE TABLE IF NOT EXISTS players 
(
	player_nickname VARCHAR(24) PRIMARY KEY,
    player_lastname VARCHAR(32) NOT NULL,
    player_firstname VARCHAR(32) NULL,
    player_email VARCHAR(255) UNIQUE
);




