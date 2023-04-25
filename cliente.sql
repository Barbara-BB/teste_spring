use anotacao;

create table cliente (
cliente_id bigint primary key auto_increment,
cliente_nome varchar(80) not null unique,
data_cliente datetime not null,
cliente_uf varchar(2),

);

insert into cliente(cliente_nome, data_cliente, cliente_uf)
    values ('Teste 1', current_timestamp(),'SP');
