<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

    <title>SEGUNDO PROJETO</title>
</head>

<body>

    <header class="bg-success">
        <div class="container-fluid">
            <div class="row mb-5">
                <h4> RD - RAIA DROGASIL</h4>
            </div>
        </div>
    </header>


    <div class="container mt-5 ">
     <a class="btn btn-lg btn-success w-30 " href="./cadastro.jsp">Novo Usuario</a>
     <table class="table mt-5">
    <thead class="thead-dark">
      <tr>
        <th scope="col">Id</th>
        <th scope="col">Nome</th>
        <th scope="col">Email</th>
        <th scope="col">Telefone</th>
        <th scope="col">Pais</th>
        <th scope="col">acoes</th>
      </tr>
    </thead>
    <tbody>
     <%= 
     Resultado = ${requestScope.resultado}
     %>  
     <a name"alte>Alterar</a>
        	 <a href="">Remover</a></td>
    </tbody>
    </table>
  </div>

  <a href="">Alterar</a>
        	 <a href="">Remover</a></td>

</body>

</html>