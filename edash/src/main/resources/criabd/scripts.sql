-- Criação do banco de dados 'edash'
CREATE DATABASE IF NOT EXISTS edash;
-- Criação da tabela 't_user'
CREATE TABLE t_user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    birth_date DATE NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE
);
-- Alterar a tabela 't_user' para adicionar a coluna 'email'
ALTER TABLE t_user ADD COLUMN email VARCHAR(100) NOT NULL UNIQUE;
-- Inserindo um registro fictício na tabela 't_user'
INSERT INTO t_user (name, phone, birth_date, cpf, email) 
VALUES ('John Doe', '1234567890', '1990-01-01', '12345678901', 'john.doe@example.com');
commit;
CREATE TABLE t_logacesso (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    method VARCHAR(255),
    emailuser VARCHAR(255),
    momentreq TIMESTAMP
);
CREATE TABLE t_mercado (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mercado VARCHAR(255) NOT NULL
);
INSERT INTO t_mercado (mercado) VALUES
('RESULTADO DA PARTIDA'),
('MAIS/MENOS DE 0,5'),
('MAIS/MENOS DE 1,5'),
('MAIS/MENOS DE 2,5'),
('MAIS/MENOS DE 3,5'),
('MAIS/MENOS DE 4,5'),
('MAIS/MENOS DE 5,5'),
('MAIS/MENOS DE 6,5'),
('MAIS/MENOS DE 7,5'),
('MAIS/MENOS DE 8,5'),
('HANDICAP ASIÁTICO'),
('LINHAS DE GOL'),
('AMBOS OS TIMES MARCAM?'),
('INTERVALO'),
('0,5 GOLS NO PRIMEIRO TEMPO'),
('1,5 GOLS NO PRIMEIRO TEMPO'),
('2,5 GOLS NO PRIMEIRO TEMPO'),
('CASA +1'),
('CASA +2'),
('CASA +3'),
('CASA VENCE SEM SOFRER GOLS'),
('VISITANTE +1'),
('VISITANTE +2'),
('VISITANTE +3'),
('VISITANTE VENCE SEM SOFRER GOLS'),
('CHANCE DUPLA'),
('EMPATE SEM APOSTA'),
('INTERVALO/FIM DE JOGO'),
('PLACAR NO INTERVALO'),
('RESULTADO DA PARTIDA E AMBOS MARCAM'),
('RESULTADO DA PARTIDA E MAIS/MENOS 2,5 GOLS'),
('TOTAL DE GOLS PAR/ÍMPAR');
COMMIT;
CREATE TABLE t_tipoaposta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tipoaposta VARCHAR(50) NOT NULL
);
-- Inserindo registros
INSERT INTO t_tipoaposta (tipoaposta) VALUES
('EXCHANGE'),
('BET');
COMMIT;
CREATE TABLE t_banca (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    valor_inicial DECIMAL(15, 2) NOT NULL,
    valor_atual DECIMAL(15, 2) NOT NULL,
    ultima_atualizacao TIMESTAMP NOT NULL
);
COMMIT;

