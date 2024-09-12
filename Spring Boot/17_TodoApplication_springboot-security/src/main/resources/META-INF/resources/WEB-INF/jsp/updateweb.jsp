<%@include file="common/header.jspf" %>
<%@include file="common/navigation.jspf" %>
<div class="container">
	<form:form modelAttribute="TodoComponent" method="post">
		<fieldset class="mb-3">
			<form:label path="id"/>Enter id:
				<form:input type="number" path="id"/>			
			</label>
		</fieldset>
		
		<fieldset class="mb-3">
			<form:label path="username"/>Enter username:
				<form:input type="text" path="username"/>			
			</label>
		</fieldset>
		<fieldset class="mb-3">
			<form:label path="description"/>Enter description:
				<form:input type="text" path="description"/>			
			<label>
		</fieldset>
		<fieldset class="mb-3">
			<form:label path="targetdate"/>Enter targetdate:
				<form:input type="date" id="targetDate" path="targetdate"/>			
			</label>
		</fieldset>
		<fieldset class="mb-3">
			<form:label path="state"/>Enter state:
				<form:input type="text" path="state"/>			
			</label>
		</fieldset>
		<button type="submit">Submit</button>
	</form:form>
</div>
	<script type="text/javascript">
		$('#targetDate').datepicker({
		    format: 'yyyy-mm-dd',
		    startDate: '-23y'
		});
</script>
<%@ include file="common/footer.jspf"%>