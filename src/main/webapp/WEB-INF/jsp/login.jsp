<html>
  <head>
   <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
       rel="stylesheet"></link>
    <title> Login Page </title>
  </head>
  <div class="container">
  <body>
    Welcome to the login page ${name}
    <form method="post">
       Name : <input type ="text" name="name"><br/>
       Password : <input type ="text" name="password">
       <input type = "submit">
       <p>${warning}</p>
    </form>
  </body>
  </div>
</html>