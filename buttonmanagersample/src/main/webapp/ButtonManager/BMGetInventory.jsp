<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PayPal SDK - BMGetInventory</title>

</head>
<body>
	<img src="https://devtools-paypal.com/image/bdg_payments_by_pp_2line.png" alt="PAYMENTS BY PayPal" />
	<div id="wrapper">
		<div id="header">
			<h3>BMGetInventory</h3>
			<div id="apidetails">
				<p>BMGetInventory API operation is used to determine the
					inventory levels and other inventory-related information for a
					button and menu items associated with the button</p>
			</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">HostedID*(Get hosted ID via <a href='BMCreateButton'>BMCreateButton</a>)</div>
					<div class="param_value">
						<input type="text" name="hostedID" value="" size="50"
							maxlength="260" />
					</div>
				</div>

				<div class="submit">
					<input type="submit" name="BMGetInventoryBtn"
						value="BMGetInventory" /><br />
				</div>
				<a href="../index.html">Home</a>
			</div>
		</form>
		<div id="relatedcalls">
			See also
			<ul>
				<li><a href="BMCreateButton">BMCreateButton</a>
				</li>
				<li><a href="BMUpdateButton">BMUpdateButton</a></li>
				<li><a href="BMButtonSearch">BMButtonSearch</a></li>
				<li><a href="BMGetButtonDetails">BMGetButtonDetails</a></li>
				<li><a href="BMManageButtonStatus">BMManageButtonStatus</a></li>
				<li><a href="BMSetInventory">BMSetInventory</a></li>
			</ul>
		</div>
	</div>
</body>
</html>