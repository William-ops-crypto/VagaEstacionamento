CREATE TABLE "VagaEstacionamento"."tb_status" ("id" BIGSERIAL, "name" "char"(255), "status" "char"(255), PRIMARY KEY ("id")) WITHOUT OIDS
INSERT INTO tb_status(Status,name) VALUES ('Entrada','Na Vaga');
INSERT INTO tb_status(Status,name) VALUES ('Saida', 'Saiu da vaga');
INSERT INTO tb_vaga(status_id, name, pagamento,  marcadocarro, modelo, placa) VALUES (1, 'Maria', 'Pago' 'VW', 'Gol', 'RXD-1245');
INSERT INTO tb_vaga(status_id, name,  marcadocarro, modelo, placa) VALUES (1, 'Bob', 'Fiat', 'Punto', 'GFD-7854');
INSERT INTO tb_vaga(status_id, name,  marcadocarro, modelo, placa) VALUES (2, 'Alex', 'Ford', 'Corsa', 'HYU-8965');
INSERT INTO tb_vaga(status_id, name,  marcadocarro, modelo, placa) VALUES (2, 'Atonio', 'Nissan', 'Frontier', 'JUY-6985');