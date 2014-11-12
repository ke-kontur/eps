
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Отчёт о ввозимых, вывозимых, хранящихся, изготавливаемых, перерабатываемых, приобретаемых и реализуемых товарах на территории ОЭЗ
 */
public class OEZReportType extends BaseDocType
{
    private LocalDate reportDate;
    private List<String> formNumList = new ArrayList<String>();
    private CustomsType customs;
    private CompanyType declarant;
    private ReportingPeriodType reportingPeriod;
    private PersonSignatureType residentPersonSignature;
    private Table1Type table1;
    private Table2Type table2;
    private Table3Type table3;
    private Table4Type table4;
    private GTDIDType registryNumber;
    private List<GTDIDType> declarationNumForReportList = new ArrayList<GTDIDType>();
    private String documentModeID;

    /** 
     * Get the 'ReportDate' element value. Дата подачи отчёта
     * 
     * @return value
     */
    public LocalDate getReportDate() {
        return reportDate;
    }

    /** 
     * Set the 'ReportDate' element value. Дата подачи отчёта
     * 
     * @param reportDate
     */
    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    /** 
     * Get the list of 'FormNum' element items. Номер формы
     * 
     * @return list
     */
    public List<String> getFormNumList() {
        return formNumList;
    }

    /** 
     * Set the list of 'FormNum' element items. Номер формы
     * 
     * @param list
     */
    public void setFormNumList(List<String> list) {
        formNumList = list;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о лице или об организации, которая подаёт отчёт
     * 
     * @return value
     */
    public CompanyType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о лице или об организации, которая подаёт отчёт
     * 
     * @param declarant
     */
    public void setDeclarant(CompanyType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'ReportingPeriod' element value. Отчётный период
     * 
     * @return value
     */
    public ReportingPeriodType getReportingPeriod() {
        return reportingPeriod;
    }

    /** 
     * Set the 'ReportingPeriod' element value. Отчётный период
     * 
     * @param reportingPeriod
     */
    public void setReportingPeriod(ReportingPeriodType reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }

    /** 
     * Get the 'ResidentPersonSignature' element value. Ф.И.О., подпись уполномоченного лица, на которое возложена ответственность составления отчетности, дата
     * 
     * @return value
     */
    public PersonSignatureType getResidentPersonSignature() {
        return residentPersonSignature;
    }

    /** 
     * Set the 'ResidentPersonSignature' element value. Ф.И.О., подпись уполномоченного лица, на которое возложена ответственность составления отчетности, дата
     * 
     * @param residentPersonSignature
     */
    public void setResidentPersonSignature(
            PersonSignatureType residentPersonSignature) {
        this.residentPersonSignature = residentPersonSignature;
    }

    /** 
     * Get the 'Table1' element value. Таблица 1. Отчет о товарах, ввезенных в соответствии с таможенным режимом СТЗ
     * 
     * @return value
     */
    public Table1Type getTable1() {
        return table1;
    }

    /** 
     * Set the 'Table1' element value. Таблица 1. Отчет о товарах, ввезенных в соответствии с таможенным режимом СТЗ
     * 
     * @param table1
     */
    public void setTable1(Table1Type table1) {
        this.table1 = table1;
    }

    /** 
     * Get the 'Table2' element value. Таблица 2. Отчет о товарах, помещенных под таможенный режим свободной таможенной зоны в целях
     * 
     * @return value
     */
    public Table2Type getTable2() {
        return table2;
    }

    /** 
     * Set the 'Table2' element value. Таблица 2. Отчет о товарах, помещенных под таможенный режим свободной таможенной зоны в целях
     * 
     * @param table2
     */
    public void setTable2(Table2Type table2) {
        this.table2 = table2;
    }

    /** 
     * Get the 'Table3' element value. Таблица 3. Отчет о товарах, изготовленных(полученных) из товаров, помещенных под таможенную процедуру свободной таможенной зоны по форме 3
     * 
     * @return value
     */
    public Table3Type getTable3() {
        return table3;
    }

    /** 
     * Set the 'Table3' element value. Таблица 3. Отчет о товарах, изготовленных(полученных) из товаров, помещенных под таможенную процедуру свободной таможенной зоны по форме 3
     * 
     * @param table3
     */
    public void setTable3(Table3Type table3) {
        this.table3 = table3;
    }

    /** 
     * Get the 'Table4' element value. Таблица 4. Отчет о товарах, изготовленных (полученных) из товаров, помещенных под таможенную процедуру свободной таможенной зоны
     * 
     * @return value
     */
    public Table4Type getTable4() {
        return table4;
    }

    /** 
     * Set the 'Table4' element value. Таблица 4. Отчет о товарах, изготовленных (полученных) из товаров, помещенных под таможенную процедуру свободной таможенной зоны
     * 
     * @param table4
     */
    public void setTable4(Table4Type table4) {
        this.table4 = table4;
    }

    /** 
     * Get the 'RegistryNumber' element value. Регистрационный номер отчёта
     * 
     * @return value
     */
    public GTDIDType getRegistryNumber() {
        return registryNumber;
    }

    /** 
     * Set the 'RegistryNumber' element value. Регистрационный номер отчёта
     * 
     * @param registryNumber
     */
    public void setRegistryNumber(GTDIDType registryNumber) {
        this.registryNumber = registryNumber;
    }

    /** 
     * Get the list of 'DeclarationNumForReport' element items. Номер таможенной декларации, содержащий информацию о товарах, помещенных под таможенную процедуру СТЗ
     * 
     * @return list
     */
    public List<GTDIDType> getDeclarationNumForReportList() {
        return declarationNumForReportList;
    }

    /** 
     * Set the list of 'DeclarationNumForReport' element items. Номер таможенной декларации, содержащий информацию о товарах, помещенных под таможенную процедуру СТЗ
     * 
     * @param list
     */
    public void setDeclarationNumForReportList(List<GTDIDType> list) {
        declarationNumForReportList = list;
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
