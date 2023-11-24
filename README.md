
# Aplicativo de delivery em Java Swing (EasyEat)

O aplicativo foi feito com java swing, utilizando banco de dados postgreSQL.
Existem algumas funções feitas diretamente no aplicativo como o CRUD de produtos, e outras que utilizam o mesmo banco de dados mas são manipuladas através de requisições em uma [API feita em spting boot](https://github.com/Diegojacober/EatEasy-API), como autenticação de usuários que é feita na API via JWT.




## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/Diegojacober/eat-easy-UI.git
```

dentro de src/main/java/com/diegojacober/delivery/dao/ edite o arquivo DBConnection.java

```java
    // coloque o nome do banco de dados apos a barra 
  private static final String url = "jdbc:postgresql://localhost:5423/eateasy";
    // NOME DO SEU USUÁRIO
  private static final String user = "dev";
    // SENHA DO SEU USUÁRIO
  private static final String password = "123456";
```

após isso rode o arquivo /src/main/java/com/diegojacober/delivery/Delivery.java

