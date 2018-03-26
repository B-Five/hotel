<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
<link href="resource/back/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href="resource/back/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
<link href="resource/back/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="resource/back/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
<link href="resource/back/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link href="resource/back/assets/global/css/components.min.css" rel="stylesheet" id="style_components" type="text/css" />
<link href="resource/back/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css" />
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link href="resource/back/assets/layouts/layout/css/layout.min.css" rel="stylesheet" type="text/css" />
<link href="resource/back/assets/layouts/layout/css/themes/darkblue.min.css" rel="stylesheet" type="text/css" id="style_color" />
<link href="resource/back/assets/layouts/layout/css/custom.min.css" rel="stylesheet" type="text/css" />
<!-- END THEME LAYOUT STYLES -->
</head>
<body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
	<!-- BEGIN HEADER -->
	<div class="page-header navbar navbar-fixed-top">
		<!-- BEGIN HEADER INNER -->
		<div class="page-header-inner ">
			<!-- BEGIN LOGO -->
			<div class="page-logo">
				<a href="/hotel/backIndex"> <img
					src="resource/back/assets/layouts/layout/img/logo.png" alt="logo"
					class="logo-default" />
				</a>
				<div class="menu-toggler sidebar-toggler"></div>
			</div>
			<!-- END LOGO -->
			<!-- BEGIN RESPONSIVE MENU TOGGLER -->
			<a href="javascript:;" class="menu-toggler responsive-toggler"
				data-toggle="collapse" data-target=".navbar-collapse"> </a>
			<!-- END RESPONSIVE MENU TOGGLER -->
			<!-- BEGIN TOP NAVIGATION MENU -->
			<div class="top-menu">
				<ul class="nav navbar-nav pull-right">
					<!-- BEGIN USER LOGIN DROPDOWN -->
					<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
					<li class="dropdown dropdown-user"><a href="javascript:;"
						class="dropdown-toggle" data-toggle="dropdown"
						data-hover="dropdown" data-close-others="true"> <span
							class="username username-hide-on-mobile"> Nick </span> <i
							class="fa fa-angle-down"></i>
					</a>
						<ul class="dropdown-menu dropdown-menu-default">
							<li><a href="page_user_profile_1.html"> <i
									class="icon-user"></i> My Profile
							</a></li>
							<li><a href="app_calendar.html"> <i
									class="icon-calendar"></i> My Calendar
							</a></li>
							<li><a href="app_inbox.html"> <i
									class="icon-envelope-open"></i> My Inbox <span
									class="badge badge-danger"> 3 </span>
							</a></li>
							<li><a href="app_todo.html"> <i class="icon-rocket"></i>
									My Tasks <span class="badge badge-success"> 7 </span>
							</a></li>
							<li class="divider"></li>
							<li><a href="page_user_lock_1.html"> <i
									class="icon-lock"></i> Lock Screen
							</a></li>
							<li><a href="page_user_login_1.html"> <i
									class="icon-key"></i> Log Out
							</a></li>
						</ul></li>
					<!-- END USER LOGIN DROPDOWN -->
					<!-- BEGIN QUICK SIDEBAR TOGGLER -->
					<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
					<li class="dropdown dropdown-quick-sidebar-toggler"><a
						href="javascript:;" class="dropdown-toggle"> <i
							class="icon-logout"></i>
					</a></li>
					<!-- END QUICK SIDEBAR TOGGLER -->
				</ul>
			</div>
			<!-- END TOP NAVIGATION MENU -->
		</div>
		<!-- END HEADER INNER -->
	</div>
	<!-- END HEADER -->

	<!-- BEGIN CONTAINER -->
        <div class="page-container">
            <!-- BEGIN SIDEBAR -->
            <div class="page-sidebar-wrapper">
                <!-- BEGIN SIDEBAR -->
                <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                <!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                <div class="page-sidebar navbar-collapse collapse">
                    <!-- BEGIN SIDEBAR MENU -->
                    <!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
                    <!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
                    <!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
                    <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                    <!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
                    <!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                    <ul class="page-sidebar-menu  page-header-fixed " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200" style="padding-top: 20px">
                        <!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
                        <li class="sidebar-toggler-wrapper hide">
                            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                            <div class="sidebar-toggler"> </div>
                            <!-- END SIDEBAR TOGGLER BUTTON -->
                        </li>
                        <!-- DOC: To remove the search box from the sidebar you just need to completely remove the below "sidebar-search-wrapper" LI element -->
                        <li class="sidebar-search-wrapper">
                            <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
                            <!-- DOC: Apply "sidebar-search-bordered" class the below search form to have bordered search box -->
                            <!-- DOC: Apply "sidebar-search-bordered sidebar-search-solid" class the below search form to have bordered & solid search box -->
                            <form class="sidebar-search  " action="page_general_search_3.html" method="POST">
                                <a href="javascript:;" class="remove">
                                    <i class="icon-close"></i>
                                </a>
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                        <a href="javascript:;" class="btn submit">
                                            <i class="icon-magnifier"></i>
                                        </a>
                                    </span>
                                </div>
                            </form>
                            <!-- END RESPONSIVE QUICK SEARCH FORM -->
                        </li>
                        <li class="nav-item start active open">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-home"></i>
                                <span class="title">首页</span>
                                <span class="selected"></span>
                            </a>

                        </li>
                        <li class="heading">
                            <h3 class="uppercase">酒店管理</h3>
                        </li>
                        <li class="nav-item  ">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-diamond"></i>
                                <span class="title">客房管理</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-menu">
                                <li class="nav-item  ">
                                    <a href="/hotel/backRoom" class="nav-link ">
                                        <span class="title">客房</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_general.html" class="nav-link ">
                                        <span class="title">客房种类</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_buttons.html" class="nav-link ">
                                        <span class="title">Buttons</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_confirmations.html" class="nav-link ">
                                        <span class="title">Popover Confirmations</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_icons.html" class="nav-link ">
                                        <span class="title">Font Icons</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_socicons.html" class="nav-link ">
                                        <span class="title">Social Icons</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_typography.html" class="nav-link ">
                                        <span class="title">Typography</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_tabs_accordions_navs.html" class="nav-link ">
                                        <span class="title">Tabs, Accordions & Navs</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_timeline.html" class="nav-link ">
                                        <span class="title">Timeline</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_tree.html" class="nav-link ">
                                        <span class="title">Tree View</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link nav-toggle">
                                        <span class="title">Page Progress Bar</span>
                                        <span class="arrow"></span>
                                    </a>
                                    <ul class="sub-menu">
                                        <li class="nav-item ">
                                            <a href="ui_page_progress_style_1.html" class="nav-link "> Flash </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="ui_page_progress_style_2.html" class="nav-link "> Big Counter </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_blockui.html" class="nav-link ">
                                        <span class="title">Block UI</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_bootstrap_growl.html" class="nav-link ">
                                        <span class="title">Bootstrap Growl Notifications</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_notific8.html" class="nav-link ">
                                        <span class="title">Notific8 Notifications</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_toastr.html" class="nav-link ">
                                        <span class="title">Toastr Notifications</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_bootbox.html" class="nav-link ">
                                        <span class="title">Bootbox Dialogs</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_alerts_api.html" class="nav-link ">
                                        <span class="title">Metronic Alerts API</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_session_timeout.html" class="nav-link ">
                                        <span class="title">Session Timeout</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_idle_timeout.html" class="nav-link ">
                                        <span class="title">User Idle Timeout</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_modals.html" class="nav-link ">
                                        <span class="title">Modals</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_extended_modals.html" class="nav-link ">
                                        <span class="title">Extended Modals</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_tiles.html" class="nav-link ">
                                        <span class="title">Tiles</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_datepaginator.html" class="nav-link ">
                                        <span class="title">Date Paginator</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="ui_nestable.html" class="nav-link ">
                                        <span class="title">Nestable List</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item  ">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-puzzle"></i>
                                <span class="title">订单管理</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-menu">
                                <li class="nav-item  ">
                                    <a href="components_date_time_pickers.html" class="nav-link ">
                                        <span class="title">Date & Time Pickers</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_color_pickers.html" class="nav-link ">
                                        <span class="title">Color Pickers</span>
                                        <span class="badge badge-danger">2</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_select2.html" class="nav-link ">
                                        <span class="title">Select2 Dropdowns</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_bootstrap_select.html" class="nav-link ">
                                        <span class="title">Bootstrap Select</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_multi_select.html" class="nav-link ">
                                        <span class="title">Multi Select</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_bootstrap_select_splitter.html" class="nav-link ">
                                        <span class="title">Select Splitter</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_typeahead.html" class="nav-link ">
                                        <span class="title">Typeahead Autocomplete</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_bootstrap_tagsinput.html" class="nav-link ">
                                        <span class="title">Bootstrap Tagsinput</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_bootstrap_switch.html" class="nav-link ">
                                        <span class="title">Bootstrap Switch</span>
                                        <span class="badge badge-success">6</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_bootstrap_maxlength.html" class="nav-link ">
                                        <span class="title">Bootstrap Maxlength</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_bootstrap_fileinput.html" class="nav-link ">
                                        <span class="title">Bootstrap File Input</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_bootstrap_touchspin.html" class="nav-link ">
                                        <span class="title">Bootstrap Touchspin</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_form_tools.html" class="nav-link ">
                                        <span class="title">Form Widgets & Tools</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_context_menu.html" class="nav-link ">
                                        <span class="title">Context Menu</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_editors.html" class="nav-link ">
                                        <span class="title">Markdown & WYSIWYG Editors</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_code_editors.html" class="nav-link ">
                                        <span class="title">Code Editors</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_ion_sliders.html" class="nav-link ">
                                        <span class="title">Ion Range Sliders</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_noui_sliders.html" class="nav-link ">
                                        <span class="title">NoUI Range Sliders</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="components_knob_dials.html" class="nav-link ">
                                        <span class="title">Knob Circle Dials</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item  ">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-settings"></i>
                                <span class="title">客户管理</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-menu">
                                <li class="nav-item  ">
                                    <a href="form_controls.html" class="nav-link ">
                                        <span class="title">Bootstrap Form
                                            <br>Controls</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_controls_md.html" class="nav-link ">
                                        <span class="title">Material Design
                                            <br>Form Controls</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_validation.html" class="nav-link ">
                                        <span class="title">Form Validation</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_validation_states_md.html" class="nav-link ">
                                        <span class="title">Material Design
                                            <br>Form Validation States</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_validation_md.html" class="nav-link ">
                                        <span class="title">Material Design
                                            <br>Form Validation</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_layouts.html" class="nav-link ">
                                        <span class="title">Form Layouts</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_input_mask.html" class="nav-link ">
                                        <span class="title">Form Input Mask</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_editable.html" class="nav-link ">
                                        <span class="title">Form X-editable</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_wizard.html" class="nav-link ">
                                        <span class="title">Form Wizard</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_icheck.html" class="nav-link ">
                                        <span class="title">iCheck Controls</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_image_crop.html" class="nav-link ">
                                        <span class="title">Image Cropping</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_fileupload.html" class="nav-link ">
                                        <span class="title">Multiple File Upload</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="form_dropzone.html" class="nav-link ">
                                        <span class="title">Dropzone File Upload</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item  ">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-bulb"></i>
                                <span class="title">服务管理</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-menu">
                                <li class="nav-item  ">
                                    <a href="elements_steps.html" class="nav-link ">
                                        <span class="title">Steps</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="elements_lists.html" class="nav-link ">
                                        <span class="title">Lists</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="elements_ribbons.html" class="nav-link ">
                                        <span class="title">Ribbons</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item  ">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-briefcase"></i>
                                <span class="title">员工管理</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-menu">
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link nav-toggle">
                                        <span class="title">Static Tables</span>
                                        <span class="arrow"></span>
                                    </a>
                                    <ul class="sub-menu">
                                        <li class="nav-item ">
                                            <a href="table_static_basic.html" class="nav-link "> Basic Tables </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_static_responsive.html" class="nav-link "> Responsive Tables </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link nav-toggle">
                                        <span class="title">Datatables</span>
                                        <span class="arrow"></span>
                                    </a>
                                    <ul class="sub-menu">
                                        <li class="nav-item ">
                                            <a href="table_datatables_managed.html" class="nav-link "> Managed Datatables </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_datatables_buttons.html" class="nav-link "> Buttons Extension </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_datatables_colreorder.html" class="nav-link "> Colreorder Extension </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_datatables_rowreorder.html" class="nav-link "> Rowreorder Extension </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_datatables_scroller.html" class="nav-link "> Scroller Extension </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_datatables_fixedheader.html" class="nav-link "> FixedHeader Extension </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_datatables_responsive.html" class="nav-link "> Responsive Extension </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_datatables_editable.html" class="nav-link "> Editable Datatables </a>
                                        </li>
                                        <li class="nav-item ">
                                            <a href="table_datatables_ajax.html" class="nav-link "> Ajax Datatables </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <!-- END SIDEBAR MENU -->
                    <!-- END SIDEBAR MENU -->
                </div>
                <!-- END SIDEBAR -->
            </div>
            <!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">
				<!-- BEGIN PAGE HEADER-->
				<!-- BEGIN PAGE BAR -->
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="index.html">Home</a> <i class="fa fa-circle"></i>
						</li>
						<li><span>Dashboard</span></li>
					</ul>
					<div class="btn-group pull-right"></div>
				</div>
				<!-- END PAGE BAR -->
				<!-- BEGIN PAGE TITLE-->
				<h3 class="page-title">
					Dashboard <small>dashboard & statistics</small>
				</h3>
				<!-- END PAGE TITLE-->
				<!-- END PAGE HEADER-->
				<!-- BEGIN DASHBOARD STATS 1-->
				<div class="row">
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<div class="dashboard-stat blue">
							<div class="visual">
								<i class="fa fa-comments"></i>
							</div>
							<div class="details">
								<div class="number">
									<span data-counter="counterup" data-value="1349">0</span>
								</div>
								<div class="desc">New Feedbacks</div>
							</div>
							<a class="more" href="javascript:;"> View more <i
								class="m-icon-swapright m-icon-white"></i>
							</a>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<div class="dashboard-stat red">
							<div class="visual">
								<i class="fa fa-bar-chart-o"></i>
							</div>
							<div class="details">
								<div class="number">
									<span data-counter="counterup" data-value="12,5">0</span>M$
								</div>
								<div class="desc">Total Profit</div>
							</div>
							<a class="more" href="javascript:;"> View more <i
								class="m-icon-swapright m-icon-white"></i>
							</a>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<div class="dashboard-stat green">
							<div class="visual">
								<i class="fa fa-shopping-cart"></i>
							</div>
							<div class="details">
								<div class="number">
									<span data-counter="counterup" data-value="549">0</span>
								</div>
								<div class="desc">New Orders</div>
							</div>
							<a class="more" href="javascript:;"> View more <i
								class="m-icon-swapright m-icon-white"></i>
							</a>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<div class="dashboard-stat purple">
							<div class="visual">
								<i class="fa fa-globe"></i>
							</div>
							<div class="details">
								<div class="number">
									+ <span data-counter="counterup" data-value="89"></span>%
								</div>
								<div class="desc">Brand Popularity</div>
							</div>
							<a class="more" href="javascript:;"> View more <i
								class="m-icon-swapright m-icon-white"></i>
							</a>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
				<!-- END DASHBOARD STATS 1-->
				<div class="row">
					<div class="col-md-6 col-sm-6">
						<!-- BEGIN PORTLET-->
						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="caption">
									<i class="icon-bar-chart font-green"></i> <span
										class="caption-subject font-green bold uppercase">Site
										Visits</span> <span class="caption-helper">weekly stats...</span>
								</div>
								<div class="actions">
									<div class="btn-group btn-group-devided" data-toggle="buttons">
										<label class="btn red btn-outline btn-circle btn-sm active">
											<input type="radio" name="options" class="toggle"
											id="option1">New
										</label> <label class="btn red btn-outline btn-circle btn-sm">
											<input type="radio" name="options" class="toggle"
											id="option2">Returning
										</label>
									</div>
								</div>
							</div>
							<div class="portlet-body">
								<div id="site_statistics_loading">
									<img src="resource/back/assets/global/img/loading.gif"
										alt="loading" />
								</div>
								<div id="site_statistics_content" class="display-none">
									<div id="site_statistics" class="chart"></div>
								</div>
							</div>
						</div>
						<!-- END PORTLET-->
					</div>
					<div class="col-md-6 col-sm-6">
						<!-- BEGIN PORTLET-->
						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="caption">
									<i class="icon-share font-red-sunglo hide"></i> <span
										class="caption-subject font-red-sunglo bold uppercase">Revenue</span>
									<span class="caption-helper">monthly stats...</span>
								</div>
								<div class="actions">
									<div class="btn-group">
										<a href=""
											class="btn dark btn-outline btn-circle btn-sm dropdown-toggle"
											data-toggle="dropdown" data-hover="dropdown"
											data-close-others="true"> Filter Range <span
											class="fa fa-angle-down"> </span>
										</a>
										<ul class="dropdown-menu pull-right">
											<li><a href="javascript:;"> Q1 2014 <span
													class="label label-sm label-default"> past </span>
											</a></li>
											<li><a href="javascript:;"> Q2 2014 <span
													class="label label-sm label-default"> past </span>
											</a></li>
											<li class="active"><a href="javascript:;"> Q3 2014 <span
													class="label label-sm label-success"> current </span>
											</a></li>
											<li><a href="javascript:;"> Q4 2014 <span
													class="label label-sm label-warning"> upcoming </span>
											</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="portlet-body">
								<div id="site_activities_loading">
									<img src="resource/back/assets/global/img/loading.gif"
										alt="loading" />
								</div>
								<div id="site_activities_content" class="display-none">
									<div id="site_activities" style="height: 228px;"></div>
								</div>
								<div style="margin: 20px 0 10px 30px">
									<div class="row">
										<div class="col-md-3 col-sm-3 col-xs-6 text-stat">
											<span class="label label-sm label-success"> Revenue: </span>
											<h3>$13,234</h3>
										</div>
										<div class="col-md-3 col-sm-3 col-xs-6 text-stat">
											<span class="label label-sm label-info"> Tax: </span>
											<h3>$134,900</h3>
										</div>
										<div class="col-md-3 col-sm-3 col-xs-6 text-stat">
											<span class="label label-sm label-danger"> Shipment: </span>
											<h3>$1,134</h3>
										</div>
										<div class="col-md-3 col-sm-3 col-xs-6 text-stat">
											<span class="label label-sm label-warning"> Orders: </span>
											<h3>235090</h3>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- END PORTLET-->
					</div>
				</div>
			</div>
			<!-- END CONTENT BODY -->
		</div>
		<!-- END CONTENT -->

        </div>
        <!-- END CONTAINER -->
<!-- BEGIN CORE PLUGINS -->
<script src="resource/back/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="resource/back/assets/global/plugins/counterup/jquery.waypoints.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/counterup/jquery.counterup.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/amcharts/amcharts.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/amcharts/serial.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/amcharts/pie.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/amcharts/radar.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/amcharts/themes/light.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/amcharts/themes/patterns.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/amcharts/themes/chalk.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/ammap/ammap.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/ammap/maps/js/worldLow.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/amcharts/amstockcharts/amstock.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/jquery-easypiechart/jquery.easypiechart.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="resource/back/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="resource/back/assets/pages/scripts/dashboard.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script src="resource/back/assets/layouts/layout/scripts/layout.min.js" type="text/javascript"></script>
<script src="resource/back/assets/layouts/layout/scripts/demo.min.js" type="text/javascript"></script>
<!-- END THEME LAYOUT SCRIPTS -->
</body>
</html>