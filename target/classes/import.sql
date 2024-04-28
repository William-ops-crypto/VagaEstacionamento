CREATE TABLE "VagaEstacionamento"."tb_status" ("id" BIGSERIAL, "name" "char"(255), "status" "char"(255), PRIMARY KEY ("id")) WITHOUT OIDS
INSERT INTO tb_status(Status,name) VALUES ('Entrada','Na Vaga');
INSERT INTO tb_status(Status,name) VALUES ('Saida', 'Saiu da vaga');
