
package ru.acs.fts.schemas.album.gtdincustomsmark;

import org.joda.time.LocalDate;

/** 
 * Технологические отметки.
 */
public class TechMarksType
{
    private String EXTRNL;
    private String SCHET;
    private String STEPCTRL;
    private String presenceDTS;
    private String presenceKTS;
    private String STAT;
    private String frontierCustomsCode;
    private String elDeclIndicator;
    private String SDSSRV;
    private String SDSNUM;
    private LocalDate GDDF;
    private LocalDate modificationDate;
    private String modificationTime;
    private String EDOCGUID;
    private String EDOCID;
    private String PSTATUS1;
    private String PSTATUS2;

    /** 
     * Get the 'EXTRNL' element value. Служебное поле.
     * 
     * @return value
     */
    public String getEXTRNL() {
        return EXTRNL;
    }

    /** 
     * Set the 'EXTRNL' element value. Служебное поле.
     * 
     * @param EXTRNL
     */
    public void setEXTRNL(String EXTRNL) {
        this.EXTRNL = EXTRNL;
    }

    /** 
     * Get the 'SCHET' element value. Служебное поле. Подписи этапов.
     * 
     * @return value
     */
    public String getSCHET() {
        return SCHET;
    }

    /** 
     * Set the 'SCHET' element value. Служебное поле. Подписи этапов.
     * 
     * @param SCHET
     */
    public void setSCHET(String SCHET) {
        this.SCHET = SCHET;
    }

    /** 
     * Get the 'STEPCTRL' element value. Служебное поле. Этапы контроля.
     * 
     * @return value
     */
    public String getSTEPCTRL() {
        return STEPCTRL;
    }

    /** 
     * Set the 'STEPCTRL' element value. Служебное поле. Этапы контроля.
     * 
     * @param STEPCTRL
     */
    public void setSTEPCTRL(String STEPCTRL) {
        this.STEPCTRL = STEPCTRL;
    }

    /** 
     * Get the 'PresenceDTS' element value. Наличие ДТС ("1"-есть)
     * 
     * @return value
     */
    public String getPresenceDTS() {
        return presenceDTS;
    }

    /** 
     * Set the 'PresenceDTS' element value. Наличие ДТС ("1"-есть)
     * 
     * @param presenceDTS
     */
    public void setPresenceDTS(String presenceDTS) {
        this.presenceDTS = presenceDTS;
    }

    /** 
     * Get the 'PresenceKTS' element value. Наличие КТС ("1"-есть)
     * 
     * @return value
     */
    public String getPresenceKTS() {
        return presenceKTS;
    }

    /** 
     * Set the 'PresenceKTS' element value. Наличие КТС ("1"-есть)
     * 
     * @param presenceKTS
     */
    public void setPresenceKTS(String presenceKTS) {
        this.presenceKTS = presenceKTS;
    }

    /** 
     * Get the 'STAT' element value. Признак учета в таможенной статистике внешней торговли (0 - все товары ДТ не учитываются  в статистике внешней торговли, 1 - хотя бы один товар ДТ учитывается в статистике внешней торговли)
     * 
     * @return value
     */
    public String getSTAT() {
        return STAT;
    }

    /** 
     * Set the 'STAT' element value. Признак учета в таможенной статистике внешней торговли (0 - все товары ДТ не учитываются  в статистике внешней торговли, 1 - хотя бы один товар ДТ учитывается в статистике внешней торговли)
     * 
     * @param STAT
     */
    public void setSTAT(String STAT) {
        this.STAT = STAT;
    }

    /** 
     * Get the 'FrontierCustomsCode' element value. Код приграничного таможенного органа
     * 
     * @return value
     */
    public String getFrontierCustomsCode() {
        return frontierCustomsCode;
    }

    /** 
     * Set the 'FrontierCustomsCode' element value. Код приграничного таможенного органа
     * 
     * @param frontierCustomsCode
     */
    public void setFrontierCustomsCode(String frontierCustomsCode) {
        this.frontierCustomsCode = frontierCustomsCode;
    }

    /** 
     * Get the 'ElDeclIndicator' element value. Признак применения электронной формы декларирования: 
     * 
     * @return value
     */
    public String getElDeclIndicator() {
        return elDeclIndicator;
    }

    /** 
     * Set the 'ElDeclIndicator' element value. Признак применения электронной формы декларирования: 
     * 
     * @param elDeclIndicator
     */
    public void setElDeclIndicator(String elDeclIndicator) {
        this.elDeclIndicator = elDeclIndicator;
    }

    /** 
     * Get the 'SDS_SRV' element value. Служебный код, используется для целей электронного декларирования 
     * 
     * @return value
     */
    public String getSDSSRV() {
        return SDSSRV;
    }

    /** 
     * Set the 'SDS_SRV' element value. Служебный код, используется для целей электронного декларирования 
     * 
     * @param SDSSRV
     */
    public void setSDSSRV(String SDSSRV) {
        this.SDSSRV = SDSSRV;
    }

    /** 
     * Get the 'SDS_NUM' element value. Служебный номер, используется для целей электронного декларирования 
     * 
     * @return value
     */
    public String getSDSNUM() {
        return SDSNUM;
    }

    /** 
     * Set the 'SDS_NUM' element value. Служебный номер, используется для целей электронного декларирования 
     * 
     * @param SDSNUM
     */
    public void setSDSNUM(String SDSNUM) {
        this.SDSNUM = SDSNUM;
    }

    /** 
     * Get the 'GDDF' element value. Дата фактического перемещения товаров.
     * 
     * @return value
     */
    public LocalDate getGDDF() {
        return GDDF;
    }

    /** 
     * Set the 'GDDF' element value. Дата фактического перемещения товаров.
     * 
     * @param GDDF
     */
    public void setGDDF(LocalDate GDDF) {
        this.GDDF = GDDF;
    }

    /** 
     * Get the 'ModificationDate' element value. Дата последнего внесения изменений в документ.
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. Дата последнего внесения изменений в документ.
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'ModificationTime' element value. Время последнего внесения изменений в ДТС.
     * 
     * @return value
     */
    public String getModificationTime() {
        return modificationTime;
    }

    /** 
     * Set the 'ModificationTime' element value. Время последнего внесения изменений в ДТС.
     * 
     * @param modificationTime
     */
    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /** 
     * Get the 'EDOC_GUID' element value. Глобальный идентификатор ДТ. Формируется системой таможенного оформления и контроля.
     * 
     * @return value
     */
    public String getEDOCGUID() {
        return EDOCGUID;
    }

    /** 
     * Set the 'EDOC_GUID' element value. Глобальный идентификатор ДТ. Формируется системой таможенного оформления и контроля.
     * 
     * @param EDOCGUID
     */
    public void setEDOCGUID(String EDOCGUID) {
        this.EDOCGUID = EDOCGUID;
    }

    /** 
     * Get the 'EDOC_ID' element value. Идентификатор документа в пакете.
     * 
     * @return value
     */
    public String getEDOCID() {
        return EDOCID;
    }

    /** 
     * Set the 'EDOC_ID' element value. Идентификатор документа в пакете.
     * 
     * @param EDOCID
     */
    public void setEDOCID(String EDOCID) {
        this.EDOCID = EDOCID;
    }

    /** 
     * Get the 'P_STATUS1' element value. Прикладной статус ДТ (1- зарегистрированная 2 - оформленная ДТ)
     * 
     * @return value
     */
    public String getPSTATUS1() {
        return PSTATUS1;
    }

    /** 
     * Set the 'P_STATUS1' element value. Прикладной статус ДТ (1- зарегистрированная 2 - оформленная ДТ)
     * 
     * @param PSTATUS1
     */
    public void setPSTATUS1(String PSTATUS1) {
        this.PSTATUS1 = PSTATUS1;
    }

    /** 
     * Get the 'P_STATUS2' element value. Статус обработки (Не заполнено; 1 - Документ изменен на основании требования на техническую корректировку)
     * 
     * @return value
     */
    public String getPSTATUS2() {
        return PSTATUS2;
    }

    /** 
     * Set the 'P_STATUS2' element value. Статус обработки (Не заполнено; 1 - Документ изменен на основании требования на техническую корректировку)
     * 
     * @param PSTATUS2
     */
    public void setPSTATUS2(String PSTATUS2) {
        this.PSTATUS2 = PSTATUS2;
    }
}
