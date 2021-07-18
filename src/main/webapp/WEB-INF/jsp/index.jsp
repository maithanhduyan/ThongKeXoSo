<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>

<head>
	<meta charset="UTF-8">
	<link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"
		media="screen" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css" />
	<title>${message}</title>
</head>

<body>

	<div class="row">
		<div class="col-sm">
			<div class="card">
				<div class="card-header">${message}</div>
				<div class="card-body">
					<div>
						<select id="listDai" class="listDai">
							<option>--- Choose ---</option>
						</select>
					</div>
					<table id="table" class="table table-striped">
						<tbody>
							<% for(int i=0; i < 100; i++) { %>
								<tr>
									<td><% if(i<10 ){ out.print("0"+i);}else{ out.print(i);} %></td>
								</tr>
							<% } %>
						</tbody>
					</table>
				</div>
				<div class="card-footer"></div>
			</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/app.js">

</script>

</html>