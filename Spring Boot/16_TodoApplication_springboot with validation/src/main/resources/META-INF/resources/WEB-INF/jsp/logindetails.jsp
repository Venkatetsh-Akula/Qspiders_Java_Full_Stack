<%@ include file="common/header.jspf" %> 
<%@ include file="common/navigation.jspf" %>
	<div class="container">
	<h1>Login Page</h1>
		<pre>${credintails}</pre>
		<form method="post">
			<label>Enter the name:<input type="text" name="name"></label>
			<label>Enter the password:<input type="password" name="password"></label>
			<button type="submit">Submit</button>
		</form>
	</div>
<%@ include file="common/footer.jspf" %>
