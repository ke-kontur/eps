
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ������ �� �����������. ������� ����� ��� 31� ��. �  �������� ������������� ��������
 */
public class AutomobileBaseType
{
    private String model;
    private String mark;
    private String markCode;
    private String offtakeYear;
    private String engineVolumeQuanity;
    private String VINID;
    private String bodyID;
    private String engineID;
    private String chassisID;
    private String cabID;

    /** 
     * Get the 'Model' element value. �����, ������
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. �����, ������
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'Mark' element value. ������������ ����� � ���������
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. ������������ ����� � ���������
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'MarkCode' element value. ��� ����� 
     * 
     * @return value
     */
    public String getMarkCode() {
        return markCode;
    }

    /** 
     * Set the 'MarkCode' element value. ��� ����� 
     * 
     * @param markCode
     */
    public void setMarkCode(String markCode) {
        this.markCode = markCode;
    }

    /** 
     * Get the 'OfftakeYear' element value. ��� ������������ ������������� ��������
     * 
     * @return value
     */
    public String getOfftakeYear() {
        return offtakeYear;
    }

    /** 
     * Set the 'OfftakeYear' element value. ��� ������������ ������������� ��������
     * 
     * @param offtakeYear
     */
    public void setOfftakeYear(String offtakeYear) {
        this.offtakeYear = offtakeYear;
    }

    /** 
     * Get the 'EngineVolumeQuanity' element value. ������� ����� ���������, ���. ��
     * 
     * @return value
     */
    public String getEngineVolumeQuanity() {
        return engineVolumeQuanity;
    }

    /** 
     * Set the 'EngineVolumeQuanity' element value. ������� ����� ���������, ���. ��
     * 
     * @param engineVolumeQuanity
     */
    public void setEngineVolumeQuanity(String engineVolumeQuanity) {
        this.engineVolumeQuanity = engineVolumeQuanity;
    }

    /** 
     * Get the 'VINID' element value. ����������������� ����� (VIN)
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. ����������������� ����� (VIN)
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'BodyID' element value. ����������������� ����� ������ (�������), ����������� � ���������� �� ���  ������������-�������������
     * 
     * @return value
     */
    public String getBodyID() {
        return bodyID;
    }

    /** 
     * Set the 'BodyID' element value. ����������������� ����� ������ (�������), ����������� � ���������� �� ���  ������������-�������������
     * 
     * @param bodyID
     */
    public void setBodyID(String bodyID) {
        this.bodyID = bodyID;
    }

    /** 
     * Get the 'EngineID' element value. ����������� ������������ - ������������� ����������������� ����� ���������, ���������� �� ����� ���������. ����������������� ����� ����� �������� �� ����� ���������� ����, �� ������� ��������� ������, ��������� �� ���� ����, ��������� ��� ������� ���������
     * 
     * @return value
     */
    public String getEngineID() {
        return engineID;
    }

    /** 
     * Set the 'EngineID' element value. ����������� ������������ - ������������� ����������������� ����� ���������, ���������� �� ����� ���������. ����������������� ����� ����� �������� �� ����� ���������� ����, �� ������� ��������� ������, ��������� �� ���� ����, ��������� ��� ������� ���������
     * 
     * @param engineID
     */
    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    /** 
     * Get the 'ChassisID' element value. ����������������� ����� ����� (����), ����������� � ���������� �� ��� ������������-�������������
     * 
     * @return value
     */
    public String getChassisID() {
        return chassisID;
    }

    /** 
     * Set the 'ChassisID' element value. ����������������� ����� ����� (����), ����������� � ���������� �� ��� ������������-�������������
     * 
     * @param chassisID
     */
    public void setChassisID(String chassisID) {
        this.chassisID = chassisID;
    }

    /** 
     * Get the 'CabID' element value. ����������������� ����� ������
     * 
     * @return value
     */
    public String getCabID() {
        return cabID;
    }

    /** 
     * Set the 'CabID' element value. ����������������� ����� ������
     * 
     * @param cabID
     */
    public void setCabID(String cabID) {
        this.cabID = cabID;
    }
}
