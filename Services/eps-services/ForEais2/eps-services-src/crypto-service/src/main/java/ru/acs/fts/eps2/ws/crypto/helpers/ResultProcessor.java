package ru.acs.fts.eps2.ws.crypto.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.ResultInformation;

public class ResultProcessor
{
    private static final int DESCRIPTION_PART_LENGTH = 250;
    private static final int SOURCE = 11;
    public static final String SIGNATURE_VALID = "00.00000.00";
    public static final String SIGNATURE_NOT_VALID = "01.00051.01";
    public static final String CERTIFICATE_NOT_VALID = "01.00052.01";
    public static final String CERT_TRUST_IS_NOT_TIME_VALID = "01.00052.02";
    public static final String CERT_TRUST_IS_NOT_TIME_NESTED = "01.00052.03";
    public static final String CERT_TRUST_IS_REVOKED = "01.00052.04";
    public static final String CERT_TRUST_IS_NOT_SIGNATURE_VALID = "01.00052.05";
    public static final String CERT_TRUST_IS_NOT_VALID_FOR_USAGE = "01.00052.06";
    public static final String CERT_TRUST_IS_UNTRUSTED_ROOT = "01.00052.07";
    public static final String CERT_TRUST_REVOCATION_STATUS_UNKNOWN = "01.00052.08";
    public static final String CERT_TRUST_IS_CYCLIC = "01.00052.09";
    public static final String CERT_TRUST_INVALID_EXTENSION = "01.00052.10";
    public static final String CERT_TRUST_INVALID_POLICY_CONSTRAINTS = "01.00052.11";
    public static final String CERT_TRUST_INVALID_BASIC_CONSTRAINTS = "01.00052.12";
    public static final String CERT_TRUST_INVALID_NAME_CONSTRAINTS = "01.00052.13";
    public static final String CERT_TRUST_HAS_NOT_SUPPORTED_NAME_CONSTRAINT = "01.00052.14";
    public static final String CERT_TRUST_HAS_NOT_DEFINED_NAME_CONSTRAINT = "01.00052.16";
    public static final String CERT_TRUST_HAS_EXCLUDED_NAME_CONSTRAINT = "01.00052.17";
    public static final String CERT_TRUST_IS_OFFLINE_REVOCATION = "01.00052.18";
    public static final String CERT_TRUST_NO_ISSUANCE_CHAIN_POLICY = "01.00052.19";
    public static final String CERT_TRUST_IS_PARTIAL_CHAIN = "01.00052.20";
    public static final String CERT_TRUST_CTL_IS_NOT_TIME_VALID = "01.00052.21";
    public static final String CERT_TRUST_CTL_IS_NOT_SIGNATURE_VALID = "01.00052.22";
    public static final String CERT_TRUST_CTL_IS_NOT_VALID_FOR_USAGE = "01.00052.23";
    public static final String CANT_CREATE_CERT_CHAIN_ENGINE = "01.00052.24";
    public static final String CANT_GET_CERT_CHAIN = "01.00052.25";
    public static final String CERT_TRUST_HAS_NOT_PERMITTED_NAME_CONSTRAINT = "01.00052.26";
    public static final String CCSE_CANT_LOAD_LIB = "01.00053.01";
    public static final String CCSE_CANT_GET_OBJECT = "01.00053.02";
    public static final String CCSE_AUTHTYPE_DENAID = "01.00053.03";
    public static final String CCSE_PROXY_AUTHTYPE_DENAID = "01.00053.04";
    public static final String CCSE_ADDRESS_DENAID = "01.00053.05";
    public static final String CCSE_ADITIONS_DENAID = "01.00053.06";
    public static final String CCSE_SREQUEST_DENAID = "01.00053.07";
    public static final String CCSE_NSREQUEST_DENAID = "01.00053.08";
    public static final String CCSE_TIME_NOTVALID = "01.00053.09";
    public static final String CCSE_SERVICE_ADDRESS_NOTVALID = "01.00053.10";
    public static final String CCSE_RESPONSE_NOTVALID = "01.00053.11";
    public static final String CCSE_THEUPDATE_NOTVALID = "01.00053.12";
    public static final String CCSE_NEXTUPDATE_LESS_THISUPDATE = "01.00053.13";
    public static final String CCSE_ANKNOWN_ERROR = "01.00053.14";
    public static final String CR_UNKNOWN = "01.00054.01";
    public static final String CR_CERT_COMPROMATE = "01.00054.02";
    public static final String CR_ROOT_COMPROMATE = "01.00054.03";
    public static final String CR_CERTINFO_CHANGE = "01.00054.04";
    public static final String CR_CERT_CHANGE = "01.00054.05";
    public static final String CR_NOT_NEED = "01.00054.06";
    public static final String CR_CERT_PAUSED = "01.00054.07";
    public static final String CR_REMOVE_FROM_CRL = "01.00054.08";
    public static final String CR_CERT_PREV_RECALL = "01.00054.09";
    public static final String CR_ATRROOT_COMPROMATE = "01.00054.10";
    public static final String CR_CERT_STATUS_UNKNOWN = "01.00054.11";
    public static final String CR_CERT_STATUS_VALUE_UNKNOWN = "01.00054.12";
    public static final String FATAL = "09.96669.99";
    private static HashMap<String, ErrorDescription> _errorDescs = new HashMap();
    private static HashMap<Long, String> _certCheckErrors;
    private static HashMap<Long, String> _certCheckServiceErrors;
    private static HashMap<Long, String> _certNotValidReasons;

    static
    {
        _errorDescs.put("00.00000.00", new ErrorDescription("00.00000.00", 4, "Проверка успешно завершена. Наложенная ЭЦП корректна."));

        _errorDescs.put("01.00051.01", new ErrorDescription("01.00051.01", 3, "Некорректная ЭЦП."));

        _errorDescs.put("01.00052.01", new ErrorDescription("01.00052.01", 3, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00052.02", new ErrorDescription("01.00052.02", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_NOT_TIME_VALID"));
        _errorDescs.put("01.00052.03", new ErrorDescription("01.00052.03", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_NOT_TIME_NESTED"));
        _errorDescs.put("01.00052.04", new ErrorDescription("01.00052.04", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_REVOKED"));
        _errorDescs.put("01.00052.05", new ErrorDescription("01.00052.05", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_NOT_SIGNATURE_VALID"));
        _errorDescs.put("01.00052.06", new ErrorDescription("01.00052.06", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_NOT_VALID_FOR_USAGE"));
        _errorDescs.put("01.00052.07", new ErrorDescription("01.00052.07", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_UNTRUSTED_ROOT"));
        _errorDescs.put("01.00052.08", new ErrorDescription("01.00052.08", 3, "Ошибка проверки сертификата. CERT_TRUST_REVOCATION_STATUS_UNKNOWN"));
        _errorDescs.put("01.00052.09", new ErrorDescription("01.00052.09", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_CYCLIC"));
        _errorDescs.put("01.00052.10", new ErrorDescription("01.00052.10", 3, "Ошибка проверки сертификата. CERT_TRUST_INVALID_EXTENSION"));
        _errorDescs.put("01.00052.11", new ErrorDescription("01.00052.11", 3, "Ошибка проверки сертификата. CERT_TRUST_INVALID_POLICY_CONSTRAINTS"));
        _errorDescs.put("01.00052.12", new ErrorDescription("01.00052.12", 3, "Ошибка проверки сертификата. CERT_TRUST_INVALID_BASIC_CONSTRAINTS"));
        _errorDescs.put("01.00052.13", new ErrorDescription("01.00052.13", 3, "Ошибка проверки сертификата. CERT_TRUST_INVALID_NAME_CONSTRAINTS"));
        _errorDescs.put("01.00052.14", new ErrorDescription("01.00052.14", 3, "Ошибка проверки сертификата. CERT_TRUST_HAS_NOT_SUPPORTED_NAME_CONSTRAINT"));
        _errorDescs.put("01.00052.16", new ErrorDescription("01.00052.16", 3, "Ошибка проверки сертификата. CERT_TRUST_HAS_NOT_DEFINED_NAME_CONSTRAINT"));
        _errorDescs.put("01.00052.17", new ErrorDescription("01.00052.17", 3, "Ошибка проверки сертификата. CERT_TRUST_HAS_EXCLUDED_NAME_CONSTRAINT"));
        _errorDescs.put("01.00052.18", new ErrorDescription("01.00052.18", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_OFFLINE_REVOCATION"));
        _errorDescs.put("01.00052.19", new ErrorDescription("01.00052.19", 3, "Ошибка проверки сертификата. CERT_TRUST_NO_ISSUANCE_CHAIN_POLICY"));
        _errorDescs.put("01.00052.20", new ErrorDescription("01.00052.20", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_PARTIAL_CHAIN"));
        _errorDescs.put("01.00052.21", new ErrorDescription("01.00052.21", 3, "Ошибка проверки сертификата. CERT_TRUST_CTL_IS_NOT_TIME_VALID"));
        _errorDescs.put("01.00052.22", new ErrorDescription("01.00052.22", 3, "Ошибка проверки сертификата. CERT_TRUST_CTL_IS_NOT_SIGNATURE_VALID"));
        _errorDescs.put("01.00052.23", new ErrorDescription("01.00052.23", 3, "Ошибка проверки сертификата. CERT_TRUST_CTL_IS_NOT_VALID_FOR_USAGE"));
        _errorDescs.put("01.00052.24", new ErrorDescription("01.00052.24", 3, "Ошибка проверки сертификата. CANT_CREATE_CERT_CHAIN_ENGINE"));
        _errorDescs.put("01.00052.25", new ErrorDescription("01.00052.25", 3, "Ошибка проверки сертификата. CANT_GET_CERT_CHAIN"));
        _errorDescs.put("01.00052.26", new ErrorDescription("01.00052.26", 3, "Ошибка проверки сертификата. CERT_TRUST_HAS_NOT_PERMITTED_NAME_CONSTRAINT"));

        _errorDescs.put("01.00053.01", new ErrorDescription("01.00053.01", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.02", new ErrorDescription("01.00053.02", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.03", new ErrorDescription("01.00053.03", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.04", new ErrorDescription("01.00053.04", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.05", new ErrorDescription("01.00053.05", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.06", new ErrorDescription("01.00053.06", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.07", new ErrorDescription("01.00053.07", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.08", new ErrorDescription("01.00053.08", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.09", new ErrorDescription("01.00053.09", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.10", new ErrorDescription("01.00053.10", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.11", new ErrorDescription("01.00053.11", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.12", new ErrorDescription("01.00053.12", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.13", new ErrorDescription("01.00053.13", 2, "Ошибка проверки сертификата."));
        _errorDescs.put("01.00053.14", new ErrorDescription("01.00053.14", 2, "Ошибка проверки сертификата."));

        _errorDescs.put("01.00054.01", new ErrorDescription("01.00054.01", 3, "Сертификат отозван. Причина отзыва не определена."));
        _errorDescs.put("01.00054.02", new ErrorDescription("01.00054.02", 3, "Сертификат скомпрометирован."));
        _errorDescs.put("01.00054.03", new ErrorDescription("01.00054.03", 3, "Центр сертификации скомпрометирован."));
        _errorDescs.put("01.00054.04", new ErrorDescription("01.00054.04", 3, "В сертификате изменилась информация."));
        _errorDescs.put("01.00054.05", new ErrorDescription("01.00054.05", 3, "Сертификат замещен."));
        _errorDescs.put("01.00054.06", new ErrorDescription("01.00054.06", 3, "Сертификат больше не нужен для тех целей, для которых выпускался."));
        _errorDescs.put("01.00054.07", new ErrorDescription("01.00054.07", 3, "Действие сертификата приостановлено."));
        _errorDescs.put("01.00054.08", new ErrorDescription("01.00054.08", 3, "Убрать сертификат из CRL (используется только в разностных CRL)."));
        _errorDescs.put("01.00054.09", new ErrorDescription("01.00054.09", 3, "Привилегия, подтверждаемая данным сертификатом, была отозвана."));
        _errorDescs.put("01.00054.10", new ErrorDescription("01.00054.10", 3, "Скомпрометирован центр, выпускающий атрибутные сертификаты."));
        _errorDescs.put("01.00054.11", new ErrorDescription("01.00054.11", 3, "Статус сертификата неизвестен."));
        _errorDescs.put("01.00054.12", new ErrorDescription("01.00054.12", 3, "Неизвестное значение статуса."));

        _errorDescs.put("09.96669.99", new ErrorDescription("09.96669.99", 1, "Общая  ошибка  обработки сообщения."));

        _certCheckErrors = new HashMap();
        _certCheckErrors.put(Long.valueOf(1342177281L), "01.00052.02");
        _certCheckErrors.put(Long.valueOf(1342177282L), "01.00052.03");
        _certCheckErrors.put(Long.valueOf(1342177284L), "01.00052.04");
        _certCheckErrors.put(Long.valueOf(1342177288L), "01.00052.05");
        _certCheckErrors.put(Long.valueOf(1342177296L), "01.00052.06");
        _certCheckErrors.put(Long.valueOf(1342177312L), "01.00052.07");
        _certCheckErrors.put(Long.valueOf(1342177344L), "01.00052.08");
        _certCheckErrors.put(Long.valueOf(1342177408L), "01.00052.09");
        _certCheckErrors.put(Long.valueOf(1342177536L), "01.00052.10");
        _certCheckErrors.put(Long.valueOf(1342177792L), "01.00052.11");
        _certCheckErrors.put(Long.valueOf(1342178304L), "01.00052.12");
        _certCheckErrors.put(Long.valueOf(1342179328L), "01.00052.13");
        _certCheckErrors.put(Long.valueOf(1342181376L), "01.00052.14");
        _certCheckErrors.put(Long.valueOf(1342185472L), "01.00052.16");
        _certCheckErrors.put(Long.valueOf(1342193664L), "01.00052.26");
        _certCheckErrors.put(Long.valueOf(1342210048L), "01.00052.17");
        _certCheckErrors.put(Long.valueOf(1358954496L), "01.00052.18");
        _certCheckErrors.put(Long.valueOf(1375731712L), "01.00052.19");
        _certCheckErrors.put(Long.valueOf(1342242816L), "01.00052.20");
        _certCheckErrors.put(Long.valueOf(1342308352L), "01.00052.21");
        _certCheckErrors.put(Long.valueOf(1342439424L), "01.00052.22");
        _certCheckErrors.put(Long.valueOf(1342701568L), "01.00052.23");
        _certCheckErrors.put(Long.valueOf(1392508929L), "01.00052.24");
        _certCheckErrors.put(Long.valueOf(1392508930L), "01.00052.25");

        _certCheckServiceErrors = new HashMap();
        _certCheckServiceErrors.put(Long.valueOf(553648129L), "01.00053.01");
        _certCheckServiceErrors.put(Long.valueOf(553648130L), "01.00053.02");
        _certCheckServiceErrors.put(Long.valueOf(570425345L), "01.00053.03");
        _certCheckServiceErrors.put(Long.valueOf(570425346L), "01.00053.04");
        _certCheckServiceErrors.put(Long.valueOf(570425347L), "01.00053.05");
        _certCheckServiceErrors.put(Long.valueOf(570425348L), "01.00053.06");
        _certCheckServiceErrors.put(Long.valueOf(570425349L), "01.00053.07");
        _certCheckServiceErrors.put(Long.valueOf(570425350L), "01.00053.08");
        _certCheckServiceErrors.put(Long.valueOf(570425351L), "01.00053.09");
        _certCheckServiceErrors.put(Long.valueOf(570425352L), "01.00053.10");
        _certCheckServiceErrors.put(Long.valueOf(570425353L), "01.00053.11");
        _certCheckServiceErrors.put(Long.valueOf(570425354L), "01.00053.12");
        _certCheckServiceErrors.put(Long.valueOf(570425355L), "01.00053.13");
        _certCheckServiceErrors.put(Long.valueOf(587202559L), "01.00053.14");

        _certNotValidReasons = new HashMap();
        _certNotValidReasons.put(Long.valueOf(1073741824L), "01.00054.01");
        _certNotValidReasons.put(Long.valueOf(1073741825L), "01.00054.02");
        _certNotValidReasons.put(Long.valueOf(1073741826L), "01.00054.03");
        _certNotValidReasons.put(Long.valueOf(1073741827L), "01.00054.04");
        _certNotValidReasons.put(Long.valueOf(1073741828L), "01.00054.05");
        _certNotValidReasons.put(Long.valueOf(1073741829L), "01.00054.06");
        _certNotValidReasons.put(Long.valueOf(1073741830L), "01.00054.07");
        _certNotValidReasons.put(Long.valueOf(1073741832L), "01.00054.08");
        _certNotValidReasons.put(Long.valueOf(1073741833L), "01.00054.09");
        _certNotValidReasons.put(Long.valueOf(1073741840L), "01.00054.10");
    }

    private static ErrorDescription getErrorDesc(String errorCode)
    {
        ErrorDescription desc = (ErrorDescription)_errorDescs.get(errorCode);
        if (null == desc) {
            desc = new ErrorDescription(errorCode, 1, "FATAL ERROR.");
        }
        return desc;
    }

    public static DocumentCheckResult createResult(String errorCode, String refDocumentId)
    {
        ErrorDescription desc = getErrorDesc(errorCode);

        return createResult(errorCode, desc.category, refDocumentId, desc.description);
    }

    public static DocumentCheckResult createResult(String errorCode, String refDocumentId, String validationError)
    {
        ErrorDescription desc = getErrorDesc(errorCode);

        return createResult(errorCode, desc.category, refDocumentId, String.format("%s; %s", new Object[] { desc.description, validationError }));
    }

    public static DocumentCheckResult createResult(String errorCode, int errorCategory, String refDocumentId, String description)
    {
        DocumentCheckResult res = new DocumentCheckResult();
        res.setRefDocumentId(refDocumentId);

        List<ResultInformation> infos = new ArrayList();
        res.setInformation(infos);

        ResultInformation info = new ResultInformation();
        info.setCode(errorCode);
        info.setCategory(errorCategory);
        info.setDescription(splitDescription(description));
        info.setSource(11);
        infos.add(info);

        return res;
    }

    public static String parseCheckSignCryptoCode(int returnCode)
    {
        for (Long key : _certCheckErrors.keySet())
        {
            long lkey = key.longValue();
            if (returnCode == (returnCode & lkey)) {
                return (String)_certCheckErrors.get(key);
            }
        }
        for (Long key : _certCheckServiceErrors.keySet())
        {
            long lkey = key.longValue();
            if (returnCode == (returnCode & lkey)) {
                return (String)_certCheckServiceErrors.get(key);
            }
        }
        for (Long key : _certNotValidReasons.keySet())
        {
            long lkey = key.longValue();
            if (returnCode == (returnCode & lkey)) {
                return (String)_certNotValidReasons.get(key);
            }
        }
        return "01.00051.01";
    }

    public static String getErrorDescription(int errorCode)
    {
        return ((ErrorDescription)_errorDescs.get(parseCheckSignCryptoCode(errorCode))).description;
    }

    private static List<String> splitDescription(String description)
    {
        List<String> res = new ArrayList();

        String part = description;
        while (part.length() > 0) {
            if (part.length() < 250)
            {
                res.add(part);
                part = "";
            }
            else
            {
                res.add(part.substring(0, 250));
                part = part.substring(250);
            }
        }
        return res;
    }

    private static class ErrorDescription
    {
        public String code;
        public int category;
        public String description;

        public ErrorDescription() {}

        public ErrorDescription(String code, int category, String description)
        {
            this.code = code;
            this.category = category;
            this.description = description;
        }
    }
}
