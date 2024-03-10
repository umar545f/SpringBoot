    <%@ include file = "common/header.jspf"%>
    <%@ include file = "common/navigation.jspf"%>
    <div>Add a to do</div>
    <div class="container">
     <form:form method="post" modelAttribute="todo">
           <fieldset class=mb-3>
           <form:label path="description">Description</form:label>
           <form:input type ="text" path="description" required="required"/>
            <c:forEach var="error" items="${errors}">
                           <div class="text-danger">${error.defaultMessage}</div>
            </c:forEach>
            </fieldset>

             <fieldset class=mb-3>
                       <form:label path="date">Target Date</form:label>
                       <form:input type ="text" path="date" required="required"/>
                        <c:forEach var="error" items="${errors}">
                                       <div class="text-danger">${error.defaultMessage}</div>
                        </c:forEach>
             </fieldset>

           <form:input type ="hidden" path="id"/>

           <form:input type ="hidden" path="done"/>

           <input type = "submit">
        </form:form>
    </div>
    <%@ include file = "common/footer.jspf"%>
    <script type="text/javascript">
    	$('#date').datepicker({
    	    format: 'yyyy-mm-dd'
    	});
    </script>
  </body>
</html>