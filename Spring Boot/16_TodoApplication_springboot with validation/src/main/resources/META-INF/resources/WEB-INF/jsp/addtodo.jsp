<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %> 
<div class="container">
	<h3>Enter todo details</h3>
		<form:form method="post" modelAttribute="TodoDetails">
		<fieldset class="mb-3">
				<form:label path="description"/>Enter Description:
				 <form:input type="text" path="description" requried="true"/>
				<form:errors path="description" cssClass="text-warning"></form:errors>
				</label>
		</fieldset>
		<fieldset class="mb-3">
			<form:label  path="taretDate"/>Enter the Year
			<form:input id="taretDate" path="taretDate" />
			</label>
		</fieldset>
		<fieldsetclass="mb-3">
			<form:label path="done"/>Enter the state
			<form:input type="text" path="done"/>
			</label>
		</fieldset>
				<button type="submit" class="btn btn-success">Submit</button>	
		</form:form>		
</div>
<script type="text/javascript">
		$('#taretDate').datepicker({
		    format: 'mm/dd/yyyy',
		    startDate: '-23y'
		});
	</script>
<%@ include file="common/footer.jspf"%>
