create table cliente(
codcliente int not null primary key auto_increment,
nome varchar (100)not null,
Cpf varchar (11) not null,
Enderco varchar (150) not null,
telefone varchar (9) not null,
email varchar (250) not null,
DataNsc varchar (10) not null,
Sexo varchar (100) not null,
EstadoC varchar (100)not null,
profissao varchar (150)not null
);

create table produto(
codproduto int not null primary key auto_increment,
Nome varchar (150) not null,
Codigodoproduto varchar (150)not null,
Descricao varchar (150) not null,
Preco decimal(10,2) not null,
Quantidadeemestoque decimal(10,2) not null,
Categoria varchar (100) not null,
Datavalidade date not null,
Fornecedor varchar (150) not null,
Localizacaonoestoque varchar (100) not null
);

create table funcionario(
codfuncionario int not null primary key auto_increment,
NomeCompleto varchar (150) not null,
Cpf varchar (11) not null,
Endereco varchar (150) not null,
Email varchar (150) not null,
DatadeAdmissao date not null,
Cargo varchar (100) not null,
Salario decimal (10,2) not null,
Departamento varchar (100) not null
);

create table fornecedor(
codfornecedor int not null primary key auto_increment,
Nomecompleto varchar (150) not null,
Cnpj varchar (100) not null,
Endereco varchar (200) not null,
Email varchar (150) not null,
Nomedocontato varchar (150) not null,
Tipodeproduto_servico varchar (200) not null,
Condicoesdepagamento varchar (150)not null,
Prazodeentrega date not null
);

create table aluno(
codaluno int not null primary key auto_increment,
 Nome varchar (150) not null,
 CPF varchar (11) not null,
 Endereco varchar (200) not null,
 Telefone varchar (9) not null,
 Email varchar (200) not null,
 Datadenascimento varchar (10) not null,
 Serie_Ano varchar (10) not null,
 Responsavel varchar (100) not null
 );

create table veiculo(
codveiculo int not null primary key auto_increment,
Placa varchar (10) not null,
Marca varchar (100) not null,
Anodefabricacao date not null,
Cor varchar (100)not null,
Chassi decimal (10,2) not null,
Quilometragem decimal(10,2) not null,
Ultimarevisao date not null
);

create table eventos(
codeventos int not null primary key auto_increment,
Nome varchar (100) not null,
Data_evento varchar (100) not null,
HorarioInicio int not null,
HorariTermino int not null,
Local_Eventos varchar (150) not null,
Descricao varchar (150) not null,
PublicoAlvo varchar (150) not null,
CapacidadeMaxima varchar (200) not null,
Organizador varchar (150) not null
);


create table contapagar(
codcontapagar int not null primary key auto_increment,
descricao varchar (100) not null,
valor decimal (10,2) not null,
Data_pagamento date not null,
Fonecedor varchar (100) not null,
Categoria varchar (100) not null,
Status_pagamento varchar (150) not null,
Metodo_pagamento varchar (100) not null,
Observacao varchar (200)  not null
);

create table livros(
codlivros int not null primary key auto_increment,
Titulo varchar (100) not null,
Autor varchar (150) not null,
ISBN varchar (100) not null,
Editora varchar (150) not null,
Ano_publicacao date not null,
Genero varchar (150) not null,
Numero_paginas int not null,
Idioma varchar (100) not null,
Localizacao_biblioteca varchar (200) not null
);

 














































