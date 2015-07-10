package com.mabe.wrappers;

public class WResponse {
	
	//String constants for OK
	public final static String OK = "Ok";
	public final static String ID_OK = "00";
	public final static String MESSAGE_OK = "Todo Correcto";
	
	//String constants for OK_REGISTRO
	public final static String OK_REGISTRO = "RegistroOK";
	public final static String ID_OK_REGISTRO = "00";
	public final static String MESSAGE_OK_REGISTRO = "Exito. Su usuario ha quedado registrado";
	
	//String constants for OK_REGISTRO
	public final static String OK_TARJETA = "PagoTarjetaOK";
	public final static String ID_OK_TARJETA = "00";
	public final static String MESSAGE_OK_TARJETA = "Pago con Tarjeta";
	
	//String constants for OK_REGISTRO
	public final static String OK_PAYPAL = "PagoPaypalOK";
	public final static String ID_OK_PAYPAL = "00";
	public final static String MESSAGE_OK_PAYPAL = "Pago con Paypal";
	
	//String constants for OK_PEDIDO
	public final static String OK_PEDIDO = "PedidoOK";
	public final static String ID_OK_PEDIDO = "00";
	public final static String MESSAGE_OK_PEDIDO = "Pedido";
	
	//String login OK
	public final static String OK_LOGIN = "LoginOk";
	public final static String ID_OK_LOGIN = "00";
	public final static String MESSAGE_OK_LOGIN = "¡ Bienvenido !";
	
	//String login Error Password
	public final static String ERROR_LOGIN_PASS = "wrongpass";
	public final static String ID_ERROR_LOGIN_PASS= "07";
	public final static String MESSAGE_ERROR_LOGIN_PASS = "Password Incorrecto.";
	
	//String login Error user
	public final static String ERROR_LOGIN_USER = "usuarionoexiste";
	public final static String ID_ERROR_LOGIN_USER= "08";
	public final static String MESSAGE_ERROR_LOGIN_USER = "Usuario inexistente.";
	
	//String login already loged
	public final static String ERROR_LOGIN_LOG = "sesionabierta";
	public final static String ID_ERROR_LOGIN_LOG= "09";
	public final static String MESSAGE_ERROR_LOGIN_LOG = "Ya has iniciado sesión en otro lugar.";
	
	//String login already loged
	public final static String OK_LOGOUT = "LogoutOk";
	public final static String ID_OK_LOGOUT= "00";
	public final static String MESSAGE_OK_LOGOUT = "Has cerrado sesion correctamente.";
	
	//
	public final static String OK_GETITEMS = "OKgetitems";
	public final static String ID_OK_GETITEMS= "00";
	public final static String MESSAGE_OK_GETITEMS = "Lista de productos.";
	
	//
	public final static String ERROR_NOHAY_ITEMS = "NoHayItems";
	public final static String ID_ERROR_NOHAY_ITEMS= "13";
	public final static String MESSAGE_ERROR_NOHAY_ITEMS = "No hay productos registrados en esta categoría.";
	
	//String login already loged
	public final static String OK_ADDITEM = "ItemAddedOk";
	public final static String ID_OK_ADDITEM= "00";
	public final static String MESSAGE_OK_ADDITEM = "Se ha agregado correctamente.";
	
	//String Session Timeout
	public final static String ERROR_SESSION_TIMEOUT = "SessionTimeOut";
	public final static String ID_ERROR_SESSION_TIMEOUT= "11";
	public final static String MESSAGE_ERROR_SESSION_TIMEOUT = "El tiempo de la sesion se ha terminado.";
	
	//String No login 
	public final static String ERROR_NO_LOGIN = "NoLogin";
	public final static String ID_ERROR_NO_LOGIN= "12";
	public final static String MESSAGE_ERROR_NO_LOGIN = "No has iniciado sesion, para esta operacion.";
	
	//String email existente
	public final static String ERROR_REGISTRO_EMAIL = "emailyaexiste";
	public final static String ID_ERROR_REGISTRO_EMAIL= "14";
	public final static String MESSAGE_ERROR_REGISTRO_EMAIL = "El email de usuario ya existe.";
		
	
	//String contants for Error, user already exists
	public final static String ERROR_REGISTRO = "ErrorRegistroUsuarioExistente";
	public final static String ID_ERROR_REGISTRO = "02";
	public final static String MESSAGE_ERROR_REGISTRO= "El nombre de Usuario ya existe";
	
	//String contants for Error
	public final static String ERROR = "Error";
	public final static String ID_INTERNAL_ERROR = "100";
	public final static String MESSAGE_INTERNAL_ERROR = "Error interno del servidor";
	
	//String validate OK
	public final static String OK_VALIDA = "OkValida";
	public final static String ID_OK_VALIDA= "00";
	public final static String MESSAGE_OK_VALIDA = "Validacion Ok.";
	
	//String email OK
	public final static String OK_EMAIL = "OkEmail";
	public final static String ID_OK_EMAIL= "00";
	public final static String MESSAGE_OK_EMAIL = "El correo de recuperación de password ha sido enviado satisfactoriamente.";
	
	//String no email registered
	public final static String ERROR_NOEAMIL = "NoUserByEmail";
	public final static String ID_ERROR_NOEAMIL= "15";
	public final static String MESSAGE_ERROR_NOEAMIL = "El email no está registrado.";
	
	//String no username registered
	public final static String ERROR_NOUSERNAME = "NoUserByUserName";
	public final static String ID_ERROR_NOUSERNAME= "16";
	public final static String MESSAGE_ERROR_NOUSERNAME = "Nombre de usuario no registado.";
	
	//String agregar Abarrote OK
	public final static String OK_ADD_ABA = "OkAddAba";
	public final static String ID_OK_ADD_ABA= "00";
	public final static String MESSAGE_OK_ADD_ABA = "Has agregado un Abarrote/Servicio.";
	
	//String construir carrito Abarrote OK
	public final static String OK_CART = "OkBC";
	public final static String ID_OK_CART = "00";
	public final static String MESSAGE_OK_CART = "Has creado el carrito decompras.";
	
	//String construir carrito de compras OK
	public final static String OK_DCART = "OkDC";
	public final static String ID_OK_DCART = "00";
	public final static String MESSAGE_OK_DCART = "Has eliminado un producto del carrito de compras.";
	
	//String construir carrito de compras OK
	public final static String OK_OCART = "OkOC";
	public final static String ID_OK_ODCART = "00";
	public final static String MESSAGE_OK_OCART = "Has cambiado o sobrescrito la cantidad de un producto.";
	
	//String actualizar cliente de compras OK
	public final static String OK_UPDATE = "OkUpdate";
	public final static String ID_OK_UPDATE = "00";
	public final static String MESSAGE_OK_UPDATE = "Has actualizado tu información.";
	
	//String información del cliente que será actualizado OK
	public final static String OK_TOUPDATE = "OkToUpdate";
	public final static String ID_OK_TOUPDATE = "00";
	public final static String MESSAGE_OK_TOUPDATE = "Información del cliente que será actualizado.";
	
	//String ubicación de cliente agregada correctamente OK
	public final static String OK_LOCATION = "OkLoc";
	public final static String ID_OK_LOCATION = "00";
	public final static String MESSAGE_OK_LOCATION = "Ubicación agregada corréctamente.";
	
	//String obtener ubicaciones del cliente
	public final static String OK_GETLOCATION = "OkLoc";
	public final static String ID_OK_GETLOCATION = "00";
	public final static String MESSAGE_OK_GETLOCATION= "Lista de ubicaciones.";
	
	//String obtener ubicaciones del cliente
	public final static String ERROR_NOHAYUBICACIONES = "NoUbi";
	public final static String ID_ERROR_NOHAYUBICACIONES = "17";
	public final static String MESSAGE_ERROR_NOHAYUBICACIONES= "No hay ubicaciones registradas.";
	
	//String obtener ubicaciones del cliente
	public final static String OK_DELETEUBI = "DeleteUbi";
	public final static String ID_OK_DELETEUBI = "00";
	public final static String MESSAGE_OK_DELETEUBI= "Borraste una ubicación.";
	
	//String actualziar ubicaciones del cliente
	public final static String OK_UPDATE_UBI = "UpdateUbi";
	public final static String ID_OK_UPDATE_UBI = "00";
	public final static String MESSAGE_OK_UPDATE_UBI= "Actualizaste una ubicación con éxito.";
	
	//String actualziar ubicaciones del cliente
	public final static String OK_SERUSERCOR = "OkUserCoords";
	public final static String ID_OK_SERUSERCOR = "00";
	public final static String MESSAGE_OK_SERUSERCOR= "Cordenadas del cliente establecidas.";
	
	public final static String OK_MCOORDS = "OkMensajeroCoords";
	public final static String ID_OK_MCOORDS = "00";
	public final static String MESSAGE_OK_MCOORDS= "Cordenadas del mensajero establecidas.";
	
	public final static String OK_GETMCOORDS = "OkGETMensajeroCoords";
	public final static String ID_OK_GETMCOORDS = "00";
	public final static String MESSAGE_OK_GETMCOORDS= "Estas son las coordenadas del mensajero.";
	
	public final static String OK_GETUCOORDS = "OkGETUserCoords";
	public final static String ID_OK_GETUCOORDS = "00";
	public final static String MESSAGE_OK_GETUCOORDS= "Estas son las coordenadas del cliente.";
	
	public final static String OK_HAS_ORDER = "hasOrder";
	public final static String ID_OK_HAS_ORDER = "00";
	public final static String MESSAGE_OK_HAS_ORDER= "El mensajero tiene un pedido.";
	
	public final static String ERROR_HAS_ORDER = "hasntOrder";
	public final static String ID_ERROR_HAS_ORDER = "18";
	public final static String MESSAGE_ERROR_HAS_ORDER= "No hay pedidos.";
	
	public final static String OK_RECHAZAP = "rechazaP";
	public final static String ID_OK_RECHAZAP = "00";
	public final static String MESSAGE_OK_RECHAZAP= "El mensajero ha rechazado el pedido.";
	
	public final static String OK_LOGIN_MENSAJERO = "LoginMensajeroOk";
	public final static String ID_OK_LOGIN_MENSAJERO = "00";
	public final static String MESSAGE_OK_LOGIN_MENSAJERO = "¡ Bienvenido !";
	
	public final static String ERROR_MENSAJERO_NOEXISTE = "mensajeronoexiste";
	public final static String ID_ERROR_MENSAJERO_NOEXISTE = "19";
	public final static String MESSAGE_ERROR_MENSAJERO_NOEXISTE = "El mensajero no ha sido registrado.";
	
	public final static String OK_PUSHKEY = "pushkeyOk";
	public final static String ID_OK_PUSHKEY = "00";
	public final static String MESSAGE_OK_PUSHKEY = "Push key Ok";
	
	public final static String ERROR_SIN_MENSAJEROS = "noMensajero";
	public final static String ID_ERROR_SIN_MENSAJEROS = "20";
	public final static String MESSAGE_ERROR_SIN_MENSAJEROS = "No hay mensajeros disponibles.";
	
	public final static String OK_ACEPTAPEDIDO = "pedidoAceptado";
	public final static String ID_OK_ACEPTAPEDIDO = "00";
	public final static String MESSAGE_OK_ACEPTAPEDIDO = "Pedido Aceptado.";
	
	public final static String OK_PEDIDO_ENTREGADO = "pedidoEntregado";
	public final static String ID_OK_PEDIDO_ENTREGADO = "00";
	public final static String MESSAGE_OK_PEDIDO_ENTREGADO = "Pedido Entregado.";
	
	public final static String OK_CANCELA_PEDIDO = "cancelaPedido";
	public final static String ID_OK_CANCELA_PEDIDO = "00";
	public final static String MESSAGE_OK_CANCELA_PEDIDO = "Pedido Cancelado.";
	
	public final static String OK_SET_TARJETA = "setTarjeta";
	public final static String ID_OK_SET_TARJETA = "00";
	public final static String MESSAGE_OK_SET_TARJETA = "Tarjeta establecida.";
	
	public final static String OK_SET_RCOMMENT = "rComment";
	public final static String ID_OK_SET_RCOMMENT = "00";
	public final static String MESSAGE_OK_SET_RCOMMENT = "Exito al guardar tu comentario.";
	
	public final static String OK_ONLINEM = "onlineM";
	public final static String ID_OK_ONLINEM = "00";
	public final static String MESSAGE_OK_ONLINEM = "Mensajero en línea.";
	
	public final static String OK_PASSWORD_RES = "resPass";
	public final static String ID_OK_PASSWORD_RES = "00";
	public final static String MESSAGE_OK_PASSWORD_RES = "Password reestablecido.";
	
	public final static String OK_OFFLINEM = "offlineM";
	public final static String ID_OK_OFFLINEM = "00";
	public final static String MESSAGE_OK_OFFLINEM = "Mensajero desconectado.";
	
	public final static String OK_TIENESPEDIDO = "tienesunpedido";
	public final static String ID_OK_TIENESPEDIDO = "00";
	public final static String MESSAGE_OK_TIENESPEDIDO = "Tienes un pedido.";
	
	public final static String ERROR_NOTIENESPEDIDO = "noTienesunpedido";
	public final static String ID_ERROR_NOTIENESPEDIDO = "21";
	public final static String MESSAGE_ERROR_NOTIENESPEDIDO = "No tienes pedido.";
	
	public final static String OK_PEDIDO_ENCAMINO = "tienesunpedidoencamino";
	public final static String ID_OK_PEDIDO_ENCAMINO = "00";
	public final static String MESSAGE_OK_PEDIDO_ENCAMINO = "Tienes un pedido en camino.";
	
	public final static String OK_EVALUACION = "evaluacionOk";
	public final static String ID_OK_EVALUACION = "00";
	public final static String MESSAGE_OK_EVALUACION = "Has evaluado corréctamente al mensajero.";
	
	public final static String ERROR_NO_HAY_PEDIDO = "noPedido";
	public final static String ID_ERROR_NO_HAY_PEDIDO = "22";
	public final static String MESSAGE_ERROR_NO_HAY_PEDIDO = "No has generado pedido alguno.";
	
	public final static String ERROR_NO_EXISTEN_CLIENTES = "noClientes";
	public final static String ID_ERROR_NO_EXISTEN_CLIENTES = "23";
	public final static String MESSAGE_ERROR_NO_EXISTEN_CLIENTES = "No hay clientes registrados con ese email.";
	
	public final static String ERROR_NO_NUMERO_TARJETA = "noNumeroTarjeta";
	public final static String ID_ERROR_NO_NUMERO_TARJETA = "24";
	public final static String MESSAGE_ERROR_NO_NUMERO_TARJETA = "No tienes dado de alta un número de tarjeta.";
	
	public final static String OK_TARIFA_LISTO = "tarifaListo";
	public final static String ID_OK_TARIFA_LISTO = "00";
	public final static String MESSAGE_OK_TARIFA_LISTO = "El monto total está completo.";
	
	public final static String ERROR_TARIFA_FALTAN = "tarifaFaltan";
	public final static String ID_ERROR_TARIFA_FALTAN = "25";
	public final static String MESSAGE_ERROR_TARIFA_FALTAN = "Faltan más personas para completar el monto total.";
	
	public final static String OK_DIVIDE_EMAIL = "OkDivideEamil";
	public final static String ID_OK_DIVIDE_EMAIL = "00";
	public final static String MESSAGE_OK_DIVIDE_EMAIL = "Puedes seguir con la division de tarifa, si existe el email en la DB.";
	
	public final static String ERROR_EMAIL_YA= "yaSeAgrego";
	public final static String ID_ERROR_EMAIL_YA = "26";
	public final static String MESSAGE_ERROR_EMAIL_YA = "Este email ya existe en la división de tarifas, favor de agregar otro.";
	
	public final static String OK_COORDS = "OkCoords";
	public final static String ID_OK_COORDS = "00";
	public final static String MESSAGE_OK_COORDS = "Coordenadas Ok.";
	
	public final static String ERROR_MENSAJERO_RECHAZO= "pedidoRechazado";
	public final static String ID_ERROR_MENSAJERO_RECHAZO = "27";
	public final static String MESSAGE_ERROR_MENSAJERO_RECHAZO = "El mensajero rechazó el pedido.";
	
	public final static String OK_REASIGNA= "pedidoReasignado";
	public final static String ID_OK_REASIGNA = "00";
	public final static String MESSAGE_OK_REASIGNA = "El pedido ha sido reasignado.";
	
	public final static String ERROR_NO_HUBORESPUESTA = "noMensajeroResponse";
	public final static String ID_ERROR_NO_HUBORESPUESTA = "28";
	public final static String MESSAGE_ERROR_NO_HUBORESPUESTA = "El mensajero no ha respondido.";
	
	public final static String ERROR_NO_CANCELA = "noCancela";
	public final static String ID_ERROR_NO_CANCELA = "29";
	public final static String MESSAGE_ERROR_NO_CANCELA = "No se puede cancelar el pedido.";
	
	public final static String ERROR_NO_HAS_RESPONDIDOATIEMPO = "mensajeroTimeout";
	public final static String ID_ERROR_NO_HAS_RESPONDIDOATIEMPO = "30";
	public final static String MESSAGE_ERROR_NO_HAS_RESPONDIDOATIEMPO = "El tiempo que tenías para responder se ha terminado.";
	
	public final static String OK_FEEDBACK= "feedbackOK";
	public final static String ID_OK_FEEDBACK = "00";
	public final static String MESSAGE_OK_FEEDBACK = "Feedback Ok.";
	
	public final static String ERROR_PEDIDO_ESPERANDO = "pedidoEsperando";
	public final static String ID_ERROR_PEDIDO_ESPERANDO = "31";
	public final static String MESSAGE_ERROR_PEDIDO_ESPERANDO = "El pedido se encuentr esperando.";
	
	public final static String OK_GETPEDIDOS_ENCAMINO= "pedidosencaminoOk";
	public final static String ID_OK_GETPEDIDOS_ENCAMINO = "00";
	public final static String MESSAGE_OK_GETPEDIDOS_ENCAMINO = "Pedidos en camino.";
	
	public final static String OK_LOGIN_ADMIN = "OkLoginAdmin";
	public final static String ID_OK_LOGIN_ADMIN = "00";
	public final static String MESSAGE_OK_LOGIN_ADMIN = "Ok login admin.";
	
	public final static String OK_DELETE_MENSAJERO = "deleteMensajeroOk";
	public final static String ID_OK_DELETE_MENSAJERO = "00";
	public final static String MESSAGE_OK_DELETE_MENSAJERO = "Ok mensajero eliminiado.";
	
	public final static String OK_ALL_COORDS = "allCoordsOk";
	public final static String ID_OK_ALL_COORDS = "00";
	public final static String MESSAGE_OK_ALL_COORDS = "Todas las coordenadas.";
	
	public final static String ERROR_NO_CRITERIO = "noCriteria";
	public final static String ID_ERROR_NO_CRITERIO = "32";
	public final static String MESSAGE_ERROR_NO_CRITERIO = "No pusiste un criterio de consulta.";
	
	public final static String OK_DISP_COORDS = "dispCoordsOk";
	public final static String ID_OK_DISP_COORDS = "00";
	public final static String MESSAGE_OK_DISP_COORDS = "Coordenadas con base en disponibilidad.";
	
	public final static String ERROR_MENSAJERO_EXISTENTE = "mensajeroExistente";
	public final static String ID_ERROR_MENSAJERO_EXISTENTE = "33";
	public final static String MESSAGE_ERROR_MENSAJERO_EXISTENTE = "El mensajero ya existe.";
	
	public final static String OK_DELETE_PRODUCTO = "deleteProductoOk";
	public final static String ID_OK_DELETE_PRODUCTO = "00";
	public final static String MESSAGE_OK_DELETE_PRODUCTO = "Ok producto eliminado.";
	
	public final static String OK_REGISTRA_PRODUCTO = "registraProductoOk";
	public final static String ID_OK_REGISTRA_PRODUCTO = "00";
	public final static String MESSAGE_OK_REGISTRA_PRODUCTO = "Ok producto registrado.";
	
	public final static String OK_DIVISOR_DELETED = "divisorDeletedOk";
	public final static String ID_OK_DIVISOR_DELETED = "00";
	public final static String MESSAGE_OK_DIVISOR_DELETED = "Ok divisor eliminado.";
	
	public final static String ERROR_NO_EXISTE_ELEMENTO = "noExisteElemento";
	public final static String ID_ERROR_NO_EXISTE_ELEMENTO = "34";
	public final static String MESSAGE_ERROR_NO_EXISTE_ELEMENTO = "No existe este elemento.";
	
	public final static String OK_PUSH_INVITADO = "divisorDletedOk";
	public final static String ID_OK_PUSH_INVITADO = "00";
	public final static String MESSAGE_OK_PUSH_INVITADO = "Ok Push Invitados.";
	
	public final static String ERROR_NO_HAY_INVITADOS = "noInvitadoss";
	public final static String ID_ERROR_NO_HAY_INVITADOS = "35";
	public final static String MESSAGE_ERROR_NO_HAY_INVITADOS = "No hay invitados.";
	
	public final static String OK_ACEPTA_DIVISION = "aceptaDivisionOk";
	public final static String ID_OK_ACEPTA_DIVISION = "00";
	public final static String MESSAGE_OK_ACEPTA_DIVISION = "Ok acepta division.";
	
	public final static String OK_NO_ACEPTODIV = "noAceptaDivisionOk";
	public final static String ID_OK_NO_ACEPTODIV = "00";
	public final static String MESSAGE_OK_NO_ACEPTODIV = "No aceptó dividir la tarifa.";
	
	public final static String OK_GET_TELEMENTS = "getElementsOk";
	public final static String ID_OK_GET_TELEMENTS = "00";
	public final static String MESSAGE_OK_GET_TELEMENTS = "Items Ok.";
	
	public final static String OK_EMAILS_ACCEPTED = "emailsOk";
	public final static String ID_OK_EMAILS_ACCEPTED = "00";
	public final static String MESSAGE_OK_EMAILS_ACCEPTED = "Usuarios que han aceptado dividir tarifa.";
	
	public final static String ERROR_NO_HAN_ACEPTADO = "noHanAceptado";
	public final static String ID_ERROR_NO_HAN_ACEPTADO = "36";
	public final static String MESSAGE_ERROR_NO_HAN_ACEPTADO = "Faltan Usuarios.";
	
	public final static String OK_RECHAZA_SPLITBILL = "rechazaDivideTarifa";
	public final static String ID_OK_RECHAZA_SPLITBILL = "00";
	public final static String MESSAGE_OK_RECHAZA_SPLITBILL = "El usuario ha rechazado dividir tarifa.";
	
	public final static String OK_FALTAN_ACEPTAR_BILL = "faltanAceptar";
	public final static String ID_OK_FALTAN_ACEPTAR_BILL = "00";
	public final static String MESSAGE_OK_FALTAN_ACEPTAR_BILL = "Faltan clientes por aceptar la división de tarifa.";
	
	public WResponse() {
		
	}
	
	String[] splitBySpaces(String cadena){
		return cadena.split("\\|");
	}
}
