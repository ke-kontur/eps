
package ru.acs.fts.schemas.album.gtdincustomsmark;

import org.joda.time.LocalDate;

/** 
 * ��������������� �������.
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
     * Get the 'EXTRNL' element value. ��������� ����.
     * 
     * @return value
     */
    public String getEXTRNL() {
        return EXTRNL;
    }

    /** 
     * Set the 'EXTRNL' element value. ��������� ����.
     * 
     * @param EXTRNL
     */
    public void setEXTRNL(String EXTRNL) {
        this.EXTRNL = EXTRNL;
    }

    /** 
     * Get the 'SCHET' element value. ��������� ����. ������� ������.
     * 
     * @return value
     */
    public String getSCHET() {
        return SCHET;
    }

    /** 
     * Set the 'SCHET' element value. ��������� ����. ������� ������.
     * 
     * @param SCHET
     */
    public void setSCHET(String SCHET) {
        this.SCHET = SCHET;
    }

    /** 
     * Get the 'STEPCTRL' element value. ��������� ����. ����� ��������.
     * 
     * @return value
     */
    public String getSTEPCTRL() {
        return STEPCTRL;
    }

    /** 
     * Set the 'STEPCTRL' element value. ��������� ����. ����� ��������.
     * 
     * @param STEPCTRL
     */
    public void setSTEPCTRL(String STEPCTRL) {
        this.STEPCTRL = STEPCTRL;
    }

    /** 
     * Get the 'PresenceDTS' element value. ������� ��� ("1"-����)
     * 
     * @return value
     */
    public String getPresenceDTS() {
        return presenceDTS;
    }

    /** 
     * Set the 'PresenceDTS' element value. ������� ��� ("1"-����)
     * 
     * @param presenceDTS
     */
    public void setPresenceDTS(String presenceDTS) {
        this.presenceDTS = presenceDTS;
    }

    /** 
     * Get the 'PresenceKTS' element value. ������� ��� ("1"-����)
     * 
     * @return value
     */
    public String getPresenceKTS() {
        return presenceKTS;
    }

    /** 
     * Set the 'PresenceKTS' element value. ������� ��� ("1"-����)
     * 
     * @param presenceKTS
     */
    public void setPresenceKTS(String presenceKTS) {
        this.presenceKTS = presenceKTS;
    }

    /** 
     * Get the 'STAT' element value. ������� ����� � ���������� ���������� ������� �������� (0 - ��� ������ �� �� �����������  � ���������� ������� ��������, 1 - ���� �� ���� ����� �� ����������� � ���������� ������� ��������)
     * 
     * @return value
     */
    public String getSTAT() {
        return STAT;
    }

    /** 
     * Set the 'STAT' element value. ������� ����� � ���������� ���������� ������� �������� (0 - ��� ������ �� �� �����������  � ���������� ������� ��������, 1 - ���� �� ���� ����� �� ����������� � ���������� ������� ��������)
     * 
     * @param STAT
     */
    public void setSTAT(String STAT) {
        this.STAT = STAT;
    }

    /** 
     * Get the 'FrontierCustomsCode' element value. ��� ������������� ����������� ������
     * 
     * @return value
     */
    public String getFrontierCustomsCode() {
        return frontierCustomsCode;
    }

    /** 
     * Set the 'FrontierCustomsCode' element value. ��� ������������� ����������� ������
     * 
     * @param frontierCustomsCode
     */
    public void setFrontierCustomsCode(String frontierCustomsCode) {
        this.frontierCustomsCode = frontierCustomsCode;
    }

    /** 
     * Get the 'ElDeclIndicator' element value. ������� ���������� ����������� ����� ��������������: 
     * 
     * @return value
     */
    public String getElDeclIndicator() {
        return elDeclIndicator;
    }

    /** 
     * Set the 'ElDeclIndicator' element value. ������� ���������� ����������� ����� ��������������: 
     * 
     * @param elDeclIndicator
     */
    public void setElDeclIndicator(String elDeclIndicator) {
        this.elDeclIndicator = elDeclIndicator;
    }

    /** 
     * Get the 'SDS_SRV' element value. ��������� ���, ������������ ��� ����� ������������ �������������� 
     * 
     * @return value
     */
    public String getSDSSRV() {
        return SDSSRV;
    }

    /** 
     * Set the 'SDS_SRV' element value. ��������� ���, ������������ ��� ����� ������������ �������������� 
     * 
     * @param SDSSRV
     */
    public void setSDSSRV(String SDSSRV) {
        this.SDSSRV = SDSSRV;
    }

    /** 
     * Get the 'SDS_NUM' element value. ��������� �����, ������������ ��� ����� ������������ �������������� 
     * 
     * @return value
     */
    public String getSDSNUM() {
        return SDSNUM;
    }

    /** 
     * Set the 'SDS_NUM' element value. ��������� �����, ������������ ��� ����� ������������ �������������� 
     * 
     * @param SDSNUM
     */
    public void setSDSNUM(String SDSNUM) {
        this.SDSNUM = SDSNUM;
    }

    /** 
     * Get the 'GDDF' element value. ���� ������������ ����������� �������.
     * 
     * @return value
     */
    public LocalDate getGDDF() {
        return GDDF;
    }

    /** 
     * Set the 'GDDF' element value. ���� ������������ ����������� �������.
     * 
     * @param GDDF
     */
    public void setGDDF(LocalDate GDDF) {
        this.GDDF = GDDF;
    }

    /** 
     * Get the 'ModificationDate' element value. ���� ���������� �������� ��������� � ��������.
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. ���� ���������� �������� ��������� � ��������.
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'ModificationTime' element value. ����� ���������� �������� ��������� � ���.
     * 
     * @return value
     */
    public String getModificationTime() {
        return modificationTime;
    }

    /** 
     * Set the 'ModificationTime' element value. ����� ���������� �������� ��������� � ���.
     * 
     * @param modificationTime
     */
    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /** 
     * Get the 'EDOC_GUID' element value. ���������� ������������� ��. ����������� �������� ����������� ���������� � ��������.
     * 
     * @return value
     */
    public String getEDOCGUID() {
        return EDOCGUID;
    }

    /** 
     * Set the 'EDOC_GUID' element value. ���������� ������������� ��. ����������� �������� ����������� ���������� � ��������.
     * 
     * @param EDOCGUID
     */
    public void setEDOCGUID(String EDOCGUID) {
        this.EDOCGUID = EDOCGUID;
    }

    /** 
     * Get the 'EDOC_ID' element value. ������������� ��������� � ������.
     * 
     * @return value
     */
    public String getEDOCID() {
        return EDOCID;
    }

    /** 
     * Set the 'EDOC_ID' element value. ������������� ��������� � ������.
     * 
     * @param EDOCID
     */
    public void setEDOCID(String EDOCID) {
        this.EDOCID = EDOCID;
    }

    /** 
     * Get the 'P_STATUS1' element value. ���������� ������ �� (1- ������������������ 2 - ����������� ��)
     * 
     * @return value
     */
    public String getPSTATUS1() {
        return PSTATUS1;
    }

    /** 
     * Set the 'P_STATUS1' element value. ���������� ������ �� (1- ������������������ 2 - ����������� ��)
     * 
     * @param PSTATUS1
     */
    public void setPSTATUS1(String PSTATUS1) {
        this.PSTATUS1 = PSTATUS1;
    }

    /** 
     * Get the 'P_STATUS2' element value. ������ ��������� (�� ���������; 1 - �������� ������� �� ��������� ���������� �� ����������� �������������)
     * 
     * @return value
     */
    public String getPSTATUS2() {
        return PSTATUS2;
    }

    /** 
     * Set the 'P_STATUS2' element value. ������ ��������� (�� ���������; 1 - �������� ������� �� ��������� ���������� �� ����������� �������������)
     * 
     * @param PSTATUS2
     */
    public void setPSTATUS2(String PSTATUS2) {
        this.PSTATUS2 = PSTATUS2;
    }
}
