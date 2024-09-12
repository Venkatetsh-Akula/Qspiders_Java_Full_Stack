<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
		<table class="table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Username</th>
				<th>Description</th>
				<th>TargetDate</th>
				<th>State</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
			<c:forEach var="todo" items="${todolist}">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.username}</td>
					<td>${todo.description}</td>
					<td>${todo.targetdate}</td>
					<td>${todo.state}</td>
					<td><a href="deletetodorequest?id=${todo.id}" class="btn btn-warning">Delete</a></td>
					<td><a href="updatetodorequest?id=${todo.id}" class="btn btn-success">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="addtodorequest" class="btn btn-success">Add Todo State</a>
</div>
<%@ include file="common/footer.jspf"%>