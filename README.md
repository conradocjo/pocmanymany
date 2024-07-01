# mapeamento @ManyToMany JPA:

A Ideia desta POC é demonstrar por meio de um exemplo prático o comportamento do mapeamento @ManyToMany e desta forma ser um material de consulta.

Para o exemplo em questão uma pessoa pode estar escrita em vários cursos e um curso pode ter várias pessoas.

Abaixo o mapeamento da tabela Curso:
![image](https://github.com/conradocjo/pocmanymany/assets/29169349/1f35c555-be9a-4388-b2cc-718b92abb35c)


Abaixo o mapeamento da tabela Pessoa:
![image](https://github.com/conradocjo/pocmanymany/assets/29169349/85300e20-5edd-4c5d-bbd4-f336a38cc187)

O Código gerado apartir do JPA, reproduzido por meio de um diagrama de banco de dados:
![image](https://github.com/conradocjo/pocmanymany/assets/29169349/4cae0577-dba5-4623-a7b4-c7d0bb138d6f)

É possível perceber que é gerado uma nova tabela que interligará as duas tabelas, curso e pessoa.
![image](https://github.com/conradocjo/pocmanymany/assets/29169349/d3a5e319-9a44-451f-a298-ce1d54d7691d)


