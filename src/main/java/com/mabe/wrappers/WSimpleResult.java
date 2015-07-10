package com.mabe.wrappers;


public class WSimpleResult extends WSpaces{
	
	private WStatus status;

	
	public WSimpleResult(String statuscadena){
		super(statuscadena);
		createStatus();
	}

	public WStatus getStatus() {
		return status;
	}

	public void setStatus(WStatus status) {
		this.status = status;
	}

	private void createStatus(){
		if(separated != null && !separated.isEmpty()){			
			if(separated.get(0).equals("Error")||separated.get(0).equals("error")){
				String idError;
				if(separated.size() > 2) {
					idError = separated.get(1).trim();
					setStatus(new WStatus(separated.get(0).trim(),idError,separated.get(2).trim()));
				} else {
					idError = WResponse.ERROR_REGISTRO;
					setStatus(new WStatus(separated.get(0).trim(),idError,separated.get(1).trim()));
				}				
			}
			else
				if(separated.get(0).equals("Ok")||separated.get(0).equals("ok")||separated.get(0).equals("OK") ){
					setStatus(new WStatus(OK_REGISTRO,ID_OK_REGISTRO,MESSAGE_OK_REGISTRO));
				}
				else{
					if(separated.get(0).equals("UsuarioExiste")||separated.get(0).equals("usuarioexiste")||separated.get(0).equals("USUARIOEXISTE")){
					setStatus(new WStatus(ERROR_REGISTRO,ID_ERROR_REGISTRO,MESSAGE_ERROR_REGISTRO));
					}
					else{
						setStatus(new WStatus(ERROR,ID_INTERNAL_ERROR,MESSAGE_INTERNAL_ERROR));
					}
					if(separated.get(0).equals("emailexistente")){
						setStatus(new WStatus(ERROR_REGISTRO_EMAIL,ID_ERROR_REGISTRO_EMAIL,MESSAGE_ERROR_REGISTRO_EMAIL));
					}
				}
				if(separated.get(0).equals("PagoTarjetaOK")){
					setStatus(new WStatus(OK_TARJETA,ID_OK_TARJETA,MESSAGE_OK_TARJETA));
				}
				else{
					if(separated.get(0).equals("PagoPaypalOK")){
					setStatus(new WStatus(OK_PAYPAL,ID_OK_PAYPAL,MESSAGE_OK_PAYPAL));
					}
					/*else{
						setStatus(new WStatus(ERROR,ID_INTERNAL_ERROR,MESSAGE_INTERNAL_ERROR));
					}*/
				}
				if(separated.get(0).equals("PedidoOk")){
					setStatus(new WStatus(OK_PEDIDO,ID_OK_PEDIDO,MESSAGE_OK_PEDIDO));
				}
				if(separated.get(0).equals("LoginOk")){
					setStatus(new WStatus(OK_LOGIN,ID_OK_LOGIN,MESSAGE_OK_LOGIN));
				}else{
					if(separated.get(0).equals("wrongpass")){
						setStatus(new WStatus(ERROR_LOGIN_PASS,ID_ERROR_LOGIN_PASS,MESSAGE_ERROR_LOGIN_PASS));
					}else{
						if(separated.get(0).equals("usuarionoexiste")){
							setStatus(new WStatus(ERROR_LOGIN_USER,ID_ERROR_LOGIN_USER,MESSAGE_ERROR_LOGIN_USER));
						}else{
							if(separated.get(0).equals("sesionabierta")){
								setStatus(new WStatus(ERROR_LOGIN_LOG,ID_ERROR_LOGIN_LOG,MESSAGE_ERROR_LOGIN_LOG));
							}
						}
					}
				}
				if(separated.get(0).equals("LogoutOk")){
					setStatus(new WStatus(OK_LOGOUT, ID_OK_LOGOUT, MESSAGE_OK_LOGOUT));
				}
				if(separated.get(0).equals("SessionTimeOut")){
					setStatus(new WStatus(ERROR_SESSION_TIMEOUT, ID_ERROR_SESSION_TIMEOUT, MESSAGE_ERROR_SESSION_TIMEOUT));
				}
				if(separated.get(0).equals("NoLogin")){
					setStatus(new WStatus(ERROR_NO_LOGIN, ID_ERROR_NO_LOGIN, MESSAGE_ERROR_NO_LOGIN));
				}
				if(separated.get(0).equals("OkAddItem")){
					setStatus(new WStatus(OK_ADDITEM, ID_OK_ADDITEM, MESSAGE_OK_ADDITEM));
				}
				if(separated.get(0).equals("OkItems")){
					setStatus(new WStatus(OK_GETITEMS, ID_OK_GETITEMS, MESSAGE_OK_GETITEMS));
				}else{
					if(separated.get(0).equals("NoHay")){
						setStatus(new WStatus(ERROR_NOHAY_ITEMS, ID_ERROR_NOHAY_ITEMS, MESSAGE_ERROR_NOHAY_ITEMS));
					}
				}
				if(separated.get(0).equals("OkVal")){
					setStatus(new WStatus(OK_VALIDA, ID_OK_VALIDA, MESSAGE_OK_VALIDA));
				}
				if(separated.get(0).equals("OkEmail")){
					setStatus(new WStatus(OK_EMAIL, ID_OK_EMAIL, MESSAGE_OK_EMAIL));
				}else{
					if(separated.get(0).equals("NoUserByEmail")){
						setStatus(new WStatus(ERROR_NOEAMIL, ID_ERROR_NOEAMIL, MESSAGE_ERROR_NOEAMIL));
					}else{
						if(separated.get(0).equals("NoUserByUserName"))
							setStatus(new WStatus(ERROR_NOUSERNAME, ID_ERROR_NOUSERNAME, MESSAGE_ERROR_NOUSERNAME));
					}
				}
				if(separated.get(0).equals("OkAddAba")){
					setStatus(new WStatus(OK_ADD_ABA, ID_OK_ADD_ABA, MESSAGE_OK_ADD_ABA));
				}
				if(separated.get(0).equals("OkBC")){
					setStatus(new WStatus(OK_CART, ID_OK_CART, MESSAGE_OK_CART));
				}
				if(separated.get(0).equals("OkDC")){
					setStatus(new WStatus(OK_DCART, ID_OK_DCART, MESSAGE_OK_DCART));
				}
				if(separated.get(0).equals("OkGCI")){
					setStatus(new WStatus(OK_GETITEMS, ID_OK_GETITEMS, MESSAGE_OK_GETITEMS));
				}
				if(separated.get(0).equals("OkOC")){
					setStatus(new WStatus(OK_OCART, ID_OK_ODCART, MESSAGE_OK_OCART));
				}
				if(separated.get(0).equals("OkUpdate")){
					setStatus(new WStatus(OK_UPDATE, ID_OK_UPDATE, MESSAGE_OK_UPDATE));
				}
				if(separated.get(0).equals("OkToUp")){
					setStatus(new WStatus(OK_TOUPDATE, ID_OK_TOUPDATE, MESSAGE_OK_TOUPDATE));
				}
				if(separated.get(0).equals("OkLoc")){
					setStatus(new WStatus(OK_LOCATION, ID_OK_LOCATION, MESSAGE_OK_LOCATION));
				}
				if(separated.get(0).equals("OkGetU")){
					setStatus(new WStatus(OK_GETLOCATION, ID_OK_GETLOCATION, MESSAGE_OK_GETLOCATION));
				}
				if(separated.get(0).equals("NoUbi")){
					setStatus(new WStatus(ERROR_NOHAYUBICACIONES, ID_ERROR_NOHAYUBICACIONES, MESSAGE_ERROR_NOHAYUBICACIONES));
				}
				if(separated.get(0).equals("DeleteLocation")){
					setStatus(new WStatus(OK_DELETEUBI, ID_OK_DELETEUBI, MESSAGE_OK_DELETEUBI));
				}
				if(separated.get(0).equals("UpdateLocation")){
					setStatus(new WStatus(OK_UPDATE_UBI, ID_OK_UPDATE_UBI, MESSAGE_OK_UPDATE_UBI));
				}
				if(separated.get(0).equals("OkUserCoor")){
					setStatus(new WStatus(OK_UPDATE_UBI, ID_OK_UPDATE_UBI, MESSAGE_OK_UPDATE_UBI));
				}
				if(separated.get(0).equals("OkMCoords")){
					setStatus(new WStatus(OK_MCOORDS, ID_OK_MCOORDS, MESSAGE_OK_MCOORDS));
				}
				if(separated.get(0).equals("OkGetMC")){
					setStatus(new WStatus(OK_GETMCOORDS, ID_OK_GETMCOORDS, MESSAGE_OK_GETMCOORDS));
				}
				if(separated.get(0).equals("OkGetUC")){
					setStatus(new WStatus(OK_GETUCOORDS, ID_OK_GETUCOORDS, MESSAGE_OK_GETUCOORDS));
				}
				if(separated.get(0).equals("hasOrder")){
					setStatus(new WStatus(OK_HAS_ORDER, ID_OK_HAS_ORDER, MESSAGE_OK_HAS_ORDER));
				}else{
					if(separated.get(0).equals("hasntOrder")){
						setStatus(new WStatus(ERROR_HAS_ORDER, ID_ERROR_HAS_ORDER, MESSAGE_ERROR_HAS_ORDER));
					}
				}
				if(separated.get(0).equals("rechazaP")){
					setStatus(new WStatus(OK_RECHAZAP, ID_OK_RECHAZAP, MESSAGE_OK_RECHAZAP));
				}
				if(separated.get(0).equals("LoginMensajeroOk")){
					setStatus(new WStatus(OK_LOGIN_MENSAJERO, ID_OK_LOGIN_MENSAJERO, MESSAGE_OK_LOGIN_MENSAJERO));
				}else{
					if(separated.get(0).equals("mensajeronoexiste")){
						setStatus(new WStatus(ERROR_MENSAJERO_NOEXISTE, ID_ERROR_MENSAJERO_NOEXISTE, MESSAGE_ERROR_MENSAJERO_NOEXISTE));
					}
				}
				if(separated.get(0).equals("pushkeyOk")){
					setStatus(new WStatus(OK_PUSHKEY, ID_OK_PUSHKEY, MESSAGE_OK_PUSHKEY));
				}
				if(separated.get(0).equals("noMensajero")){
					setStatus(new WStatus(ERROR_SIN_MENSAJEROS, ID_ERROR_SIN_MENSAJEROS, MESSAGE_ERROR_SIN_MENSAJEROS));
				}
				if(separated.get(0).equals("pedidoOnRoad")){
					setStatus(new WStatus(OK_ACEPTAPEDIDO, ID_OK_ACEPTAPEDIDO, MESSAGE_OK_ACEPTAPEDIDO));
				}
				if(separated.get(0).equals("pedidoEntregado")){
					setStatus(new WStatus(OK_PEDIDO_ENTREGADO, ID_OK_PEDIDO_ENTREGADO, MESSAGE_OK_PEDIDO_ENTREGADO));
				}
				if(separated.get(0).equals("cancelaPedido")){
					setStatus(new WStatus(OK_CANCELA_PEDIDO, ID_OK_CANCELA_PEDIDO, MESSAGE_OK_CANCELA_PEDIDO));
				}
				if(separated.get(0).equals("setTarjeta")){
					setStatus(new WStatus(OK_SET_TARJETA, ID_OK_SET_TARJETA, MESSAGE_OK_SET_TARJETA));
				}
				if(separated.get(0).equals("setRcomment")){
					setStatus(new WStatus(OK_SET_RCOMMENT, ID_OK_SET_RCOMMENT, MESSAGE_OK_SET_RCOMMENT));
				}
				if(separated.get(0).equals("onlineM")){
					setStatus(new WStatus(OK_ONLINEM, ID_OK_ONLINEM, MESSAGE_OK_ONLINEM));
				}
				if(separated.get(0).equals("resPass")){
					setStatus(new WStatus(OK_ONLINEM, ID_OK_ONLINEM, MESSAGE_OK_ONLINEM));
				}
				if(separated.get(0).equals("offlineM")){
					setStatus(new WStatus(OK_OFFLINEM, ID_OK_OFFLINEM, MESSAGE_OK_OFFLINEM));
				}
				if(separated.get(0).equals("tienesunpedido")){
					setStatus(new WStatus(OK_TIENESPEDIDO, ID_OK_TIENESPEDIDO, MESSAGE_OK_TIENESPEDIDO));
				}
				if(separated.get(0).equals("notienespedido")){
					setStatus(new WStatus(ERROR_NOTIENESPEDIDO, ID_ERROR_NOTIENESPEDIDO, MESSAGE_ERROR_NOTIENESPEDIDO));
				}
				if(separated.get(0).equals("pedidoencamino")){
					setStatus(new WStatus(OK_PEDIDO_ENCAMINO, ID_OK_PEDIDO_ENCAMINO, MESSAGE_OK_PEDIDO_ENCAMINO));
				}
				if(separated.get(0).equals("evaluacionOk")){
					setStatus(new WStatus(OK_EVALUACION, ID_OK_EVALUACION, MESSAGE_OK_EVALUACION));
				}
				if(separated.get(0).equals("noPedido")){
					setStatus(new WStatus(ERROR_NO_HAY_PEDIDO, ID_ERROR_NO_HAY_PEDIDO, MESSAGE_ERROR_NO_HAY_PEDIDO));
				}
				if(separated.get(0).equals("noEmailClients")){
					setStatus(new WStatus(ERROR_NO_EXISTEN_CLIENTES, ID_ERROR_NO_EXISTEN_CLIENTES, MESSAGE_ERROR_NO_EXISTEN_CLIENTES));
				}
				if(separated.get(0).equals("noTarjeta")){
					setStatus(new WStatus(ERROR_NO_NUMERO_TARJETA, ID_ERROR_NO_NUMERO_TARJETA, MESSAGE_ERROR_NO_NUMERO_TARJETA));
				}
				if(separated.get(0).equals("tarifaListo")){
					setStatus(new WStatus(OK_TARIFA_LISTO, ID_OK_TARIFA_LISTO, MESSAGE_OK_TARIFA_LISTO));
				}
				if(separated.get(0).equals("tarifaFaltan")){
					setStatus(new WStatus(ERROR_TARIFA_FALTAN, ID_ERROR_TARIFA_FALTAN, MESSAGE_ERROR_TARIFA_FALTAN));
				}
				if(separated.get(0).equals("siDivideEmail")){
					setStatus(new WStatus(OK_DIVIDE_EMAIL, ID_OK_DIVIDE_EMAIL, MESSAGE_OK_DIVIDE_EMAIL));
				}
				if(separated.get(0).equals("yaSeAgrego")){
					setStatus(new WStatus(ERROR_EMAIL_YA, ID_ERROR_EMAIL_YA, MESSAGE_ERROR_EMAIL_YA));
				}
				if(separated.get(0).equals("OkCoords")){
					setStatus(new WStatus(OK_COORDS, ID_OK_COORDS, MESSAGE_OK_COORDS));
				}
				if(separated.get(0).equals("pedidoRechazado")){
					setStatus(new WStatus(ERROR_MENSAJERO_RECHAZO, ID_ERROR_MENSAJERO_RECHAZO, MESSAGE_ERROR_MENSAJERO_RECHAZO));
				}
				if(separated.get(0).equals("reasignaOk")){
					setStatus(new WStatus(OK_REASIGNA, ID_OK_REASIGNA, MESSAGE_OK_REASIGNA));
				}
				if(separated.get(0).equals("noMensajeroResponse")){
					setStatus(new WStatus(ERROR_NO_HUBORESPUESTA, ID_ERROR_NO_HUBORESPUESTA, MESSAGE_ERROR_NO_HUBORESPUESTA));
				}
				if(separated.get(0).equals("noCancela")){
					setStatus(new WStatus(ERROR_NO_CANCELA, ID_ERROR_NO_CANCELA, MESSAGE_ERROR_NO_CANCELA));
				}
				if(separated.get(0).equals("mensajeroTimeout")){
					setStatus(new WStatus(ERROR_NO_HAS_RESPONDIDOATIEMPO, ID_ERROR_NO_HAS_RESPONDIDOATIEMPO, MESSAGE_ERROR_NO_HAS_RESPONDIDOATIEMPO));
				}
				if(separated.get(0).equals("feedbackOK")){
					setStatus(new WStatus(OK_FEEDBACK, ID_OK_FEEDBACK, MESSAGE_OK_FEEDBACK));
				}
				if(separated.get(0).equals("esperando")){
					setStatus(new WStatus(ERROR_PEDIDO_ESPERANDO, ID_ERROR_PEDIDO_ESPERANDO, MESSAGE_ERROR_PEDIDO_ESPERANDO));
				}
				if(separated.get(0).equals("getPedidosCaminoOK")){
					setStatus(new WStatus(OK_GETPEDIDOS_ENCAMINO, ID_OK_GETPEDIDOS_ENCAMINO, MESSAGE_OK_GETPEDIDOS_ENCAMINO));
				}
				if(separated.get(0).equals("getPedidosCaminoOK")){
					setStatus(new WStatus(OK_GETPEDIDOS_ENCAMINO, ID_OK_GETPEDIDOS_ENCAMINO, MESSAGE_OK_GETPEDIDOS_ENCAMINO));
				}
				if(separated.get(0).equals("OkLogin")){
					setStatus(new WStatus(OK_LOGIN_ADMIN, ID_OK_LOGIN_ADMIN, MESSAGE_OK_LOGIN_ADMIN));
				}
				if(separated.get(0).equals("deleteMensajeroOk")){
					setStatus(new WStatus(OK_DELETE_MENSAJERO, ID_OK_DELETE_MENSAJERO, MESSAGE_OK_DELETE_MENSAJERO));
				}
				if(separated.get(0).equals("allCoordsOk")){
					setStatus(new WStatus(OK_ALL_COORDS, ID_OK_ALL_COORDS, MESSAGE_OK_ALL_COORDS));
				}
				if(separated.get(0).equals("noCriteria")){
					setStatus(new WStatus(ERROR_NO_CRITERIO, ID_ERROR_NO_CRITERIO, MESSAGE_ERROR_NO_CRITERIO));
				}
				if(separated.get(0).equals("dispCoordsOk")){
					setStatus(new WStatus(OK_DISP_COORDS, ID_OK_DISP_COORDS, MESSAGE_OK_DISP_COORDS));
				}
				if(separated.get(0).equals("mensajeroExistente")){
					setStatus(new WStatus(ERROR_MENSAJERO_EXISTENTE, ID_ERROR_MENSAJERO_EXISTENTE, MESSAGE_ERROR_MENSAJERO_EXISTENTE));
				}
				if(separated.get(0).equals("deleteProductOk")){
					setStatus(new WStatus(OK_DELETE_PRODUCTO, ID_OK_DELETE_PRODUCTO, MESSAGE_OK_DELETE_PRODUCTO));
				}
				if(separated.get(0).equals("registraProductOk")){
					setStatus(new WStatus(OK_REGISTRA_PRODUCTO, ID_OK_REGISTRA_PRODUCTO, MESSAGE_OK_REGISTRA_PRODUCTO));
				}
				if(separated.get(0).equals("divisorDeletedOk")){
					setStatus(new WStatus(OK_DIVISOR_DELETED, ID_OK_DIVISOR_DELETED, MESSAGE_OK_DIVISOR_DELETED));
				}
				if(separated.get(0).equals("noDivisionElement")){
					setStatus(new WStatus(ERROR_NO_EXISTE_ELEMENTO, ID_ERROR_NO_EXISTE_ELEMENTO, MESSAGE_ERROR_NO_EXISTE_ELEMENTO));
				}
				if(separated.get(0).equals("invitadosPushOk")){
					setStatus(new WStatus(OK_PUSH_INVITADO, ID_OK_PUSH_INVITADO, MESSAGE_OK_PUSH_INVITADO));
				}
				if(separated.get(0).equals("noInvitados")){
					setStatus(new WStatus(OK_PUSH_INVITADO, ID_OK_PUSH_INVITADO, MESSAGE_OK_PUSH_INVITADO));
				}
				if(separated.get(0).equals("aceptaDivisionOk")){
					setStatus(new WStatus(OK_ACEPTA_DIVISION, ID_OK_ACEPTA_DIVISION, MESSAGE_OK_ACEPTA_DIVISION));
				}
				if(separated.get(0).equals("noAceptaDivision")){
					setStatus(new WStatus(OK_NO_ACEPTODIV, ID_OK_NO_ACEPTODIV, MESSAGE_OK_NO_ACEPTODIV));
				}
				if(separated.get(0).equals("allTarifaOk")){
					setStatus(new WStatus(OK_GET_TELEMENTS, ID_OK_GET_TELEMENTS, MESSAGE_OK_GET_TELEMENTS));
				}
				if(separated.get(0).equals("dividirAcceptOk")){
					setStatus(new WStatus(OK_EMAILS_ACCEPTED, ID_OK_EMAILS_ACCEPTED, MESSAGE_OK_EMAILS_ACCEPTED));
				}
				if(separated.get(0).equals("NadieAcepta")){
					setStatus(new WStatus(ERROR_NO_HAN_ACEPTADO, ID_ERROR_NO_HAN_ACEPTADO, MESSAGE_ERROR_NO_HAN_ACEPTADO));
				}
				if(separated.get(0).equals("rechazaSplitOk")){
					setStatus(new WStatus(OK_RECHAZA_SPLITBILL, ID_OK_RECHAZA_SPLITBILL, MESSAGE_OK_RECHAZA_SPLITBILL));
				}
				if(separated.get(0).equals("faltanAceptar")){
					setStatus(new WStatus(OK_FALTAN_ACEPTAR_BILL, ID_OK_FALTAN_ACEPTAR_BILL, MESSAGE_OK_FALTAN_ACEPTAR_BILL));
				}
				
				
				
				
			
		}
		else{
			setStatus(new WStatus(ERROR,ID_INTERNAL_ERROR,MESSAGE_INTERNAL_ERROR));
		}
		
	}

}
