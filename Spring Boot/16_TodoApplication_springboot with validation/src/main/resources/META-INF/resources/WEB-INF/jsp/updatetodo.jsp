<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%> 
	<div class="container">
		<form:form method="post"  modelAttribute="TodoDetails">
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
				</label>
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="taretDate"/>Enter no years:
				<form:input type="text" path="taretDate"/>
				</label>
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="done"/>Enter true or false:
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
<%@ include file="common/footer.jspf" %>
