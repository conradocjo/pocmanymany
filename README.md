# mapeamento @ManyToMany JPA:

A Ideia desta POC é demonstrar por meio de um exemplo prático o comportamento do mapeamento @ManyToMany e desta forma ser um material de consulta.

Para o exemplo em questão uma pessoa pode estar escrita em vários cursos e um curso pode ter várias pessoas.

Abaixo o mapeamento da tabela Curso:
![image](https://github.com/conradocjo/pocmanymany/assets/29169349/50b10b45-3fd2-4d23-888d-a86db4c1b33c)

Abaixo o mapeamento da tabela Pessoa:
![image](https://github.com/conradocjo/pocmanymany/assets/29169349/3f7c7eb0-fc4d-4ac9-9fb4-b132fb2bb088)


O Código gerado apartir do JPA, reproduzido por meio de um diagrama de banco de dados:
![image](https://github.com/conradocjo/pocmanymany/assets/29169349/ae460fda-0194-494c-bfe9-0b144ad100a7)


É possível perceber que é gerado uma nova tabela que interligará as duas tabelas, curso e pessoa.
![image](https://github.com/conradocjo/pocmanymany/assets/29169349/d3a5e319-9a44-451f-a298-ce1d54d7691d)


