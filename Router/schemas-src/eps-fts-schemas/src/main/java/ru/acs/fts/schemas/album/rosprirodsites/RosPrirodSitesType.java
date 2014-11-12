
package ru.acs.fts.schemas.album.rosprirodsites;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.AuthorizedPersonType;

/** 
 * Ответ на запрос разрешения на вывоз из Российской Федерации и ввоз в Российскую Федерацию видов дикой фауны и флоры
 */
public class RosPrirodSitesType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String opeartion;
    private String regNumber;
    private LocalDate endDate;
    private String specialConditions;
    private String blankNumber;
    private LocalDate dateBegin;
    private CUOrganizationType importer;
    private CUOrganizationType exporter;
    private AuthorizedPersonType authorizedPerson;
    private List<ObjectType> objectList = new ArrayList<ObjectType>();
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocumentId' element value. Id документа
     * 
     * @return value
     */
    public String getDocumentId() {
        return documentId;
    }

    /** 
     * Set the 'DocumentId' element value. Id документа
     * 
     * @param documentId
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /** 
     * Get the 'Opeartion' element value. Признак (ЭК, ИМ, Реэкспорт, Интродукция)/EXPORT, IMPORT, REEXPORT, INTRODUCTION/
     * 
     * @return value
     */
    public String getOpeartion() {
        return opeartion;
    }

    /** 
     * Set the 'Opeartion' element value. Признак (ЭК, ИМ, Реэкспорт, Интродукция)/EXPORT, IMPORT, REEXPORT, INTRODUCTION/
     * 
     * @param opeartion
     */
    public void setOpeartion(String opeartion) {
        this.opeartion = opeartion;
    }

    /** 
     * Get the 'RegNumber' element value. Номер разрешения (сертификата)
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. Номер разрешения (сертификата)
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'EndDate' element value. Действительно до
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Действительно до
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'SpecialConditions' element value. Особые условия
     * 
     * @return value
     */
    public String getSpecialConditions() {
        return specialConditions;
    }

    /** 
     * Set the 'SpecialConditions' element value. Особые условия
     * 
     * @param specialConditions
     */
    public void setSpecialConditions(String specialConditions) {
        this.specialConditions = specialConditions;
    }

    /** 
     * Get the 'BlankNumber' element value. Номер бланка
     * 
     * @return value
     */
    public String getBlankNumber() {
        return blankNumber;
    }

    /** 
     * Set the 'BlankNumber' element value. Номер бланка
     * 
     * @param blankNumber
     */
    public void setBlankNumber(String blankNumber) {
        this.blankNumber = blankNumber;
    }

    /** 
     * Get the 'DateBegin' element value. Дата начала документа
     * 
     * @return value
     */
    public LocalDate getDateBegin() {
        return dateBegin;
    }

    /** 
     * Set the 'DateBegin' element value. Дата начала документа
     * 
     * @param dateBegin
     */
    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    /** 
     * Get the 'Importer' element value. Импортер
     * 
     * @return value
     */
    public CUOrganizationType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. Импортер
     * 
     * @param importer
     */
    public void setImporter(CUOrganizationType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'Exporter' element value. Экспортер
     * 
     * @return value
     */
    public CUOrganizationType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. Экспортер
     * 
     * @param exporter
     */
    public void setExporter(CUOrganizationType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Уполномоченное должностное лицо (ФИО, должность, номер печати), подписавшее заключение
     * 
     * @return value
     */
    public AuthorizedPersonType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное должностное лицо (ФИО, должность, номер печати), подписавшее заключение
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(AuthorizedPersonType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the list of 'Object' element items. Животное или растение, включенное в приложение СИТЕС, на ввоз/вывоз которого выдано разрешение
     * 
     * @return list
     */
    public List<ObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. Животное или растение, включенное в приложение СИТЕС, на ввоз/вывоз которого выдано разрешение
     * 
     * @param list
     */
    public void setObjectList(List<ObjectType> list) {
        objectList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
