CREATE TABLE User (
	id_user int(11) NOT NULL AUTO_INCREMENT, 
	user_nickname varchar(100), 
	user_password varchar(100), 
	user_email varchar(100),
	apikey varchar(300),
	fecha_alta varchar(100), 
	user_x varchar(100), 
	user_y varchar(100),
	PRIMARY KEY (id_user)
);

CREATE TABLE Service (
	id_service int(11) NOT NULL AUTO_INCREMENT, 
	id_user int(11), 
	service_desc varchar(700), 
	service_address varchar(500),
	PRIMARY KEY (id_service)
);

CREATE TABLE Report (
	id_report int(11) NOT NULL AUTO_INCREMENT,
	id_user int(11), 
	id_service int(10), 
	report_desc varchar(500),
	PRIMARY KEY (id_report)
);


