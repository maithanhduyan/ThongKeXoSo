<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

	<!-- Sidebar -->
	<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

		<!-- Sidebar - Brand -->
		<a class="sidebar-brand d-flex align-items-center justify-content-center" href="/">
			<div class="sidebar-brand-icon rotate-n-15">
				<i class="fas fa-laugh-wink"></i>
			</div>
			<div class="sidebar-brand-text mx-3">
				TKXS <sup>2.0</sup>
			</div>
		</a>

		<!-- Divider -->
		<hr class="sidebar-divider my-0">

		<!-- Nav Item - Dashboard -->
		<li class="nav-item active"><a class="nav-link" href="/dashboard">
				<i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
			</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider">

		<!-- Heading -->
		<div class="sidebar-heading">Miền Nam</div>

		<!-- Nav Item - Utilities Collapse Menu -->
		<li class="nav-item"><a class="nav-link collapsed" href="#" data-toggle="collapse"
				data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities"> <i
					class="fas fa-fw fa-wrench"></i> <span>Danh Sách Đài</span>
			</a>
			<div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
				data-parent="#accordionSidebar">
				<div class="bg-white py-2 collapse-inner rounded">
					<h6 class="collapse-header"></h6>
					<a class="collapse-item" href="utilities-color.html">An Giang</a> <a class="collapse-item"
						href="utilities-border.html">Bến Tre</a> <a class="collapse-item"
						href="utilities-animation.html">Bình
						Thuận</a> <a class="collapse-item" href="utilities-other.html">Other</a>
				</div>
			</div>
		</li>

		<!-- Divider -->
		<hr class="sidebar-divider">

		<!-- Heading -->
		<div class="sidebar-heading">Thống Kê</div>

		<!-- Nav Item - Tables -->
		<li class="nav-item"><a class="nav-link" href="thongke2so.html">
				<i class="fas fa-fw fa-table"></i> <span>2 số [00 - 99]</span>
			</a></li>

		<!-- Divider -->
		<hr class="sidebar-divider d-none d-md-block">

		<!-- Sidebar Toggler (Sidebar) -->
		<div class="text-center d-none d-md-inline">
			<button class="rounded-circle border-0" id="sidebarToggle"></button>
		</div>

	</ul>
	<!-- End of Sidebar -->