<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
     rel="stylesheet"></link>
    <title>To do List</title>
  </head>
  <body>
    <%@ include file = "common/navigation.jspf"%>
    <div>Your to do list</div>
    <div class="container">
    <table class="table">
        <thead>
          <tr>
            <th>id</th>
            <th>username</th>
            <th>Description</th>
            <th>Date</th>
            <th>Is Done?</th>
            <th>Delete</th>
            <th>Update</th>
           </tr>
        </thead>
        <tbody>
             <c:forEach items ="${todo}" var="todo">
              <tr>
                <td>${todo.id}</td>
                <td>${todo.username}</td>
                <td>${todo.description}</td>
                <td>${todo.date}</td>
                <td>${todo.done}</td>
                <td><a href="deleteToDo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
                <td><a href="updateToDo?id=${todo.id}" class="btn btn-success">Update</a></td>
              </tr>
             </c:forEach>
         </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo </a>
    </div>
    <%@ include file = "common/footer.jspf"%>
  </body>
</html>