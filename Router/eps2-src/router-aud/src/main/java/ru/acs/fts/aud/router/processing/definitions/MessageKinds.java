package ru.acs.fts.aud.router.processing.definitions;

/*
 * Походу, тут много чего ненужного. Но пусть будет. Для референса.
 */
public class MessageKinds
{
	// @formatter:off
	protected MessageKinds( ) { }
	// @formatter:on
	
	public static final String AUD_PUT_DOC_REQ = "AUD.PUT_DOC.REQ";
	public static final String AUD_PUT_DOC_RES = "AUD.PUT_DOC.RES";
	
	public static final String AUD_PACKET_INVENTORY_REQ = "AUD.PACKET_INVENTORY.REQ";
	public static final String AUD_PACKET_INVENTORY_RES = "AUD.PACKET_INVENTORY.RES";
	
	public static final String AUD_GET_PACKET_REQ = "AUD.GET_PACKET.REQ"; // NO_UCD (unused code)
	public static final String AUD_GET_PACKET_RES = "AUD.GET_PACKET.RES"; // NO_UCD (unused code)
	
	public static final String AUD_GET_DOC_REQ = "AUD.GET_DOC.REQ"; // NO_UCD (unused code)
	
	public static final String AUD_CHECK_DOC_SIG_REQ = "AUD.CHECK_DOC_SIG.REQ"; // NO_UCD (unused code)
	public static final String AUD_CHECK_DOC_SIG_RES = "AUD.CHECK_DOC_SIG.RES"; // NO_UCD (unused code)
	
	public static final String AUD_GET_DOC_FORMATTED_REQ = "AUD.GET_DOC_FORMATTED.REQ"; // NO_UCD (unused code)
	public static final String AUD_GET_DOC_FORMATTED_RES = "AUD.GET_DOC_FORMATTED.RES"; // NO_UCD (unused code)
	
	public static final String AUD_GET_DOC_KIND_INFO_REQ = "AUD.GET_DOC_KIND_INFO.REQ"; // NO_UCD (unused code)
	public static final String AUD_GET_DOC_KIND_INFO_RES = "AUD.GET_DOC_KIND_INFO.RES"; // NO_UCD (unused code)
	
	public static final String AUD_GET_RPSNT_FDATA_REQ = "AUD.GET_RPSNT_FDATA.REQ"; // NO_UCD (unused code)
	public static final String AUD_GET_RPSNT_FDATA_RES = "AUD.GET_RPSNT_FDATA.RES"; // NO_UCD (unused code)
	
	public static final String AUD_DEACTUALIZE_DOC_REQ = "AUD.DEACTUALIZE_DOC.REQ"; // NO_UCD (unused code)
	public static final String AUD_DEACTUALIZE_DOC_RES = "AUD.DEACTUALIZE_DOC.RES"; // NO_UCD (unused code)
	
	public static final String AUD_RESULT_REQ = "AUD.RESULT.REQ"; // NO_UCD (unused code)
	public static final String AUD_RESULT_RES = "AUD.RESULT.RES"; // NO_UCD (unused code)
	
	public static final String AUD_STATUS_REQ = "AUD.STATUS.REQ"; // NO_UCD (unused code)
	public static final String AUD_STATUS_RES = "AUD.STATUS.RES"; // NO_UCD (unused code)
	
	public static final String AUD_PUT_DOC_SYNC_REQ = "AUD.PUT_DOC_SYNC.REQ"; // NO_UCD (unused code)
	public static final String AUD_PUT_DOC_SYNC_RES = "AUD.PUT_DOC_SYNC.RES"; // NO_UCD (unused code)
	
	public static final String AUD_REGISTRY_REQ = "AUD.REGISTRY.REQ"; // NO_UCD (unused code)
	public static final String AUD_REGISTRY_RES = "AUD.REGISTRY.RES";
	
	public static final String AUD_GET_PACKET_DOC_LIST_REQ = "AUD.GET_PACKET_DOC_LIST.REQ"; // NO_UCD (unused code)
	public static final String AUD_GET_PACKET_DOC_LIST_RES = "AUD.GET_PACKET_DOC_LIST.RES"; // NO_UCD (unused code)
	
	public static final String AUD_ERROR = "AUD.ERROR";
	
	public static final String AUD_DELIVERY_NOTIFICATION = "AUD.DELIVERY_NOTIFICATION";
}
