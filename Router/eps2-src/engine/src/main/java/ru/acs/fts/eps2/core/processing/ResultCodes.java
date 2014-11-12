package ru.acs.fts.eps2.core.processing;

public class ResultCodes
{

	/**
	 * ACCESS_PERMIT("00.00000.00"), SIGNATURE_VALID("00.00000.00"),
	 * VALID_DOCUMENT("00.00000.00"), PROCESS_OK("00.00000.00"),
	 */
	public static final String _00_00000_00 = "00.00000.00";

	/**
	 * REQUEST_SEND_TO_SRV("00.00000.01"),
	 */
	public static final String _00_00000_01 = "00.00000.01"; // NO_UCD (unused code)

	/**
	 * WELL_RESPONSE_RESIEVE_FROM_SRV("00.00000.02"),
	 */
	public static final String _00_00000_02 = "00.00000.02"; // NO_UCD (unused code)

	/**
	 * CALL_AUTHSRV_ERROR("01.00020.01"),
	 */
	public static final String _01_00020_01 = "01.00020.01";

	/**
	 * CREATE_RESULT_ERROR("01.00020.02"),
	 */
	public static final String _01_00020_02 = "01.00020.02";

	/**
	 * RUNTIME_AUTHSRV_ERROR("01.00020.03"),
	 */
	public static final String _01_00020_03 = "01.00020.03";

	/**
	 * TIMEOUT_AUTHSRV_ERROR("01.00020.04"),
	 */
	public static final String _01_00020_04 = "01.00020.04"; // NO_UCD (unused code)

	/**
	 * MESSAGETYPE_NOT_VALID("01.00020.05"),
	 */
	public static final String _01_00020_05 = "01.00020.05"; // NO_UCD (unused code)

	/**
	 * EVENTCODENAME_NOT_VALID("01.00020.06"),
	 */
	public static final String _01_00020_06 = "01.00020.06"; // NO_UCD (unused code)

	/**
	 * PARTICIPANTID_EMPTY("01.00021.01"),
	 */
	public static final String _01_00021_01 = "01.00021.01";

	/**
	 * PARTICIPANT_NOT_REG("01.00022.01"),
	 */
	public static final String _01_00022_01 = "01.00022.01";

	/**
	 * PARTICIPANT_ADDRESS_NOT_REG("01.00023.01"),
	 */
	public static final String _01_00023_01 = "01.00023.01";

	/**
	 * PARTICIPANT_ACCESS_DENIED("01.00024.01"),
	 */
	public static final String _01_00024_01 = "01.00024.01";
	
	/**
	 * PARTICIPANT_SVH_ACCESS_DENIED("01.00025.01"),
	 */
	public static final String _01_00025_01 = "01.00025.01";

	/**
	 * Код внешнего ТО, указанный в заголовке конверта, не соответсвует коду ТО,  указанному в уведомлении о корректировке сведений о месте прибытия товаров("01.00031.01"),
	 */
	public static final String _01_00030_01 = "01.00030.01";

	/**
	 * SENDER_CUSTOMCODE_EMPTY("01.00031.01"),
	 */
	public static final String _01_00031_01 = "01.00031.01";

	/**
	 * SENDER_CUSTOMCODE_NOT_REG("01.00032.01"),
	 */
	public static final String _01_00032_01 = "01.00032.01";

	/**
	 * CUSTO_ADDRESS_NOT_REG("01.00033.01"),
	 */
	public static final String _01_00033_01 = "01.00033.01";

	/**
	 * SOFTVERSION_EMPTY("01.00034.01"),
	 */
	public static final String _01_00034_01 = "01.00034.01";

	/**
	 * SENDER_EXCHTYPE_EMPTY("01.00035.01"),
	 */
	public static final String _01_00035_01 = "01.00035.01";

	/**
	 * SENDER_EXCHTYPE_NOT_REG("01.00036.01"),
	 */
	public static final String _01_00036_01 = "01.00036.01"; // NO_UCD (unused code)

	/**
	 * RCV_CUSTOMCODE_EMPTY("01.00037.01"),
	 */
	public static final String _01_00037_01 = "01.00037.01";

	/**
	 * RCV_CUSTOMCODE_NOT_REG("01.00038.01"),
	 */
	public static final String _01_00038_01 = "01.00038.01";

	/**
	 * DECL_RECEIVER_CUSTOM_CODE_NOT_EXIST("01.00038.02"),
	 */
	public static final String _01_00038_02 = "01.00038.02"; // NO_UCD (unused code)

	/**
	 * DECL_MESSAGE_KIND_NOT_EXISTS("01.00038.03"),
	 */
	public static final String _01_00038_03 = "01.00038.03"; // NO_UCD (unused code)

	/**
	 * DECL_MESSAGE_KIND_AND_CUSTOM_CODE_NOT_EXISTS("01.00038.04"),
	 */
	public static final String _01_00038_04 = "01.00038.04";

	/**
	 * RCV_EXCHTYPE_EMPTY("01.00039.01"),
	 */
	public static final String _01_00039_01 = "01.00039.01";

	/**
	 * RCV_EXCHTYPE_NOT_REG("01.00040.01"),
	 */
	public static final String _01_00040_01 = "01.00040.01"; // NO_UCD (unused code)

	/**
	 * PROCID_NOT_REG("01.00041.01"),
	 */
	public static final String _01_00041_01 = "01.00041.01";

	/**
	 * PROCID_DELETE("01.00042.01"),
	 */
	public static final String _01_00042_01 = "01.00042.01";

	/**
	 * PROCID_STOP("01.00043.01"),
	 */
	public static final String _01_00043_01 = "01.00043.01";

	/**
	 * AUTHORIZATION_COMPLET_CANT_SEND_RESULT("01.00044.01"),
	 */
	public static final String _01_00044_01 = "01.00044.01"; // NO_UCD (unused code)

	/**
	 * CUSTOMCODE_PARTICIPANTID_NOTREG("01.00045.01"),
	 */
	public static final String _01_00045_01 = "01.00045.01"; // NO_UCD (unused code)

	/**
	 * CHECK_GTD_FAIL("01.00046.01"),
	 */
	public static final String _01_00046_01 = "01.00046.01";

	/**
	 * CHECK_GTD__APP_FAIL("01.00046.02"),
	 */
	public static final String _01_00046_02 = "01.00046.02"; // NO_UCD (unused code)

	/**
	 * DECL_ACCOUNT_INVALID("01.00047.01")
	 * 
	 * Срок действия учетной записи декларанта истек или еще не начался
	 * PARTICIPANT_EXPIRED("01.00047.01"),
	 */
	public static final String _01_00047_01 = "01.00047.01";

	/**
	 * CASTO_ACCOUNT_INVALID("01.00048.01"),
	 * 
	 * Срок действия учетной записи таможенного органа истек или еще не начался
	 * CUSTOMS_EXPIRED( "01.00048.01" ),
	 */
	public static final String _01_00048_01 = "01.00048.01";

	/**
	 * SEND_RCV_CUSTOMCODE_NA("01.00090.01"),
	 */
	public static final String _01_00090_01 = "01.00090.01";

	/**
	 * PROCESSID_EMPTY("01.00049.01"),
	 */
	public static final String _01_00049_01 = "01.00049.01";

	/**
	 * PROCESSID_NOT_EMPTY("01.00049.02"),
	 */
	public static final String _01_00049_02 = "01.00049.02";

	/**
	 * PROCESSID_NOT_VALID("01.00049.03"),
	 */
	public static final String _01_00049_03 = "01.00049.03";

	/**
	 * NOT_VALID_DOCUMENTS("01.00100.01"),
	 * 
	 * NO_RULE_TO_PROCESSMSG("01.00100.01"),
	 */
	public static final String _01_00100_01 = "01.00100.01";

	/**
	 * TRANZITTYPE_NOT_VALID("09.00002.01"),
	 */
	public static final String _09_00002_01 = "09.00002.01"; // NO_UCD (unused code)

	/**
	 * SENDING_00002_ERROR("09.00003.01"),
	 */
	public static final String _09_00003_01 = "09.00003.01"; // NO_UCD (unused code)

	/**
	 * SENDING_RESULT_ERROR("09.00004.01"),
	 */
	public static final String _09_00004_01 = "09.00004.01"; // NO_UCD (unused code)

	/**
	 * CREATE_MSG_ERROR("09.00006.01"),
	 */
	public static final String _09_00006_01 = "09.00006.01";

	/**
	 * SENDING_ERROR("09.00007.01"),
	 */
	public static final String _09_00007_01 = "09.00007.01";

	/**
	 * NOT_WORKING_BRANCH("09.00008.01"),
	 */
	public static final String _09_00008_01 = "09.00008.01"; // NO_UCD (unused code)

	/**
	 * CONTROL_PROCESS_ERROR("09.00009.01"),
	 */
	public static final String _09_00009_01 = "09.00009.01"; // NO_UCD (unused code)

	/**
	 * TRANSFORM_TOEAD_PROCESS_ERROR("09.00010.01"),
	 */
	public static final String _09_00010_01 = "09.00010.01"; // NO_UCD (unused code)

	/**
	 * TRANSFORM_FROMEAD_PROCESS_ERROR("09.00010.02"),
	 */
	public static final String _09_00010_02 = "09.00010.02";

	/**
	 * SOFTKIND_NOT_VALID("09.00011.01"),
	 */
	public static final String _09_00011_01 = "09.00011.01";

	/**
	 * MONITORING_COMMAND_NOT_VALID("09.00012.01"),
	 */
	public static final String _09_00012_01 = "09.00012.01"; // NO_UCD (unused code)

	/**
	 * SAVE_TO_DB_BEGIN("02.00000.00"),
	 */
	public static final String _02_00000_00 = "02.00000.00"; // NO_UCD (unused code)

	/**
	 * SAVE_TO_DB_ERROR("02.00000.01"),
	 * NOT_EXISTS_AJDRID_FOR_REGISTRY_REQUEST("02.00000.01"),
	 */
	public static final String _02_00000_01 = "02.00000.01";

	/**
	 * NOT_ALL_FIELD_IN_REQINVENTORYDOC("09.00000.58"),
	 */
	public static final String _09_00000_58 = "09.00000.58"; // NO_UCD (unused code)

	/**
	 * SAVE_TO_DB_TIMEOUT_ERROR("02.00000.02"),
	 */
	public static final String _02_00000_02 = "02.00000.02"; // NO_UCD (unused code)

	/**
	 * NOT_EXISTS_DOCCODE("09.00000.31"),
	 */
	public static final String _09_00000_31 = "09.00000.31"; // NO_UCD (unused code)

	/**
	 * NOT_EXISTS_G44("09.00000.32"),
	 */
	public static final String _09_00000_32 = "09.00000.32";

	/**
	 * NOT_EXISTS_DOCCODEDB("09.00000.33"),
	 */
	public static final String _09_00000_33 = "09.00000.33"; // NO_UCD (unused code)

	/**
	 * DB_REQUEST_ERROR("02.00000.06"),
	 */
	public static final String _02_00000_06 = "02.00000.06";

	/**
	 * DB_CONN_ERR("02.00000.07"),
	 */
	public static final String _02_00000_07 = "02.00000.07"; // NO_UCD (unused code)

	/**
	 * DB_COMMIT_ERR("02.00000.08"),
	 */
	public static final String _02_00000_08 = "02.00000.08"; // NO_UCD (unused code)

	/**
	 * DOC_NOT_EXIST_IN_DB("02.00001.01"),
	 */
	public static final String _02_00001_01 = "02.00001.01";

	/**
	 * DOC_PARALLEL_ROW_UPDATE("02.00002.01"),
	 */
	public static final String _02_00002_01 = "02.00002.01"; // NO_UCD (unused code)

	/**
	 * CANT_PROCESS_MSG_IN_CURRENT_STATE("02.00081.01"),
	 */
	public static final String _02_00081_01 = "02.00081.01";

	/**
	 * CANT_FIND_CURRENT_STATE_BY_PROCESSID("02.00082.01"),
	 */
	public static final String _02_00082_01 = "02.00082.01";

	/**
	 * NEED_COMPRESS_TYPE_OF_INCOMEMSG("01.00011.01"),
	 */
	public static final String _01_00011_01 = "01.00011.01";

	/**
	 * NEED_NOTCOMPRESS_TYPE_OF_INCOMEMSG("01.00011.02"),
	 */
	public static final String _01_00011_02 = "01.00011.02";

	/**
	 * CONTAINER_CHECK_RUNTIME_ERROR("03.00010.01"),
	 */
	public static final String _03_00010_01 = "03.00010.01"; // NO_UCD (unused code)

	/**
	 * RECIEVE_NOT_FULL_CONTAINER("03.00011.01"),
	 */
	public static final String _03_00011_01 = "03.00011.01"; // NO_UCD (unused code)

	/**
	 * NOT_FULL_CONTAINER_INDICATOR_NOT_SET("03.00012.01"),
	 */
	public static final String _03_00012_01 = "03.00012.01"; // NO_UCD (unused code)

	/**
	 * NOT_FULL_CONTAINER_SEND_DENIED("03.00013.01"),
	 */
	public static final String _03_00013_01 = "03.00013.01"; // NO_UCD (unused code)

	/**
	 * CONTAINER_NOT_CONTAIN_VALID_NUMBER_DOC("03.00014.01"),
	 */
	public static final String _03_00014_01 = "03.00014.01";

	/**
	 * CANT_FIND_CONTAINER_BY_PARAM("03.00015.01"),
	 */
	public static final String _03_00015_01 = "03.00015.01"; // NO_UCD (unused code)

	/**
	 * CANT_REPLACE_DOCUMENT_TYPE_DIFIRENT("03.00016.01"),
	 * 
	 * Невозможно заменить документ хранящийся в БД на переданный документ.
	 * Разные типы документов. CANT_REPLACE_DOCS_OF_DIFF_TYPES ("03.00016.01"),
	 */
	public static final String _03_00016_01 = "03.00016.01";

	/**
	 * CANT_REPLACE_MODIFICATED_DOCUMENT("03.00017.01"),
	 */
	public static final String _03_00017_01 = "03.00017.01"; // NO_UCD (unused code)

	/**
	 * CANT_COMMIT_REPLACMENT_DOCUMENT("03.00018.01"),
	 */
	public static final String _03_00018_01 = "03.00018.01"; // NO_UCD (unused code)

	/**
	 * CANT_REGISTER_CONTAINER("03.00019.01"),
	 */
	public static final String _03_00019_01 = "03.00019.01";

	/**
	 * CANT_CHANGE_GTD_PREVIOS_CHANGING_NOT_COMMIT("03.00021.01"),
	 */
	public static final String _03_00021_01 = "03.00021.01";

	/**
	 * TRANSPORT_ADDRESS_NOT_REGISTER("03.00022.01"),
	 */
	public static final String _03_00022_01 = "03.00022.01"; // NO_UCD (unused code)

	/**
	 * CANT_CREATE_DOCUMENT_OBJECT("03.00023.01"),
	 */
	public static final String _03_00023_01 = "03.00023.01"; // NO_UCD (unused code)

	/**
	 * TIMEOUT_ARCH_RESPONSE("03.00024.01"),
	 */
	public static final String _03_00024_01 = "03.00024.01"; // NO_UCD (unused code)

	/**
	 * NOT_CONTAINER_ARCH_SEND("03.00025.01"),
	 */
	public static final String _03_00025_01 = "03.00025.01"; // NO_UCD (unused code)

	/**
	 * CANT_FIND_PROCESS_BY_REQUEST("03.00026.01"),
	 */
	public static final String _03_00026_01 = "03.00026.01"; // NO_UCD (unused code)

	/**
	 * NOT_EXIST_REFDOCUMENTID("03.00027.01"),
	 */
	public static final String _03_00027_01 = "03.00027.01";

	/**
	 * NOT_EXIST_INITIALENVELOPEID("03.00028.01"),
	 */
	public static final String _03_00028_01 = "03.00028.01";

	/**
	 * DUPLICATE_DOCID("03.00029.01"),
	 */
	public static final String _03_00029_01 = "03.00029.01";

	/**
	 * OUTPUT_NOT_CURRENT_DOC("03.00030.01"),
	 */
	public static final String _03_00030_01 = "03.00030.01";

	/**
	 * OUTPUT_NOT_SAME_DOC("03.00031.01"),
	 */
	public static final String _03_00031_01 = "03.00031.01"; // NO_UCD (unused code)

	/**
	 * OUTPUT_NOT_SAME_DOC_FETCH_ERROR("03.00031.02"),
	 */
	public static final String _03_00031_02 = "03.00031.02"; // NO_UCD (unused code)

	/**
	 * AUD_PACKAGEID_HAD_NOT_FOUND_FOR_CURRENT_PROC("03.00032.00"),
	 */
	public static final String _03_00032_00 = "03.00032.00"; // NO_UCD (unused code)

	/**
	 * CANNOT_RECALL_GTD("03.00040.01"),
	 */
	public static final String _03_00040_01 = "03.00040.01"; // NO_UCD (unused code)
	
	/**
	 * FLC_CALL_ERROR("03.00100.00"),
	 */
	public static final String _03_00100_00 = "03.00100.00"; // NO_UCD (unused code)
	
	/**
	 * FAIL_GTD_FLK("03.00100.01"),
	 */
	public static final String _03_00100_01 = "03.00100.01"; // NO_UCD (unused code)
	
	/**
	 * DocumentFormatTimeNotStart("03.00101.01"),
	 */
	public static final String _03_00101_01 = "03.00101.01";
	
	/**
	 * DocumentFormatTimeFinished("03.00102.01"),
	 */
	public static final String _03_00102_01 = "03.00102.01";
	
	/**
	 * RefDocumentIDFill("03.00103.01"),
	 */
	public static final String _03_00103_01 = "03.00103.01"; // NO_UCD (unused code)
	
	/**
	 * TechnologyNOTConform("03.00104.01"),
	 */
	public static final String _03_00104_01 = "03.00104.01"; // NO_UCD (unused code)
	
	/**
	 * RequestedDTNotFound("03.00105.01"),
	 */
	public static final String _03_00105_01 = "03.00105.01";

    /**
     * Предоставление документов после выпуска не разрешено
     */
    public static final String _03_00106_06 = "03.00106.06";

	/**
	 * CALL_CRYPTOSRV_ERROR("01.00050.01"),
	 */
	public static final String _01_00050_01 = "01.00050.01";
	
	/**
	 * RUNTIME_CRYPTOSRV_ERROR("01.00050.03"),
	 */
	public static final String _01_00050_03 = "01.00050.03";
	
	/**
	 * TIMEOUT_CRYPTOSRV_ERROR("01.00050.04"),
	 */
	public static final String _01_00050_04 = "01.00050.04"; // NO_UCD (unused code)
	
	/**
	 * SIGNATURE_NOT_VALID("01.00051.01"),
	 */
	public static final String _01_00051_01 = "01.00051.01";
	
	/**
	 * CERTIFICATE_NOT_VALID("01.00052.01"),
	 */
	public static final String _01_00052_01 = "01.00052.01"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_NOT_TIME_VALID("01.00052.02"),
	 */
	public static final String _01_00052_02 = "01.00052.02"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_NOT_TIME_NESTED("01.00052.03"),
	 */
	public static final String _01_00052_03 = "01.00052.03"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_REVOKED("01.00052.04"),
	 */
	public static final String _01_00052_04 = "01.00052.04"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_NOT_SIGNATURE_VALID("01.00052.05"),
	 */
	public static final String _01_00052_05 = "01.00052.05"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_NOT_VALID_FOR_USAGE("01.00052.06"),
	 */
	public static final String _01_00052_06 = "01.00052.06"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_UNTRUSTED_ROOT("01.00052.07"),
	 */
	public static final String _01_00052_07 = "01.00052.07"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_REVOCATION_STATUS_UNKNOWN("01.00052.08"),
	 */
	public static final String _01_00052_08 = "01.00052.08"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_CYCLIC("01.00052.09"),
	 */
	public static final String _01_00052_09 = "01.00052.09"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_INVALID_EXTENSION("01.00052.10"),
	 */
	public static final String _01_00052_10 = "01.00052.10"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_INVALID_POLICY_CONSTRAINTS("01.00052.11"),
	 */
	public static final String _01_00052_11 = "01.00052.11"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_INVALID_BASIC_CONSTRAINTS("01.00052.12"),
	 */
	public static final String _01_00052_12 = "01.00052.12"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_INVALID_NAME_CONSTRAINTS("01.00052.13"),
	 */
	public static final String _01_00052_13 = "01.00052.13"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_HAS_NOT_SUPPORTED_NAME_CONSTRAINT("01.00052.14"),
	 */
	public static final String _01_00052_14 = "01.00052.14"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_HAS_NOT_DEFINED_NAME_CONSTRAINT("01.00052.16"),
	 */
	public static final String _01_00052_16 = "01.00052.16"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_HAS_EXCLUDED_NAME_CONSTRAINT("01.00052.17"),
	 */
	public static final String _01_00052_17 = "01.00052.17"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_OFFLINE_REVOCATION("01.00052.18"),
	 */
	public static final String _01_00052_18 = "01.00052.18"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_NO_ISSUANCE_CHAIN_POLICY("01.00052.19"),
	 */
	public static final String _01_00052_19 = "01.00052.19"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_IS_PARTIAL_CHAIN("01.00052.20"),
	 */
	public static final String _01_00052_20 = "01.00052.20"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_CTL_IS_NOT_TIME_VALID("01.00052.21"),
	 */
	public static final String _01_00052_21 = "01.00052.21"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_CTL_IS_NOT_SIGNATURE_VALID("01.00052.22"),
	 */
	public static final String _01_00052_22 = "01.00052.22"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_CTL_IS_NOT_VALID_FOR_USAGE("01.00052.23"),
	 */
	public static final String _01_00052_23 = "01.00052.23"; // NO_UCD (unused code)
	
	/**
	 * CANT_CREATE_CERT_CHAIN_ENGINE("01.00052.24"),
	 */
	public static final String _01_00052_24 = "01.00052.24"; // NO_UCD (unused code)
	
	/**
	 * CANT_GET_CERT_CHAIN("01.00052.25"),
	 */
	public static final String _01_00052_25 = "01.00052.25"; // NO_UCD (unused code)
	
	/**
	 * CERT_TRUST_HAS_NOT_PERMITTED_NAME_CONSTRAINT("01.00052.26"),
	 */
	public static final String _01_00052_26 = "01.00052.26"; // NO_UCD (unused code)
	
	/**
	 * CCSE_CANT_LOAD_LIB("01.00053.01"),
	 */
	public static final String _01_00053_01 = "01.00053.01"; // NO_UCD (unused code)
	
	/**
	 * CCSE_CANT_GET_OBJECT("01.00053.02"),
	 */
	public static final String _01_00053_02 = "01.00053.02"; // NO_UCD (unused code)
	
	/**
	 * CCSE_AUTHTYPE_DENAID("01.00053.03"),
	 */
	public static final String _01_00053_03 = "01.00053.03"; // NO_UCD (unused code)
	
	/**
	 * CCSE_PROXY_AUTHTYPE_DENAID("01.00053.04"),
	 */
	public static final String _01_00053_04 = "01.00053.04"; // NO_UCD (unused code)
	
	/**
	 * CCSE_ADDRESS_DENAID("01.00053.05"),
	 */
	public static final String _01_00053_05 = "01.00053.05"; // NO_UCD (unused code)
	
	/**
	 * CCSE_ADITIONS_DENAID("01.00053.06"),
	 */
	public static final String _01_00053_06 = "01.00053.06"; // NO_UCD (unused code)
	
	/**
	 * CCSE_SREQUEST_DENAID("01.00053.07"),
	 */
	public static final String _01_00053_07 = "01.00053.07"; // NO_UCD (unused code)
	
	/**
	 * CCSE_NSREQUEST_DENAID("01.00053.08"),
	 */
	public static final String _01_00053_08 = "01.00053.08"; // NO_UCD (unused code)
	
	/**
	 * CCSE_TIME_NOTVALID("01.00053.09"),
	 */
	public static final String _01_00053_09 = "01.00053.09"; // NO_UCD (unused code)
	
	/**
	 * CCSE_SERVICE_ADDRESS_NOTVALID("01.00053.10"),
	 */
	public static final String _01_00053_10 = "01.00053.10"; // NO_UCD (unused code)
	
	/**
	 * CCSE_RESPONSE_NOTVALID("01.00053.11"),
	 */
	public static final String _01_00053_11 = "01.00053.11"; // NO_UCD (unused code)
	
	/**
	 * CCSE_THEUPDATE_NOTVALID("01.00053.12"),
	 */
	public static final String _01_00053_12 = "01.00053.12"; // NO_UCD (unused code)
	
	/**
	 * CCSE_NEXTUPDATE_LESS_THISUPDATE("01.00053.13"),
	 */
	public static final String _01_00053_13 = "01.00053.13"; // NO_UCD (unused code)
	
	/**
	 * CCSE_ANKNOWN_ERROR("01.00053.14"),
	 */
	public static final String _01_00053_14 = "01.00053.14"; // NO_UCD (unused code)
	
	/**
	 * CR_UNKNOWN("01.00054.01"),
	 */
	public static final String _01_00054_01 = "01.00054.01"; // NO_UCD (unused code)
	
	/**
	 * CR_CERT_COMPROMATE("01.00054.02"),
	 */
	public static final String _01_00054_02 = "01.00054.02"; // NO_UCD (unused code)
	
	/**
	 * CR_ROOT_COMPROMATE("01.00054.03"),
	 */
	public static final String _01_00054_03 = "01.00054.03"; // NO_UCD (unused code)
	
	/**
	 * CR_CERTINFO_CHANGE("01.00054.04"),
	 */
	public static final String _01_00054_04 = "01.00054.04"; // NO_UCD (unused code)
	
	/**
	 * CR_CERT_CHANGE("01.00054.05"),
	 */
	public static final String _01_00054_05 = "01.00054.05"; // NO_UCD (unused code)
	
	/**
	 * CR_NOT_NEED("01.00054.06"),
	 */
	public static final String _01_00054_06 = "01.00054.06"; // NO_UCD (unused code)
	
	/**
	 * CR_CERT_PAUSED("01.00054.07"),
	 */
	public static final String _01_00054_07 = "01.00054.07"; // NO_UCD (unused code)
	
	/**
	 * CR_REMOVE_FROM_CRL("01.00054.08"),
	 */
	public static final String _01_00054_08 = "01.00054.08"; // NO_UCD (unused code)
	
	/**
	 * CR_CERT_PREV_RECALL("01.00054.09"),
	 */
	public static final String _01_00054_09 = "01.00054.09"; // NO_UCD (unused code)
	
	/**
	 * CR_ATRROOT_COMPROMATE("01.00054.10"),
	 */
	public static final String _01_00054_10 = "01.00054.10"; // NO_UCD (unused code)

	/**
	 * CR_CERT_STATUS_UNKNOWN("01.00054.11"),
	 */
	public static final String _01_00054_11 = "01.00054.11"; // NO_UCD (unused code)
	
	/**
	 * CR_CERT_STATUS_VALUE_UNKNOWN("01.00054.12"),
	 */
	public static final String _01_00054_12 = "01.00054.12"; // NO_UCD (unused code)
	
	/**
	 * CALL_STRCONTROLSRV_ERROR("01.00070.01"),
	 */
	public static final String _01_00070_01 = "01.00070.01";
	
	/**
	 * RUNTIME_STRCONTROLSRV_ERROR("01.00070.03"),
	 */
	public static final String _01_00070_03 = "01.00070.03"; // NO_UCD (unused code)
	
	/**
	 * TIMEOUT_STRCONTROLSRV_ERROR("01.00070.04"),
	 */
	public static final String _01_00070_04 = "01.00070.04"; // NO_UCD (unused code)
	
	/**
	 * NOT_VALID_DOC("01.00071.01"),
	 */
	public static final String _01_00071_01 = "01.00071.01";
	
	/**
	 * XMLNS_EMPTY("01.00071.02"),
	 */
	public static final String _01_00071_02 = "01.00071.02"; // NO_UCD (unused code)
	
	/**
	 * NOT_VALID_ALBUM_VERSION("01.00071.03"),
	 */
	public static final String _01_00071_03 = "01.00071.03"; // NO_UCD (unused code)
	
	/**
	 * SCHEMA_FILE_NOT_FOUND("01.00071.04"),
	 */
	public static final String _01_00071_04 = "01.00071.04"; // NO_UCD (unused code)
	
	/**
	 * GET_DOC_FROM_ENV_ERROR("01.00073.05"),
	 */
	public static final String _01_00073_05 = "01.00073.05"; // NO_UCD (unused code)
	
	/**
	 * GET_DOC_FROM_SIGN_ERROR("01.00073.06"),
	 */
	public static final String _01_00073_06 = "01.00073.06"; // NO_UCD (unused code)
	
	/**
	 * GET_DOCS_FROM_CONTAINER("01.00073.07"),
	 */
	public static final String _01_00073_07 = "01.00073.07";
	
	/**
	 * MsgType_ModeDocID_ERROR("01.00072.01"),
	 */
	public static final String _01_00072_01 = "01.00072.01";
	
	/**
	 * FATAL_UNKNOWN_ERROR("09.96669.99"),
	 */
	public static final String _09_96669_99 = "09.96669.99";
	
	/**
	 * EADDocNotExists("03.00106.01"),
	 */
	public static final String _03_00106_01 = "03.00106.01";
	
	/**
	 * EADDocHasnotId("03.00106.02"),
	 */
	public static final String _03_00106_02 = "03.00106.02";
	
	/**
	 * EADReqNotExisis("03.00107.01"),
	 */
	public static final String _03_00107_01 = "03.00107.01";
	
	/**
	 * EADReqNotValid("03.00106.03"),
	 */
	public static final String _03_00106_03 = "03.00106.03";
	
	/**
	 * CREATE_DOCUMENT_ERROR("09.00000.59"),
	 */
	public static final String _09_00000_59 = "09.00000.59";
	
	/**
	 * EAD_FATAL_ERROR("09.00051.99"),
	 */
	public static final String _09_00051_99 = "09.00051.99";
	
	/**
	 * EAD_UNKNOWN_RESPONSE("09.00052.99"),
	 */
	public static final String _09_00052_99 = "09.00052.99"; // NO_UCD (unused code)
	
	/**
	 * EAD_NOT_VALID_DOC("09.00053.99"),
	 */
	public static final String _09_00053_99 = "09.00053.99";
	
	/**
	 * DUBLICATE_ENV_ID("02.00000.99"),
	 */
	public static final String _02_00000_99 = "02.00000.99";
	
	/**
	 * MISSING_TDTS_REG_NUMBER("03.00027.04"),
	 */
	public static final String _03_00027_04 = "03.00027.04"; // NO_UCD (unused code)
	
	/**
	 * MISSING_TDTS_CANCELLATION_INFO("03.00027.05"),
	 */
	public static final String _03_00027_05 = "03.00027.05"; // NO_UCD (unused code)
	
	/**
	 * INVALID_REF_DOCUMENT_ID("03.00027.02"),
	 */
	public static final String _03_00027_02 = "03.00027.02";
	
	/**
	 * INVALID_DOCUMENT_SIGN("03.00027.03"),
	 */
	public static final String _03_00027_03 = "03.00027.03";

	/**
	 * PROCEDURE_HAVE_FORBIDDING_REQUEST("03.00021.03"),
	 */
	public static final String _03_00021_03 = "03.00021.03";

	/**
	 * Не заполнен срок: предельный срок принятия решения о снятии средств
	 * идентификации
	 * <p>
	 * MISSING_IDENTITY_WITHDRAW_DEADLINE("03.00100.02"),
	 */
	public static final String _03_00100_02 = "03.00100.02";

	/**
	 * По  данной  процедуре  отсутствует запрос  на  отзыв,  по  которому не
	 * принято решение об отзыве.
	 * MISSING_RECALL_REQUEST_WITHOUT_DECISION("03.00021.04"),
	 */
	public static final String _03_00021_04 = "03.00021.04";

	/**
	 * Для данной процедуры отсутствует сообщение, содержащее документ,
	 * указанный в ссылочном идентификаторе. NO_INITIAL_REF_MSG_FOR_PROCESS(
	 * "03.00027.07" ),
	 */
	public static final String _03_00027_07 = "03.00027.07";

	/**
	 * Неверный статус регистрируемого документа BAD_DOCUMENT_STATUS(
	 * "03.00027.06" ),
	 */
	public static final String _03_00027_06 = "03.00027.06";

	/**
	 * Ошибка обработки сообщения. В БД присутствуют несколько
	 * записей-субстатусов документов, передаваемых в процедуре.
	 * MULTIPLE_PROCESS_SUBSTATUSES( "03.00042.01" ),
	 */
	public static final String _03_00042_01 = "03.00042.01";

	/**
	 * Выпуск неактуального комплекта документов запрещен.
	 * ISSUE_NOT_ACTUAL_DOCS_DENIED( "03.00030.02" ),
	 */
	public static final String _03_00030_02 = "03.00030.02";

	/**
	 * Не должен присутствовать элемент RefDocumentID у одного или нескольких
	 * документов REF_DOCUMENT_ID_FORBIDDEN( "03.00027.10" ),
	 */
	public static final String _03_00027_10 = "03.00027.10";

	/**
	 * Не существует запроса на внесение изменений в ДТ или указана неверная
	 * ссылочная связанность на комплект документов по которому в ТО принимается
	 * решение. REQUEST_TO_MAKE_CHANGES_IN_DT_NOT_EXISTS ("03.00041.01"),
	 */
	public static final String _03_00041_01 = "03.00041.01";

	/**
	 * Не указана ссылочная связанность на заменяемый документ
	 * CHANGING_DOCUMENT_NO_REFERENCE( "03.00027.09" ),
	 */
	public static final String _03_00027_09 = "03.00027.09";

	/**
	 * Неверный статус документа, на который отправлен перечень ошибок ФЛК
	 * FLK_REF_DOCUMENT_BAD_STATUS( "03.00027.11" ),
	 */
	public static final String _03_00027_11 = "03.00027.11";

	/**
	 * Несоответствие количества заменяемых документов одного типа
	 * CHANGED_DOCS_MODE_ID_MISMATCH( "03.00016.02" ),
	 */
	public static final String _03_00016_02 = "03.00016.02";

	/**
	 * Передан неактуальный комплект документов.
	 * TRANSFERRED_SET_OF_DOCUMENTS_IS_OUT_OF_DATE("03.00031.03"),
	 */
	public static final String _03_00031_03 = "03.00031.03";

	/**
	 * Код таможенного органа, указанный в процедуре декларирования отсутствует
	 * в справочнике таможенных органов, в которых могут проводиться таможенные
	 * операции для данного УЭО MISSING_CUSTOMS_CODE_FOR_UEO( "03.000109.01" ),
	 */
	public static final String _03_00109_01 = "03.00109.01";

	/**
	 * ИНН отправителя / ИНН декларанта не найдены в реестре уполномоченных
	 * экономических операторов INN_NOT_FOUND_FOR_UEO( "03.000109.03" ),
	 */
	public static final String _03_00109_03 = "03.00109.03";

	/**
	 * заявленный код упрощения не применим для данного уполномоченного
	 * экономического оператора DECLARED_CODE_IS_NOT_APPLICABLE_FOR_UEO(
	 * "03.000109.02" ),
	 */
	public static final String _03_00109_02 = "03.00109.02";

	/**
	 * Документ не является актуальным в БД DOC_IS_NOT_ACTUAL( "03.00027.08" ),
	 */
	public static final String _03_00027_08 = "03.00027.08";

	/**
	 * Срок принятия решения по средствам идентификации еще не истек.
	 * DECISION_TERM_HAS_NOT_EXPIRED( "03.00108.01" ),
	 */
	public static final String _03_00108_01 = "03.00108.01";

	/**
	 * Архив не найден. Не найден архив с указанным идентификатором.
	 * ARCHIVE_NOT_FOUND( "10.00002.01" ),
	 */
	public static final String _10_00002_01 = "10.00002.01";

	/**
	 * Идентификатор участника ВЭД не соответствует идентификатору владельца
	 * архива. PARTICIPANT_ID_DOESNT_CORRESPOND_TO_OWNER( "03.00106.04" ),
	 */
	public static final String _03_00106_04 = "03.00106.04";

    /**
     * Не найдены запросы документов по переданным позициям
     */
    public static final String _03_00106_05 = "03.00106.05";

	/**
	 * Документ не найден. Документ не найден в архиве.
	 * DOCUMENT_NOT_FOUND_IN_ARCHIVE( "10.00004.02" ),
	 */
	public static final String _10_00004_02 = "10.00004.02";

	/**
	 * Не заполнен код применяемого упрощения SIMPLIFICATION_CODE_MISSING(
	 * "03.00109.04" );
	 */
	public static final String _03_00109_04 = "03.00109.04";
	
	/**
	 * Общая ошибка при работе программного средства (ЭАД)
	 */
	public static final String _10_00000_00 = "10.00000.00"; // NO_UCD (unused code)
	
	/**
	 * Некорректный формат сообщения. Отсутствует архивный идентификатор документа / документ
	 */
	public static final String _10_00001_01 = "10.00001.01";
	
	/**
	 * Некорректный формат сообщения. Указана неправильная кодировка.
	 */
	public static final String _10_00001_02 = "10.00001.02"; // NO_UCD (unused code)
	
	/**
	 * Некорректный формат сообщения. Отсутствует тело сообщения
	 */
	public static final String _10_00001_03 = "10.00001.03"; // NO_UCD (unused code)
	
	/**
	 * Некорректный формат сообщения. Ошибка при выполнении структурного контроля
	 */
	public static final String _10_00001_04 = "10.00001.04"; // NO_UCD (unused code)
	
	/**
	 * Некорректный формат сообщения. Неизвестный тип сообщения
	 */
	public static final String _10_00001_05 = "10.00001.05"; // NO_UCD (unused code)
	
	/**
	 * Некорректный формат сообщения. Документ не соответствует схеме.
	 */
	public static final String _10_00001_06 = "10.00001.06"; // NO_UCD (unused code)
	
	/**
	 * Архив не найден. Не найдена точка подключения с указанным идентификатором
	 */
	public static final String _10_00002_02 = "10.00002.02";
	
	/**
	 * Невозможно удалить архив. Архив содержит документы, используемые в процессе оформления.
	 */
	public static final String _10_00003_01 = "10.00003.01";
	
	/**
	 * Документ не найден. Неизвестный тип документа
	 */
	public static final String _10_00004_01 = "10.00004.01"; // NO_UCD (unused code)
	
	/**
	 * Невозможно удалить документ. Документ используется в процессе оформления
	 */
	public static final String _10_00005_01 = "10.00005.01";
	
	/**
	 * Невозможно удалить документ. Документ используется в процессе оформления
	 */
	public static final String _10_00005_02 = "10.00005.02";
	
	/**
	 * Невозможно заменить документ. Версия документа не является последней
	 */
	public static final String _10_00005_03 = "10.00005.03";
	
	/**
	 * Невозможно удалить документ. Версия документа не является последней
	 */
	public static final String _10_00005_04 = "10.00005.04";
	
	/**
	 * Ошибка получения доступа к документу. Доступ к документу запрещен
	 */
	public static final String _10_00011_01 = "10.00011.01";
	
	/**
	 * Некорректный формат документа. Ошибка форматного контроля
	 */
	public static final String _10_00006_01 = "10.00006.01"; // NO_UCD (unused code)
	
	/**
	 * Ошибка при обращении к БД. Ошибка записи данных в БД
	 */
	public static final String _10_00007_01 = "10.00007.01";
	
	/**
	 * Ошибка при обращении к БД. Нарушена целостность данных
	 */
	public static final String _10_00007_02 = "10.00007.02"; // NO_UCD (unused code)
	
	/**
	 * Ошибка при обращении к БД. Ошибка доступа.
	 */
	public static final String _10_00007_03 = "10.00007.03"; // NO_UCD (unused code)
	
	/**
	 * Ошибка при попытке создания ответного конверта
	 */
	public static final String _10_00010_01 = "10.00010.01"; // NO_UCD (unused code)
	
	/**
	 * Ошибка при попытке отправки ответного конверта
	 */
	public static final String _10_00010_02 = "10.00010.02"; // NO_UCD (unused code)
	
	/**
	 * Невозможно заменить документ. Тип заменяющего 
	 * документа не соответствует коду вида заменяемого документа
	 */
	public static final String _10_00005_05 = "10.00005.05";
	
	/**
	 * Невозможно заменить документ. Тип заменяющего 
	 * документа не соответствует типу заменяемого документа.
	 */
	public static final String _10_00005_06 = "10.00005.06";
	
	/**
	 * Невозможно разместить документ. Тип размещаемого 
	 * документа не соответствует коду вида документа, указанному в запросе
	 */
	public static final String _10_00008_01 = "10.00008.01";
	
	/**
	 * Для документа передаваемого повторно не найден исходный документ
	 */
	public static final String _03_00043_01 = "03.00043.01";
	
	/**
	 * Для документа в ЭАДе не заполнено поле ALBUM_VERSION и мы не смогли его восстановить
	 * EAD ALBUM VERSION NOT EXISTS
	 */
	public static final String _03_00106_10 = "03.00106.10";
	
	/**
	 * Системная  ошибка. Процесс обработки или формирования сообщения завершился аварийно.
	 */
	public static final String _09_00005_05 = "09.00005.05";
	
	/**
	 * Проверка статусного перехода. Исходный статус не найден.
	 */
	public static final String _99_90001_01 = "99.90001.01";
	
	/**
	 * Проверка статусного перехода. Целевой статус не найден.
	 */
	public static final String _99_90001_02 = "99.90001.02";
	
	/**
	 * Проверка статусного перехода. Версия программного обеспечения не найдена.
	 */
	public static final String _99_90001_03 = "99.90001.03";
	
	/**
	 * Проверка статусного перехода. Определение сообщения не найдено.
	 */
	public static final String _99_90001_04 = "99.90001.04";
	
	/**
	 * Проверка статусного перехода. Запрошенная статусная модель не найдена.
	 */
	public static final String _99_90001_05 = "99.90001.05";
	
	/**
	 * Семантическая ошибка. Данные сообщения не соответствуют требованиям спецификации обмена. Проверьте правильность передаваемых данных.
	 */
	public static final String _99_90002_01 = "99.90002.01";
	
	public static boolean areCodesEquals( String code1, String code2 )
	{
		return code1.equalsIgnoreCase( code2 );
	}

	public static boolean isOk( String code )
	{
		return areCodesEquals( ResultCodes._00_00000_00, code );
	}

}
