
package ru.acs.fts.schemas.album.actinspectionin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID6Type;

/** 
 * ��� ����������� �������� (���������� ������)
 */
public class ActInspectionInType extends BaseDocType
{
    private String beginInspectionTime;
    private LocalDate beginInspectionDate;
    private String endInspectionTime;
    private LocalDate endInspectionDate;
    private String actType;
    private String ATDGlobalID;
    private String ATDKind;
    private LocalDate modificationDate;
    private String modificationTime;
    private String techMarkCode;
    private String customsMark;
    private String shortFormSign;
    private LocalDate endComposeDate;
    private String endComposeTime;
    private GTDID6Type ATDRegNumber;
    private InspInstructionType instructionNumber;
    private InspectionPlaceType inspectionPlace;
    private InspPersonType inspPerson;
    private InspTransportType inspTransport;
    private InspectionInfoType inspectionInfo;
    private TechOperationType ATDTechOperation;
    private String documentModeID;

    /** 
     * Get the 'BeginInspectionTime' element value. ����� ������ ����������� �������� (�������)
     * 
     * @return value
     */
    public String getBeginInspectionTime() {
        return beginInspectionTime;
    }

    /** 
     * Set the 'BeginInspectionTime' element value. ����� ������ ����������� �������� (�������)
     * 
     * @param beginInspectionTime
     */
    public void setBeginInspectionTime(String beginInspectionTime) {
        this.beginInspectionTime = beginInspectionTime;
    }

    /** 
     * Get the 'BeginInspectionDate' element value. ���� ������ ����������� �������� (�������)
     * 
     * @return value
     */
    public LocalDate getBeginInspectionDate() {
        return beginInspectionDate;
    }

    /** 
     * Set the 'BeginInspectionDate' element value. ���� ������ ����������� �������� (�������)
     * 
     * @param beginInspectionDate
     */
    public void setBeginInspectionDate(LocalDate beginInspectionDate) {
        this.beginInspectionDate = beginInspectionDate;
    }

    /** 
     * Get the 'EndInspectionTime' element value. ����� ��������� ����������� �������� (�������)
     * 
     * @return value
     */
    public String getEndInspectionTime() {
        return endInspectionTime;
    }

    /** 
     * Set the 'EndInspectionTime' element value. ����� ��������� ����������� �������� (�������)
     * 
     * @param endInspectionTime
     */
    public void setEndInspectionTime(String endInspectionTime) {
        this.endInspectionTime = endInspectionTime;
    }

    /** 
     * Get the 'EndInspectionDate' element value. ���� ��������� ����������� �������� (�������)
     * 
     * @return value
     */
    public LocalDate getEndInspectionDate() {
        return endInspectionDate;
    }

    /** 
     * Set the 'EndInspectionDate' element value. ���� ��������� ����������� �������� (�������)
     * 
     * @param endInspectionDate
     */
    public void setEndInspectionDate(LocalDate endInspectionDate) {
        this.endInspectionDate = endInspectionDate;
    }

    /** 
     * Get the 'ActType' element value. ������� ��������: 1 - �������� ���� �������, ���������� � ��, 2 - ������� ����� �������, ���������� � ��, 3 - ������� �������, ���������� � ���������� ��
     * 
     * @return value
     */
    public String getActType() {
        return actType;
    }

    /** 
     * Set the 'ActType' element value. ������� ��������: 1 - �������� ���� �������, ���������� � ��, 2 - ������� ����� �������, ���������� � ��, 3 - ������� �������, ���������� � ���������� ��
     * 
     * @param actType
     */
    public void setActType(String actType) {
        this.actType = actType;
    }

    /** 
     * Get the 'ATDGlobalID' element value. ���������� ������������� ���� ����������� ��������
     * 
     * @return value
     */
    public String getATDGlobalID() {
        return ATDGlobalID;
    }

    /** 
     * Set the 'ATDGlobalID' element value. ���������� ������������� ���� ����������� ��������
     * 
     * @param ATDGlobalID
     */
    public void setATDGlobalID(String ATDGlobalID) {
        this.ATDGlobalID = ATDGlobalID;
    }

    /** 
     * Get the 'ATDKind' element value. ������� ��������: 0 - �������; 1 - ������
     * 
     * @return value
     */
    public String getATDKind() {
        return ATDKind;
    }

    /** 
     * Set the 'ATDKind' element value. ������� ��������: 0 - �������; 1 - ������
     * 
     * @param ATDKind
     */
    public void setATDKind(String ATDKind) {
        this.ATDKind = ATDKind;
    }

    /** 
     * Get the 'ModificationDate' element value. ���� ����������� 
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. ���� ����������� 
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'ModificationTime' element value. ����� �����������
     * 
     * @return value
     */
    public String getModificationTime() {
        return modificationTime;
    }

    /** 
     * Set the 'ModificationTime' element value. ����� �����������
     * 
     * @param modificationTime
     */
    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /** 
     * Get the 'TechMarkCode' element value. ���  ������������� ��������������� �������. ��� ��������������� �������� �����������:  001- �������� ���������� ��� ; 002 - ���, ���������� ������ � ��������������� ������; 000 - � ������ ������.
     * 
     * @return value
     */
    public String getTechMarkCode() {
        return techMarkCode;
    }

    /** 
     * Set the 'TechMarkCode' element value. ���  ������������� ��������������� �������. ��� ��������������� �������� �����������:  001- �������� ���������� ��� ; 002 - ���, ���������� ������ � ��������������� ������; 000 - � ������ ������.
     * 
     * @param techMarkCode
     */
    public void setTechMarkCode(String techMarkCode) {
        this.techMarkCode = techMarkCode;
    }

    /** 
     * Get the 'CustomsMark' element value. ��������� ������� 
     * 
     * @return value
     */
    public String getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. ��������� ������� 
     * 
     * @param customsMark
     */
    public void setCustomsMark(String customsMark) {
        this.customsMark = customsMark;
    }

    /** 
     * Get the 'ShortFormSign' element value. ������� ����������� ���� � ����������� �����: 1 - ��; 0 - ���
     * 
     * @return value
     */
    public String getShortFormSign() {
        return shortFormSign;
    }

    /** 
     * Set the 'ShortFormSign' element value. ������� ����������� ���� � ����������� �����: 1 - ��; 0 - ���
     * 
     * @param shortFormSign
     */
    public void setShortFormSign(String shortFormSign) {
        this.shortFormSign = shortFormSign;
    }

    /** 
     * Get the 'EndComposeDate' element value. ���� ���������� ����������� ����
     * 
     * @return value
     */
    public LocalDate getEndComposeDate() {
        return endComposeDate;
    }

    /** 
     * Set the 'EndComposeDate' element value. ���� ���������� ����������� ����
     * 
     * @param endComposeDate
     */
    public void setEndComposeDate(LocalDate endComposeDate) {
        this.endComposeDate = endComposeDate;
    }

    /** 
     * Get the 'EndComposeTime' element value. ����� ���������� ����������� ����
     * 
     * @return value
     */
    public String getEndComposeTime() {
        return endComposeTime;
    }

    /** 
     * Set the 'EndComposeTime' element value. ����� ���������� ����������� ����
     * 
     * @param endComposeTime
     */
    public void setEndComposeTime(String endComposeTime) {
        this.endComposeTime = endComposeTime;
    }

    /** 
     * Get the 'ATDRegNumber' element value. ��������������� ����� ���� ����������� ��������
     * 
     * @return value
     */
    public GTDID6Type getATDRegNumber() {
        return ATDRegNumber;
    }

    /** 
     * Set the 'ATDRegNumber' element value. ��������������� ����� ���� ����������� ��������
     * 
     * @param ATDRegNumber
     */
    public void setATDRegNumber(GTDID6Type ATDRegNumber) {
        this.ATDRegNumber = ATDRegNumber;
    }

    /** 
     * Get the 'InstructionNumber' element value. ��������  � ��������� �� �������
     * 
     * @return value
     */
    public InspInstructionType getInstructionNumber() {
        return instructionNumber;
    }

    /** 
     * Set the 'InstructionNumber' element value. ��������  � ��������� �� �������
     * 
     * @param instructionNumber
     */
    public void setInstructionNumber(InspInstructionType instructionNumber) {
        this.instructionNumber = instructionNumber;
    }

    /** 
     * Get the 'InspectionPlace' element value. �������� ����� ���������� ��������. ���� ���������� � ����� ��������
     * 
     * @return value
     */
    public InspectionPlaceType getInspectionPlace() {
        return inspectionPlace;
    }

    /** 
     * Set the 'InspectionPlace' element value. �������� ����� ���������� ��������. ���� ���������� � ����� ��������
     * 
     * @param inspectionPlace
     */
    public void setInspectionPlace(InspectionPlaceType inspectionPlace) {
        this.inspectionPlace = inspectionPlace;
    }

    /** 
     * Get the 'InspPerson' element value. �������������� ����
     * 
     * @return value
     */
    public InspPersonType getInspPerson() {
        return inspPerson;
    }

    /** 
     * Set the 'InspPerson' element value. �������������� ����
     * 
     * @param inspPerson
     */
    public void setInspPerson(InspPersonType inspPerson) {
        this.inspPerson = inspPerson;
    }

    /** 
     * Get the 'InspTransport' element value. �������� � ������������  ���������
     * 
     * @return value
     */
    public InspTransportType getInspTransport() {
        return inspTransport;
    }

    /** 
     * Set the 'InspTransport' element value. �������� � ������������  ���������
     * 
     * @param inspTransport
     */
    public void setInspTransport(InspTransportType inspTransport) {
        this.inspTransport = inspTransport;
    }

    /** 
     * Get the 'InspectionInfo' element value. ���������� � ����������� ��������
     * 
     * @return value
     */
    public InspectionInfoType getInspectionInfo() {
        return inspectionInfo;
    }

    /** 
     * Set the 'InspectionInfo' element value. ���������� � ����������� ��������
     * 
     * @param inspectionInfo
     */
    public void setInspectionInfo(InspectionInfoType inspectionInfo) {
        this.inspectionInfo = inspectionInfo;
    }

    /** 
     * Get the 'ATDTechOperation' element value. ���������� � ��������������� ��������
     * 
     * @return value
     */
    public TechOperationType getATDTechOperation() {
        return ATDTechOperation;
    }

    /** 
     * Set the 'ATDTechOperation' element value. ���������� � ��������������� ��������
     * 
     * @param ATDTechOperation
     */
    public void setATDTechOperation(TechOperationType ATDTechOperation) {
        this.ATDTechOperation = ATDTechOperation;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
