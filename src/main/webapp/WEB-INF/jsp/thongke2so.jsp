<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

	<%@include file="layout/_header.jsp" %>

		<body id="page-top">

			<!-- Page Wrapper -->
			<div id="wrapper">

				<%-- sidebar --%>
					<%@include file="layout/_sidebar.jsp" %>

						<!-- Content Wrapper -->
						<div id="content-wrapper" class="d-flex flex-column">

							<!-- Main Content -->
							<div id="content">

								<%-- navbar --%>
									<%@include file="layout/_navbar.jsp" %>

										<!-- Begin Page Content -->
										<div class="container-fluid">

											<!-- Page Heading -->
											<div class="d-sm-flex align-items-center justify-content-between mb-4">
												<h1 class="h3 mb-0 text-gray-800">Thống Kê 2 Số</h1>
											</div>

											<!-- Content Row -->
											<div class="row">

												<!-- Approach -->
												<div class="card shadow mb-4">
													<div class="card-header py-3">
														<h6 class="m-0 font-weight-bold text-primary">Từ 00 đến 99</h6>
														
													</div>
													<div class="card-body">
														<p>SB Admin 2 makes extensive use of Bootstrap 4 utility classes
															in order to reduce
															CSS bloat and poor page performance. Custom CSS classes are
															used to create
															custom components and custom utility classes.</p>
														<p class="mb-0">Before working with this theme, you should
															become familiar with the
															Bootstrap framework, especially the utility classes.</p>
													</div>
												</div>
											</div>
											<!-- /.Content Row -->


										</div>
										<!-- /.container-fluid -->

							</div>
							<!-- End of Main Content -->

							<%-- footer --%>
								<%@include file="layout/_footer.jsp" %>
						</div>
						<!-- End of Content Wrapper -->

			</div>
			<!-- End of Page Wrapper -->

			<%-- scripts --%>
				<%@include file="layout/_scripts.jsp" %>

					<script>

					</script>

		</body>

		</html>