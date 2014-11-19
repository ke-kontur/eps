
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ДТ и ТД. Внутренний формат. Служебные отметки по ДТ
 */
public class ESADCommonOfficialMarkType
{
    private String GRNumber;
    private String stageMarkIdentifier;
    private String noteMarkIdentifier;
    private String informationTypeCode;
    private String markDescription;
    private LocalDate dateInf;
    private String timeInf;
    private String amount;
    private String paymentTypeCode;
    private String postponementProcent;
    private String code;
    private String currencyName;
    private String personName;
    private String LNP;
    private LocalDate goodsDevisionDate;
    private String goodsDevisionTime;
    private LocalDate deadline;
    private String customsCode;
    private LocalDate customsActionDate;
    private String documentIndicator;
    private String deadlineMonth;
    private DocumentBaseType documentInfo;
    private OrganizationBaseType commonMarkOrganization;

    /** 
     * Get the 'GRNumber' element value. Обозначение графы (подраздела графы) (A,C,D,E1,E2,28)  Графе D/J соответствует 'D'. Графам E, E/J соответствуют:'E1' - верхний (первый) подраздел графы E(E/J); 'E2' - нижний (второй) подраздел графы E(E/J)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. Обозначение графы (подраздела графы) (A,C,D,E1,E2,28)  Графе D/J соответствует 'D'. Графам E, E/J соответствуют:'E1' - верхний (первый) подраздел графы E(E/J); 'E2' - нижний (второй) подраздел графы E(E/J)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the 'StageMarkIdentifier' element value. Идентификатор проставленной технологической отметки - 1 (номер этапа)
     * 
     * @return value
     */
    public String getStageMarkIdentifier() {
        return stageMarkIdentifier;
    }

    /** 
     * Set the 'StageMarkIdentifier' element value. Идентификатор проставленной технологической отметки - 1 (номер этапа)
     * 
     * @param stageMarkIdentifier
     */
    public void setStageMarkIdentifier(String stageMarkIdentifier) {
        this.stageMarkIdentifier = stageMarkIdentifier;
    }

    /** 
     * Get the 'NoteMarkIdentifier' element value. Идентификатор проставленной технологической отметки  -  2 (тип примечания)
     * 
     * @return value
     */
    public String getNoteMarkIdentifier() {
        return noteMarkIdentifier;
    }

    /** 
     * Set the 'NoteMarkIdentifier' element value. Идентификатор проставленной технологической отметки  -  2 (тип примечания)
     * 
     * @param noteMarkIdentifier
     */
    public void setNoteMarkIdentifier(String noteMarkIdentifier) {
        this.noteMarkIdentifier = noteMarkIdentifier;
    }

    /** 
     * Get the 'InformationTypeCode' element value. Код типа информации (SKRECC)
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. Код типа информации (SKRECC)
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    /** 
     * Get the 'MarkDescription' element value. Служебная запись / номер документа 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. Служебная запись / номер документа 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'DateInf' element value. Дата проставления отметки/ Дата принятия решения о продлении срока проверки 
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата проставления отметки/ Дата принятия решения о продлении срока проверки 
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. Время
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. Время
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }

    /** 
     * Get the 'Amount' element value. Сумма денежных средств /Суммарный объем отделений транспортных средств / Фактурная стоимость
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма денежных средств /Суммарный объем отделений транспортных средств / Фактурная стоимость
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'PaymentTypeCode' element value. Код вида платежа (пени, штрафы, в случае полной уплаты таможенных пошлин, налогов при помещении товаров под таможенный режим временного ввоза)
     * 
     * @return value
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /** 
     * Set the 'PaymentTypeCode' element value. Код вида платежа (пени, штрафы, в случае полной уплаты таможенных пошлин, налогов при помещении товаров под таможенный режим временного ввоза)
     * 
     * @param paymentTypeCode
     */
    public void setPaymentTypeCode(String paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode;
    }

    /** 
     * Get the 'PostponementProcent' element value. Процент за предоставление отсрочки / рассрочки (заполняется для 91, 93 видов там. платежей)
     * 
     * @return value
     */
    public String getPostponementProcent() {
        return postponementProcent;
    }

    /** 
     * Set the 'PostponementProcent' element value. Процент за предоставление отсрочки / рассрочки (заполняется для 91, 93 видов там. платежей)
     * 
     * @param postponementProcent
     */
    public void setPostponementProcent(String postponementProcent) {
        this.postponementProcent = postponementProcent;
    }

    /** 
     * Get the 'Code' element value. Цифровой код валюты денежных средств / Код единицы измерения / Буквенный код страны Примечание: код страны заполняется для кода типа информации "34"/ Буквенный код валюты (при указании фактурной стоимости) 
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Цифровой код валюты денежных средств / Код единицы измерения / Буквенный код страны Примечание: код страны заполняется для кода типа информации "34"/ Буквенный код валюты (при указании фактурной стоимости) 
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'CurrencyName' element value. Наименование валюты денежных средств / Условное обозначение единицы измерения
     * 
     * @return value
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /** 
     * Set the 'CurrencyName' element value. Наименование валюты денежных средств / Условное обозначение единицы измерения
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /** 
     * Get the 'PersonName' element value. ФИО инспектора, заверившего запись
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО инспектора, заверившего запись
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. Номер ЛНП инспектора, заверившего запись
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. Номер ЛНП инспектора, заверившего запись
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'GoodsDevisionDate' element value. Дата завершения разделения товарной партии на отдельные товары 
     * 
     * @return value
     */
    public LocalDate getGoodsDevisionDate() {
        return goodsDevisionDate;
    }

    /** 
     * Set the 'GoodsDevisionDate' element value. Дата завершения разделения товарной партии на отдельные товары 
     * 
     * @param goodsDevisionDate
     */
    public void setGoodsDevisionDate(LocalDate goodsDevisionDate) {
        this.goodsDevisionDate = goodsDevisionDate;
    }

    /** 
     * Get the 'GoodsDevisionTime' element value. Время
     * 
     * @return value
     */
    public String getGoodsDevisionTime() {
        return goodsDevisionTime;
    }

    /** 
     * Set the 'GoodsDevisionTime' element value. Время
     * 
     * @param goodsDevisionTime
     */
    public void setGoodsDevisionTime(String goodsDevisionTime) {
        this.goodsDevisionTime = goodsDevisionTime;
    }

    /** 
     * Get the 'Deadline' element value. Срок
     * 
     * @return value
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /** 
     * Set the 'Deadline' element value. Срок
     * 
     * @param deadline
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'CustomsActionDate' element value. Дата совершения отдельных таможенных операций
     * 
     * @return value
     */
    public LocalDate getCustomsActionDate() {
        return customsActionDate;
    }

    /** 
     * Set the 'CustomsActionDate' element value. Дата совершения отдельных таможенных операций
     * 
     * @param customsActionDate
     */
    public void setCustomsActionDate(LocalDate customsActionDate) {
        this.customsActionDate = customsActionDate;
    }

    /** 
     * Get the 'DocumentIndicator' element value. Признак документа. Заполняется при указании номера: - акта таможенного досмотра (осмотра) - 'Д', 'О'; - если ДТ является последней полной таможенной декларацией ('Z'); -при проставлении отметки в нижнем подразделе графы E(E/J) под номером 12 (E2 2 12)  ("0"-сведения совпадают; "1"-сведения не совпадают) 
     * 
     * @return value
     */
    public String getDocumentIndicator() {
        return documentIndicator;
    }

    /** 
     * Set the 'DocumentIndicator' element value. Признак документа. Заполняется при указании номера: - акта таможенного досмотра (осмотра) - 'Д', 'О'; - если ДТ является последней полной таможенной декларацией ('Z'); -при проставлении отметки в нижнем подразделе графы E(E/J) под номером 12 (E2 2 12)  ("0"-сведения совпадают; "1"-сведения не совпадают) 
     * 
     * @param documentIndicator
     */
    public void setDocumentIndicator(String documentIndicator) {
        this.documentIndicator = documentIndicator;
    }

    /** 
     * Get the 'DeadlineMonth' element value. Срок продления / общий в месяцах
     * 
     * @return value
     */
    public String getDeadlineMonth() {
        return deadlineMonth;
    }

    /** 
     * Set the 'DeadlineMonth' element value. Срок продления / общий в месяцах
     * 
     * @param deadlineMonth
     */
    public void setDeadlineMonth(String deadlineMonth) {
        this.deadlineMonth = deadlineMonth;
    }

    /** 
     * Get the 'DocumentInfo' element value. Информация о документе (номер, дата)
     * 
     * @return value
     */
    public DocumentBaseType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. Информация о документе (номер, дата)
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocumentBaseType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the 'CommonMarkOrganization' element value. Сведения об организации (лице) 
     * 
     * @return value
     */
    public OrganizationBaseType getCommonMarkOrganization() {
        return commonMarkOrganization;
    }

    /** 
     * Set the 'CommonMarkOrganization' element value. Сведения об организации (лице) 
     * 
     * @param commonMarkOrganization
     */
    public void setCommonMarkOrganization(
            OrganizationBaseType commonMarkOrganization) {
        this.commonMarkOrganization = commonMarkOrganization;
    }
}
