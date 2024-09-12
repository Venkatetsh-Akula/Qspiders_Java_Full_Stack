	<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
 	<div class="container">
		<div>${name}</div>
		<h1>Welcome to Java Course</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>UserName</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="todo" items="${todolist}">
				<tr>
					 <td>${todo.id}</td>
					 <td>${todo.username}</td>
					 <td>${todo.description}</td>
					 <td>${todo.taretDate}</td>
					 <td>${todo.done}</td>
					 <td><a href="tododelete?id=${todo.id}" class="btn btn-warning">Delete</a></td>
					 <td><a href="todoupdate?id=${todo.id}" class="btn btn-success">Update</a></td>
				 </tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="addtodoweb" class="btn btn-success">Add New Todo</a>
	</div>
<%@ include file="common/footer.jspf"%>

